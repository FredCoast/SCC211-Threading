public class addOperation implements Runnable{
    //Intitialises a varibel to the inventory type
    private Inventory inventory;
    //Creates a method which stores the inventory to the variable
    public addOperation(Inventory inventory){
        this.inventory = inventory;
    }
    //Creates the thread
    public void run(){
        //Calls the increment method
        inventory.addItem();
        //Outputs the text with the total
        System.out.println("Added. Inventory size = " + inventory.returnQuantity());
    }

}