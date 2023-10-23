public class removeOperation implements Runnable{
    private Inventory inventory;

    public removeOperation(Inventory inventory){
        this.inventory = inventory;
    }
    public void run(){
        inventory.removeItem();
        System.out.println("Removed. Inventory size = " + inventory.returnQuantity());
    }

}
