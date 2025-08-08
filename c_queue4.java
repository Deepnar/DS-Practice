
import java.util.Scanner;

class c_queue4 {

    int size;
    char st[];
    int front;
    int rear;

    c_queue4(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        st = new char[size];
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return (front == 0 && rear == size - 1) || (rear + 1 == front);
    }

    void nQueue(char ch) {
        if (isFull()) {
            System.out.println("Overflow. The Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            if (rear == size - 1) {
                rear = 0;
            } else {
                rear++;
            }
        }
        st[rear] = ch;

    }

    void dQueue() {
        if (isEmpty()) {
            System.out.println("Underflow. The Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + st[front]);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }

    }

    void size() {
        if (isEmpty()) {
            System.out.println("The size of the Queue is 0");
        } else if (rear >= front) {
            System.out.println("The size of the Queue is " + (rear - front + 1));
        } else {
            System.out.println("The size of the Queue is " + (size - front + rear + 1));
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("The elements in the Queue are:");
        if (rear >= front) {
            for (int i = front; i <= rear; i++) {
                System.out.println(st[i]);
            }
        } else {

            for (int i = 0; i <= rear; i++) {
                System.out.println(st[i]);
            }
            for (int i = front; i <= size - 1; i++) {
                System.out.println(st[i]);
            }
        }

    }

    public static void main(String[] args) {
        int s;
        System.out.println("Enter size of queue ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        c_queue4 obj = new c_queue4(s);
        while (true) {
            System.out.println("\n==== Main Menu ====");
            System.out.println("1. Insert Char to Queue");
            System.out.println("2. Delete Char from Queue ");
            System.out.println("3. Check size of Queue");
            System.out.println("4. Display all elements");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: \n");
            int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Exiting Queue Program!!");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter a char to nqueue into the queue");
                    String input = sc.next();
                    char ch = input.charAt(0);
                    obj.nQueue(ch);
                    break;
                case 2:
                    obj.dQueue();
                    break;
                case 3:
                    obj.size();
                    break;
                case 4:
                    obj.display();
                    break;
                default:
                    System.out.println("Enter a correct input");

            }
        }
    }

}
