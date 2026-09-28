public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Linked List:");
        list.display();

        System.out.println("Number of nodes: " + list.size());

        // Search for data
        System.out.println("Is 30 found? " + list.search(30));
        System.out.println("Is 50 found? " + list.search(50));

        // Remove the first node
        list.removeFirst();

        System.out.println("\nAfter removeFirst:");
        list.display();

        // Remove the last node
        list.removeLast();

        System.out.println("After removeLast:");
        list.display();
    }
}