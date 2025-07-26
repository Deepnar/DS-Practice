
import java.util.Scanner;

class queue3 {

    int size;
    char st[];
    int front;
    int rear;

    queue3(int size) {
        this.size = size;
        front = 0;
        rear = -1;
        st = new char[size];
    }

    boolean isEmpty() {
        return front > rear;
    }

    boolean isFull() {
        return rear == size - 1;
    }

    void nQueue(char ch) {
        if (isFull()) {
            System.out.println("Overflow. The Queue is full");
        } else {
            rear++;
            st[rear] = ch;
        }

    }

    void dQueue() {
        if (isEmpty()) {
            System.out.println("Underflow. The Queue is empty");
        } else {
            System.out.println("Dequeued: " + st[front]);
            front++;

            if (front > rear) {
                front = 0;
                rear = -1;
            }
        }
    }

    void size() {
        if (isEmpty()) {
            System.out.println("The size of the Queue is 0");
        } else {
            System.out.println("The size of the Queue is " + (rear - front + 1));
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("The elements in the Queue are:");
        for (int i = front; i <= rear; i++) {
            System.out.println(st[i]);
        }
    }

    public static void main(String[] args) {
        int s;
        System.out.println("Enter size of queue ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        queue3 obj = new queue3(s);
        while (true) {
            System.out.println("\n==== Main Menu ====");
            System.out.println("1. Inset Char to Queue");
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
                    System.out.println("Enter a char to push into the stack");
                    String input = sc.next();
                    char ch = input.charAt(0);
                    obj.nQueue(ch);
                    ;
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
