public class Tiger extends Cats {
    public Tiger(int age, String name, int numClaws) {
        super(age, name, numClaws);
    }

    public Tiger(int age, String name) {
        super(age, name);
    }

    public Tiger() {
        super();
    }

    public void move() {
        System.out.println("They can run, jump, swim and climb.");
    }

    public void hasColor() {
        System.out.println("The color is not bright, masking. Usually orange with black strips.");
    }

    public void voice() {
        System.out.println("The " + getAge() + " years old tiger " + getName() + ", and he says: Rrrr!. He has " +
                getNumClaws() + " claws.");
    }
}
