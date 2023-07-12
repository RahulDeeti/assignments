class Gerbil extends Rodent {
    public Gerbil() {
        System.out.println("This is a Gerbil.");
    }

    @Override
    public void makeSound() {
        System.out.println("Gerbil chatters.");
    }

    @Override
    public void performAction() {
        System.out.println("Gerbil burrows into the ground.");
    }
}
