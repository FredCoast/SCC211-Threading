public class Inventory {
    private int size = 0;
    public synchronized void addItem(){
        size++;
    }
    public synchronized void removeItem(){
        size--;
    }
    public synchronized int returnQuantity(){
        return size;
    }
}
