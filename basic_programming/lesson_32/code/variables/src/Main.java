import java.util.List;

public class Main {

    public static void main(String[] args) {
        Button cancelButton = new CancelButton();
        Button okButton = new OkButton();





        for (int i = 0; i < 100; i++) {
            int b = i;
            Button newButton = new Button() {
                @Override
                public void onClick() {
                    System.out.println(b);
                }
            };
        }


        int a = 5;

        Button newButton = new Button() {
            @Override
            public void onClick() {
                System.out.println(a);
            }
        };

        newButton.onClick();
        System.out.println(a);






        //okButton.onClick();
        //cancelButton.onClick();
        //newButton.onClick();
//
        //System.out.println(okButton.getClass());
        //System.out.println(cancelButton.getClass());
        //System.out.println(newButton.getClass());

    }
}
