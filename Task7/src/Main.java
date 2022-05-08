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
        r.Сolor();
        r.Movement();
        r.canFly();
        t.getGenus();
        t.voice();
        t.Сolor();
        t.Movement();
        t.canFly();
        r1.getGenus();
        r1.voice();
        r1.Сolor();
        r1.Movement();
        r1.canFly();
        t1.getGenus();
        t1.voice();
        t1.Сolor();
        t1.Movement();
        t1.canFly();
        r2.getGenus();
        r2.voice();
        r2.Сolor();
        r2.Movement();
        r2.canFly();
        t2.getGenus();
        t2.voice();
        t2.Сolor();
        t2.Movement();
        t2.canFly();
        System.out.printf("Max number of colors is %s.", hasColor.maxColors);
    }
}
