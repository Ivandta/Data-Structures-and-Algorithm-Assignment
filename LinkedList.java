class Node {
    Item data;
    Node next;

    Node(Item data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head = null;
    private Node tail = null;

    void add(Item data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void display() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }

    void search(Item key) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(key)) {
                System.out.println(key.getName() + " is found in the inventory.");
                return;
            }
            current = current.next;
        }
        System.out.println(key.getName() + " is not found.");
    }

    void delete(Item key) {
        if (head == null) {
            System.out.println("Inventory is empty, nothing to delete.");
            return;
        }

        if (head.data.equals(key)) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            System.out.println(key.getName() + " has been deleted.");
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(key)) {
                current.next = current.next.next;
                if (current.next == null) {
                    tail = current; 
                }
                System.out.println(key.getName() + " has been deleted.");
                return;
            }
            current = current.next;
        }
        System.out.println(key.getName() + " was not found for deletion.");
    }
}