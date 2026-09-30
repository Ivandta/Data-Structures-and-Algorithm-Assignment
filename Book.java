class Book extends Item {
    private String author;

    Book(String name, String author) {
        super(name);
        this.author = author;
    }

    // Constructor for search and deletion keys
    Book(String name) {
        super(name);
        this.author = "Unknown";
    }

    @Override
    public String toString() {
        return "Book: " + getName() + " (by " + author + ")";
    }
}