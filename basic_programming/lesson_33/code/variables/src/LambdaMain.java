public class LambdaMain {

    public static void main(String[] args) {
        Button button = new Button() {
            @Override
            public void onClick() {
                System.out.println(1);
            }
        };

        Button a = () -> System.out.println(1);


    }


    //(x, y) -> x + y;
    //(t) -> t / 5;
    //(x, y, z) -> x + y - z / y


    //(t) -> t / 5.0;


    public static double method(int t) {
        return t / 5.0;
    }

}
