package hello;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            method();
        }
        catch (MyException e) {
            System.out.println("обработалось");
        }
    }

    public static void method() throws MyException {
        throw new MyException();
    }
}
