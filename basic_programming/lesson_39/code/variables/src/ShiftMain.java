import java.time.LocalTime;

public class ShiftMain {

    public static void main(String[] args) {
        WorkShift workShift = new WorkShift(LocalTime.of(10, 0), LocalTime.of(22, 0));
        System.out.println(workShift);
    }
}
