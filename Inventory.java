public class Inventory {
    //Initialises the amount that is being stored
    private int total = 0;
    //Creates a synchronized method to increment the total
    public synchronized void addItem(){
        //Increments the total
        total++;
    }
    public synchronized void removeItem(){
        //Decrements the total
        total--;
    }
    public synchronized int returnQuantity(){
        //Returns the total
        return total;
    }
}
