package Task6;

public class Cats extends Animal {
    public int numClaws;

    public int getNumClaws() {
        return numClaws;
    }
    public Cats() {
        super();
        this.numClaws = 18;
    }
    public Cats(int age, String name) {
        super(age, name);
        this.numClaws = 0;
    }
    public Cats(int age, String name, int numClaws) {
        super(age, name);
        this.numClaws = numClaws;
    }

    public void getGenus() {
        System.out.println("From the genus cat. They has claws and fangs.");
    }

    public void voice() {
        System.out.println("The " + getAge() + " years old cat " + getName() + ", and he says: Meow!. He has " +
                getNumClaws() + " claws.");
    }
}
