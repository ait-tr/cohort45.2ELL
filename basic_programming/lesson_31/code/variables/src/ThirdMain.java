import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThirdMain {

    public static void main(String[] args) {
        List listOnlyForIntegers = new ArrayList(); //пожалуйста, сюда кладите только числа
        //<String>
        //<Integer>



        listOnlyForIntegers.add(1);
        listOnlyForIntegers.add(2);
        listOnlyForIntegers.add(4);
        listOnlyForIntegers.add(8);


        for (Object object : listOnlyForIntegers) {
            //явное приведение
            Integer integer = (Integer) object;
            System.out.println(integer + 1);
        }
    }
}
