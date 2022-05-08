public class Ungulates extends Animal implements hasColor, hasMovement {
    public int numHorns;

    public int getNumHorns() {
        return numHorns;
    }

    public Ungulates() {
        super();
        this.numHorns = 2;
    }

    public Ungulates(int age, String name) {
        super(age, name);
        this.numHorns = 0;
    }

    public Ungulates(int age, String name, int numHorns) {
        super(age, name);
        this.numHorns = numHorns;
    }

    public void getGenus() {
        System.out.println("From the genus ungulates. They have horns and hooves.");
    }

    public void Movement() {
        System.out.println("They can run, jump and swim.");
    }

    public void Сolor() {
        System.out.println("The color is not bright, monotonous.");
    }

    public void voice() {
        System.out.println("The " + getAge() + " years old ungulate " + getName() + ", and he says: Meee!. He has " +
                getNumHorns() + " horns.");
    }
}
