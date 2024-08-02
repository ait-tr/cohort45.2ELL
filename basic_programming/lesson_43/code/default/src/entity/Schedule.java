package entity;

import java.time.LocalDate;
import java.util.Objects;


public class Schedule {

    private String trainName;

    private LocalDate startDate;

    private LocalDate finishDate;

    public Schedule(String trainName, LocalDate startDate, LocalDate finishDate) {
        this.trainName = trainName;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "trainName='" + trainName + '\'' +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Schedule schedule = (Schedule) o;
        return Objects.equals(getTrainName(), schedule.getTrainName()) && Objects.equals(getStartDate(), schedule.getStartDate()) && Objects.equals(getFinishDate(), schedule.getFinishDate());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getTrainName());
        result = 31 * result + Objects.hashCode(getStartDate());
        result = 31 * result + Objects.hashCode(getFinishDate());
        return result;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }
}
