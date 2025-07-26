
import java.util.Scanner;

class stack2 {

    int cap;
    char st[];
    int top;

    stack2(int max) {
        cap = max;
        top = -1;
        st = new char[cap];
    }

    void push(char ch) {
        if (top == cap - 1) {
            System.out.println("Overflow");
        } else {
            top++;
            st[top] = ch;
        }

    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("The poped out element is:");
            System.out.println(st[top]);
            top--;
        }
    }

    void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack has elements");
        }
    }

    void isfull() {
        if (top == cap - 1) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack has space");
        }

    }

    void peek() {
        System.out.println("The element at the top of the stack is");
        System.out.println(st[top]);
    }

    void display() {
        System.out.println("The elements in the stack are");
        for (int i = 0; i <= top; i++) {
            System.out.println(st[i]);
        }
    }

    public static void main(String[] args) {
        int size;
        System.out.println("Enter size of stack ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        stack2 obj = new stack2(size);
        while (true) {
            System.out.println("\n==== Main Menu ====");
            System.out.println("1. Push Char to stack");
            System.out.println("2. Pop Char from Stack ");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Check if Stack is Full");
            System.out.println("5. Peek to the Top value");
            System.out.println("6. Display all elements");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: \n");
            int choice = sc.nextInt();
            if (choice == 7) {
                System.out.println("Exiting Stack Program!!");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter a char to push into the stack");
                    String input = sc.next();
                    char ch = input.charAt(0);
                    obj.push(ch);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.isEmpty();
                    break;
                case 4:
                    obj.isfull();
                    break;
                case 5:
                    obj.peek();
                    break;
                case 6:
                    obj.display();
                    break;
                default:
                    System.out.println("Enter a correct input");

            }
        }
    }
}
