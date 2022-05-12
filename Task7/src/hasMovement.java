public interface HasMovement {
    void move();
    default void canFly(){
        System.out.println("They can not fly.");
    }
}
