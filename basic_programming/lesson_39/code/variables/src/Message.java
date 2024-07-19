import java.time.Instant;
import java.util.Objects;

public class Message {

    private int id;

    private Instant createTimestamp;

    public Message(int id, Instant createTimestamp) {
        this.id = id;
        this.createTimestamp = createTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;
        return id == message.id && Objects.equals(createTimestamp, message.createTimestamp);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(createTimestamp);
        return result;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", createTimestamp=" + createTimestamp +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Instant createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}
