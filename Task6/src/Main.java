package Task6;

public class Main {
    public static void main(String[] args) {
        Ram r = new Ram(5, "Rully", 2);
        Tiger t = new Tiger(10, "Apple", 15);
        Ram r1 = new Ram(12, "Jack");
        Tiger t1 = new Tiger(1, "Nicko");
        Ram r2 = new Ram();
        Tiger t2 = new Tiger();
        r.family();
        r.voice();
        t.family();
        t.voice();
        r1.family();
        r1.voice();
        t1.family();
        t1.voice();
        r2.family();
        r2.voice();
        t2.family();
        t2.voice();
    }
}
