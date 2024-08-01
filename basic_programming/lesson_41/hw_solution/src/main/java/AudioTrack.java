import java.util.Objects;

/**
 * Класс, представляющий аудиотрек.
 */
public class AudioTrack implements Playable {
    private String name;

    public AudioTrack() {
    }

    public AudioTrack(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Воспроизведение аудиотрека->\n");
    }

    @Override
    public void printInfo() {
        Playable.super.printInfo();
        System.out.println("Это аудиотрек.");
    }

    @Override
    public String toString() {
        return "AudioTrack{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AudioTrack that = (AudioTrack) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
