public class removeOperation implements Runnable{
    //Creates a varibable to hold the inventory
    private Inventory inventory;
    //Creates a method to parse the inventory as a paremeter into the class
    public removeOperation(Inventory inventory){
        this.inventory = inventory;
    }
    //Creates a method for the thread
    public void run(){
        //Calls the decrement method
        inventory.removeItem();
        //Outputs the total with the text
        System.out.println("Removed. Inventory size = " + inventory.returnQuantity());
    }

}
