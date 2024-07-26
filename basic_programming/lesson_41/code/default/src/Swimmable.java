public interface Swimmable {

    void swim();

    default void breath() {
        System.out.println("Я дышу???");
    }

}
