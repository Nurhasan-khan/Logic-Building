package queue;

public class DynamicQueue extends CircularQueue{

    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }
    @Override
    public void enqueue(int data){
        if (isFull()){
            int []temp = new int[queue.length * 2];
            for (int i = 0; i<queue.length; i++){
                temp[i] = queue[(front + i)%queue.length];
            }
            front = 0;
            rear = queue.length-1;
            queue = temp;
        }
        super.enqueue(data);
    }
}
