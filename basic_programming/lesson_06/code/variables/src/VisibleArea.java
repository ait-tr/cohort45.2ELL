public class VisibleArea {

    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        if (0 == 0) {

            System.out.println(a);
            System.out.println(b);
        }
        else {
            System.out.println(b);
            int e = 100;
            if (0 == 0) {
                int d = 100;
            }
            //System.out.println(d);
        }


        int c = 45;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (0 == 0 ) {
            if (0 == 0) {
                if (0 == 0) {
                    int y = 10;
                    System.out.println(y); //+
                }
                //System.out.println(y); //-
            }
            System.out.println(); //-
        }












    }
}
