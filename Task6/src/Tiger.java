package Task6;

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
    public void voice() {
        System.out.println("The " + getAge() + " years old tiger " + getName() + ", and he says: Rrrr!. He has " +
                getNumClaws() + " claws.");
    }
}
