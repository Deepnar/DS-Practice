
import java.util.Scanner;

class Dnode {

    Dnode next;
    Dnode prev;
    char ch;

    Dnode(char ch) {
        this.ch = ch;
        this.next = null;
        this.prev = null;

    }
}

class Dlist {

    Dnode head = null;

    void addNode(char ch) {
        Dnode newNode = new Dnode(ch);
        if (head == null) {
            head = newNode;
        } else {
            Dnode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void display() {
        int i = 0;
        if (head == null) {
            System.out.println("No Nodes Created");
        } else {
            Dnode temp = head;
            while (temp != null) {
                System.out.println(" Index [" + i + "] : " + temp.ch);
                i++;
                temp = temp.next;
            }

        }
    }

    void insert(int pos, char ch) {
        Dnode newNode = new Dnode(ch);

        if (pos == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            return;
        }

        Dnode temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;
    }

    void delete(int pos) {
        if (head == null) {
            return;
        }

        if (pos == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Dnode temp = head;
        for (int i = 0; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dlist list = new Dlist();
        int choice;

        do {
            System.out.println("\n--- Doubly Linked List Menu ---");
            System.out.println("1. Add new node at end");
            System.out.println("2. Insert node at position");
            System.out.println("3. Delete node at position");
            System.out.println("4. Display list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

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
                    sc.nextLine(); // consume newline
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
