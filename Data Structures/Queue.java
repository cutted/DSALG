public class Queue {

    // Data Structures & Algorithms in Java | Sixth Edition | Goodrich, Tamassia & Goldwasser

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(8);
        q.enqueue(2);
        System.out.println(q.size());
        System.out.println(q.head());
        System.out.println(q.dequeue());
        System.out.println(q.size());
        System.out.println(q.enqueue(10));
        System.out.println(q.isEmpty());
    }

    static final int max = 1000; // queue size
    static int head, tail = 0;
    static int size = 0;
    static int data[] = new int[max];

    public boolean isEmpty(){
        return (size == 0);
    }
    public boolean isFull(){
        return (size == max);
    }
    public int size(){
        return size;
    }

    public String enqueue(int value){
        if(isFull()){
            return "Queue is full";
        }
        int newIndex = (tail + size) % data.length; // new index of next opening
        data[newIndex] = value;
        size++;
        return value + " enqueued to queue";
    }

    public String dequeue(){
        if(isEmpty()){
            return "Queue is empty";
        }
        int value = data[head];
        head = (head + 1) % data.length; // advance the front index
        size--;
        return value + " dequeued from queue";
    }

    public String head(){
        if(isEmpty()){
            return "Queue is empty";
        }
        return data[head] + " is head of the queue";
    }

    public String tail(){
        if(isEmpty()){
            return "Queue is empty";
        }
        return data[tail] + " is head of the queue";
    }
}
