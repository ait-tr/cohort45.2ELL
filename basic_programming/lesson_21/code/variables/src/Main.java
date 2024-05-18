import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Swimmable a = new Dog();


        Swimmable b = new Pig();
        Person person = new Person();

        Pool pool = new Pool();
        pool.goSwimming(a);
        pool.goSwimming(b);
        pool.goSwimming(person);


    }
}
