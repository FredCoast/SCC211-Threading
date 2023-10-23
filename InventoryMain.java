public class InventoryMain{
    public static void main(String[] args){
        int toAdd = Integer.parseInt(args[0]);
        int toRemove = Integer.parseInt(args[1]);

        Inventory inventory = new Inventory();

        for(int i = 0;i<toAdd;i++){
            Thread addThread = new Thread(new addOperation(inventory));
            addThread.start();
            try{
                addThread.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        for(int i =0; i<toRemove;i++){
            Thread removeThread = new Thread(new removeOperation(inventory));
            removeThread.start();
            try{
                removeThread.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Final Inventory Size = "+inventory.returnQuantity());
    }
}