import java.util.Objects;

/**
 * Класс, представляющий видеотрек.
 */
public class Video implements Playable {
    private String name;

    public Video() {
    }

    public Video(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Воспроизведение видео->\n");
    }

    @Override
    public void printInfo() {
        Playable.super.printInfo();
        System.out.println("Это видеотрек.");
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(name, video.name);
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
