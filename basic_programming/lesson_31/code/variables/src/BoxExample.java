import java.util.ArrayList;
import java.util.HashMap;

public class BoxExample {

    public static void main(String[] args) {

        Box<String> box = new Box<>();
        box.setObject("234");
        String str = box.getObject();
        System.out.println(str);

        Box<Integer> boxSecond = new Box<>();
        boxSecond.setObject(1);
        Integer integer = boxSecond.getObject();
        System.out.println(integer);


    }
}
