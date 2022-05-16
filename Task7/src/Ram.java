public class Ram extends Ungulates {
    public Ram(int age, String name, int numHorns) {
        super(age, name, numHorns);
    }

    public Ram(int age, String name) {
        super(age, name);
    }

    public Ram() {
        super();
    }

    public void move() {
        System.out.println("They can run, jump, swim and beat horns.");
    }

    public void hasColor() {
        System.out.println("The color is not bright, monotonous. Usually white or black.");
    }

    public void voice() {
        System.out.println("The " + getAge() + " years old ram " + getName() + ", and he says: Beee!. He has " +
                getNumHorns() + " horns.");
    }
}