public abstract class Animal implements hasColor, hasMovement {
    private int age;
    private String name;

    public abstract void getGenus();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Animal() {
        this.age = 0;
        this.name = "New";
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
