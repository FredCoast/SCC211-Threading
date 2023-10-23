public class InventoryMain{
    public static void main(String[] args){
        //Gets the values via the command line
        int toAdd = Integer.parseInt(args[0]);
        int toRemove = Integer.parseInt(args[1]);
        //Initialises a new inventory
        Inventory inventory = new Inventory();
        //Starts an add loop
        for(int i = 0;i<toAdd;i++){
            //Creates a tread for the add operations
            Thread addThread = new Thread(new addOperation(inventory));
            //Starts said thread
            addThread.start();
            try{
                //Ends the thread
                addThread.join();
            }catch(InterruptedException e){
                //Throws an error if one occurs
                e.printStackTrace();
            }
        }
        //Starts the remove lood
        for(int i =0; i<toRemove;i++){
            //Creates a thread for the remove operations
            Thread removeThread = new Thread(new removeOperation(inventory));
            //Starts said thread
            removeThread.start();
            try{
                //Ends the thread
                removeThread.join();
            }catch(InterruptedException e){
                //Throws the error if one occurs
                e.printStackTrace();
            }
        }
        //Outputs the final value
        System.out.println("Final Inventory Size = "+inventory.returnQuantity());
    }
}