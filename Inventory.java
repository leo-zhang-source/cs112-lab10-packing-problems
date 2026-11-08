import java.util.List;

public class Inventory<T extends Supplies> {
    private T item;

    public Inventory() {
        item = null;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public int searchByName(List<T> list, String name) {
        for (T item : list) {
            if (item.getName().equalsIgnoreCase(name)) {
                return list.indexOf(item);
            }
        }
        return -1;
    }

    public T checkQty(List<T> list, int desiredQuantity, String name) {
        int index = searchByName(list, name);
        if (index == -1) {
            System.out.println("Item not found: " + name);
            return null;
        }
        T item = list.get(index);
        if (item.getQuantity() == desiredQuantity) {
            System.out.println("Quantity already matches for " + name + ".");
        } else {
            item.setQuantity(desiredQuantity);
            System.out.println("Quantity updated for " + name + ".");
        }
        return item;
    }

	/*     STEP 3 
	*        
	*      Create this bounded type generic class with everything you 
	*      would expect in a class (instance variable, constructor,
	*      get/set methods) and then make two additional generic methods:
	*
	*      Go to Transfer.java for STEP 4
	*/

	/*     STEP 5
	*
	*      Create a method called searchByName() that takes two parameters:
	*          - The input List<T> of generic type T
	*          - A String "name" that we will use to search in the input List
	*
	*      This method should iterate through all the objects in our List
	*      and use the getName() method of Supplies to compare against the
	*      input String "name", use the indexOf() method to return the 
	*      index. If no match is found, return -1. 
	*/


	/*     STEP 7:
	* 
	*      Create a method called checkQty() that takes three parameters:
	*           - The input List<T>
	*           - The String name of the object we want to check
	*           - The int desiredQuantity that we want to check/change for 
	*             the item
	*           
	*      Use our method searchByName() to be able to get the index of 
	*      the object we are looking for and use the index to access the 
	*      object within the List<T>. If the object is not found, or if
	*      our searchByName() method returns -1, return null.
	*
	*      Once our object is found, check the quantity via the .get() 
	*      method from the List class and by using the .getQuantity()
	*      from the Supplies class. Compare the value with the parameter 
	*      desiredQuantity, if they match then return the object as-is
	*      and notify user that the quantity matches. If it does not 
	*      match the quantity in the list, then update using .setQuantity
	*      and return the object with the new quantity.
	*/

}
