import java.util.ArrayList;
import java.util.List;

public class MyListExample {

    public static void main(String[] args) {
        MyList myList = new MyList();
        //List<String> list = new ArrayList<>();
        //list.add("1");
        //list.add("12rtge");
        //list.add("1sge");
        //list.add("1sffwf");
        //list.add("1fwsfs");
        //list.add("wfwwsfw");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1234);
        integerList.add(1234);
        integerList.add(12341);

        List<Long> longsList = new ArrayList<>();
        longsList.add(1L);
        longsList.add(1234L);
        longsList.add(1234L);
        longsList.add(12341343546464L);

        List<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(4.5);
        list.add(34.0);

        myList.printMyList(list);
        myList.printMyList(integerList);
    }
}
