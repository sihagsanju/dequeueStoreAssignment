public class DequeueStore {

    private int Size = 3;
    private Dequeue dequeue;

//    public DequeueStore(int size, Dequeue dequeue) {
//        Size = size;
//        this.dequeue = dequeue;
//    }

    public void setSizeAndDequeue(){
        System.out.println("this is the setsizedequeue  call");
        dequeue = new Dequeue(this.Size);
        String str= new String("kldfjg");
        String str1= new String("kldfjg");
        String str2= new String("kldfjg");
        dequeue.addItemFront(str);
        dequeue.addItemFront(str1);
        dequeue.addItemFront(str2);
        dequeue.removeItemFront();
        dequeue.removeItemRear();
        dequeue.removeItemFront();
        dequeue.removeItemFront();
    }

}
