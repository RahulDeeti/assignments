abstract class Rodent {
    public Rodent() {
        System.out.println("This is a Rodent.");
    }

    public abstract void makeSound();
    public abstract void performAction();
}
 class Main {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        for (Rodent rodent : rodents) {
            rodent.makeSound();
            rodent.performAction();
            System.out.println();
        }
    }
}
