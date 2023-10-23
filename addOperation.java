public class addOperation implements Runnable{
    private Inventory inventory;

    public addOperation(Inventory inventory){
        this.inventory = inventory;
    }
    public void run(){
        inventory.addItem();
        System.out.println("Added. Inventory size = " + inventory.returnQuantity());
    }

}