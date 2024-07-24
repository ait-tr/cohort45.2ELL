import java.time.LocalDateTime;
import java.util.Objects;

public class Meeting {
    private String firstParticipant;
    private String secondParticipant;
    private LocalDateTime startDateTime;

    public Meeting(String firstParticipant, String secondParticipant, LocalDateTime startDateTime) {
        this.firstParticipant = firstParticipant;
        this.secondParticipant = secondParticipant;
        this.startDateTime = startDateTime;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "firstParticipant='" + firstParticipant + '\'' +
                ", secondParticipant='" + secondParticipant + '\'' +
                ", startDateTime=" + startDateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meeting meeting = (Meeting) o;
        return Objects.equals(firstParticipant, meeting.firstParticipant)
                && Objects.equals(secondParticipant, meeting.secondParticipant)
                && Objects.equals(startDateTime, meeting.startDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstParticipant, secondParticipant, startDateTime);
    }

    public String getFirstParticipant() {
        return firstParticipant;
    }

    public void setFirstParticipant(String firstParticipant) {
        this.firstParticipant = firstParticipant;
    }

    public String getSecondParticipant() {
        return secondParticipant;
    }

    public void setSecondParticipant(String secondParticipant) {
        this.secondParticipant = secondParticipant;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }
}
