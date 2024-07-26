public class Person implements Swimmable, Runnable {

    @Override
    public void swim() {
        System.out.println("Я плыву");
    }

    @Override
    public void breath() {
        Swimmable.super.breath();
    }

    @Override
    public void run() {
        System.out.println("Я бегу");
    }
}
