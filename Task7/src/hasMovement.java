public interface hasMovement {
    void Movement();
    default void canFly(){
        System.out.println("They can not fly.");
    }
}
