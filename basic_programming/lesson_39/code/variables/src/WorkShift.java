import java.time.LocalTime;
import java.util.Objects;

//lombok
public class WorkShift {

    private LocalTime start;

    private LocalTime finish;

    public WorkShift(LocalTime start, LocalTime finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkShift workShift = (WorkShift) o;
        return Objects.equals(start, workShift.start) && Objects.equals(finish, workShift.finish);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(start);
        result = 31 * result + Objects.hashCode(finish);
        return result;
    }

    @Override
    public String toString() {
        return "WorkShift{" +
                "start=" + start +
                ", finish=" + finish +
                '}';
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getFinish() {
        return finish;
    }

    public void setFinish(LocalTime finish) {
        this.finish = finish;
    }
}
