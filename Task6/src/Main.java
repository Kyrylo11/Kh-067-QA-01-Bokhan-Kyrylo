package Task6;

public class Main {
    public static void main(String[] args) {
        Ram r = new Ram(5, "Rully", 2);
        Tiger t = new Tiger(10, "Apple", 15);
        Ram r1 = new Ram(12, "Jack");
        Tiger t1 = new Tiger(1, "Nicko");
        Ram r2 = new Ram();
        Tiger t2 = new Tiger();
        r.getGenus();
        r.voice();
        t.getGenus();
        t.voice();
        r1.getGenus();
        r1.voice();
        t1.getGenus();
        t1.voice();
        r2.getGenus();
        r2.voice();
        t2.getGenus();
        t2.voice();
    }
}
