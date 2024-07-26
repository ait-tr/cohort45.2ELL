public interface Runnable {

    void run();

    default void breath() {
        System.out.println("Я дышу!!!");
    }


}
