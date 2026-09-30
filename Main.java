public class Main {
    public static void main(String[] args) {
        LinkedList inventory = new LinkedList();

        inventory.add(new Book("Hujan", "Tere Liye"));
        inventory.add(new Laptop("ThinkPad T14", 16));
        inventory.add(new Laptop("MacBook Pro", 32));
        inventory.add(new Book("Bumi", "Tere Liye"));

        System.out.println("=== INVENTORY CONTENTS ===");
        inventory.display();

        System.out.println("\n=== SEARCH TEST ===");
        inventory.search(new Laptop("ThinkPad T14"));
        inventory.search(new Book("Bintang"));

        System.out.println("\n=== DELETION TEST ===");
        inventory.delete(new Laptop("MacBook Pro"));
        
        System.out.println("\n=== INVENTORY AFTER DELETION ===");
        inventory.display();
    }
}