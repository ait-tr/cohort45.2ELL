package hello;

public class Calculator {

    public int calculate() {
        try {
            return calculateInternal();
        }
        catch (MyException e) {
            System.out.println("мы обработали все");
        }

        return 0;
    }


    private int calculateInternal() throws MyException {
        int count = 0;

        for (int i = 0; i < 100; i++) {
            count += i;
            if (count == 1000) {
                throw new MyException();
            }
        }

        return count;
    }
}
