import java.util.Calendar;
import java.util.Date;

public class DateMain {

    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(1721321144802L);
        Date date2 = new Date(70, Calendar.APRIL, 24);
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println();

        //TODO сейчас выпустим это, а потом я напишу нормальный код

    }
}
