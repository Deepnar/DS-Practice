
import java.util.Scanner;

class Snode {

    Snode next;
    char ch;

    Snode(char ch) {
        this.ch = ch;
        this.next = null;
    }

}

class Slist {

    Snode head = null;

    void addNode(char ch) {
        Snode newNode = new Snode(ch);
        if (head == null) {
            head = newNode;
        } else {
            Snode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        int i = 0;
        if (head == null) {
            System.out.println("No Nodes Created");
        } else {
            Snode temp = head;
            while (temp != null) {
                System.out.println(" Index [" + i + "] : " + temp.ch);
                i++;
                temp = temp.next;
            }

        }
    }

    void insert(int pos, char ch) {
        Snode newNode = new Snode(ch);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Snode temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void delete(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            return;
        }

        Snode temp = head;
        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid position.");
            return;
        }

        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Slist list = new Slist();
        int choice;

        do {
            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Add new node end");
            System.out.println("2. Insert node at position");
            System.out.println("3. Delete node at position");
            System.out.println("4. Display list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter character to add: ");
                    char ch1 = sc.nextLine().charAt(0);
                    list.addNode(ch1);
                    break;

                case 2:
                    list.display();
                    System.out.print("Enter position to insert: ");
                    int pos1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter character to insert: ");
                    char ch2 = sc.nextLine().charAt(0);
                    list.insert(pos1, ch2);
                    break;

                case 3:
                    list.display();
                    System.out.print("Enter position to delete: ");
                    int pos2 = sc.nextInt();
                    list.delete(pos2);
                    break;

                case 4:
                    list.display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
