class Laptop extends Item {
    private int ram; 

    Laptop(String name, int ram) {
        super(name);
        this.ram = ram;
    }

    Laptop(String name) {
        super(name);
        this.ram = 0;
    }

    @Override
    public String toString() {
        return "IT Device: Laptop " + getName() + " [RAM: " + ram + "GB]";
    }
}