public class Stack {

    // Data Structures & Algorithms in Java | Sixth Edition | Goodrich, Tamassia & Goldwasser

    public static void main(String[] args) {
        Stack s = new Stack();              // contents:()
        s.push(5);                     // contents:(5)
        s.push(3);                     // contents:(5,3)
        System.out.println(s.size());       // contents:(5,3)   outputs 2
        System.out.println(s.pop());        // contents:(5)     removes 3
        System.out.println(s.isEmpty());    // contents:(5)     false as not empty
        System.out.println(s.pop());        // contents:()      outputs 5
        System.out.println(s.isEmpty());    // contents:()      true as it is empty
        System.out.println(s.pop());        // contents:()      Stack empty
        s.push(7);                     // contents:(7)
        s.push(9);                     // contents:(7,9)
        System.out.println(s.top());        // contents:(7,9)   outputs 9
        s.push(4);                     // contents:(7,9,4)
        System.out.println(s.size());       // contents:(7,9,4) outputs 3
        System.out.println(s.pop());        // contents:(7,9)
        s.push(6);                     // contents:(7,9,6)
        s.push(8);                     // contents:(7,9,6,8)
        System.out.println(s.pop());        // contents:(7,9,6) outputs 8
    }

    static final int max = 1000; // stack size
    static int head = -1;
    static int data[] = new int[max];

    public boolean isEmpty() {
        return (head == -1);
    }

    public int size(){
        return (head + 1);
    }

    public String push(int value) {
        if (size() == max) {
            return "Stack is full";
        }
        data[++head] = value;
        return value + " pushed into stack";
    }

    public String pop() {
        if (isEmpty()) {
            return "Stack is empty";
        }
        int value = data[head--];
        return value + " removed from stack";
    }

    public String top() {
        if (isEmpty()) {
            return "Stack is empty";
        }
        int value = data[head];
        return value + " is at the top of stack";
    }
}
