import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Класс медиаплеер для управления воспроизведением аудио и видео треков.
 */
public class MediaPlayer {
    private List<Playable> playList;

    public MediaPlayer() {
        playList = new ArrayList<>();
    }

    /**
     * Метод для добавления треков в плейлист.
     *
     * @param tracks треки для добавления
     */
    public void addTracks(Playable... tracks) {
        for (Playable track : tracks) {
            try {
                if (track != null) {
                    playList.add(track);
                } else {
                    throw new IllegalArgumentException("Трек не может быть null");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Метод для запуска "очереди треков"
     * Запускает воспроизведение всех треков в плейлисте, выводя информацию о каждом треке.
     */
    public void playAll() {
        for (Playable track : playList) {
            try {
                track.printInfo();
                track.play();
            } catch (Exception e){
                System.out.println("Ошибка при воспроизведении трека: " + e.getMessage());
            }

        }
    }

    @Override
    public String toString() {
        return "MediaPlayer{" +
                "playList=" + playList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediaPlayer that = (MediaPlayer) o;
        return Objects.equals(playList, that.playList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(playList);
    }

    public List<Playable> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Playable> playList) {
        this.playList = playList;
    }
}
