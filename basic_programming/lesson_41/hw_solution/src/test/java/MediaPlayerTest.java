import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MediaPlayerTest {

    private MediaPlayer mediaPlayer;
    private AudioTrack audioTrack;
    private Video video;

    @BeforeEach
    void setUp() {
        mediaPlayer = new MediaPlayer();
        audioTrack = new AudioTrack("ABBA");
        video = new Video("КВН");
    }

    @Test
    void addTracks_addInOrder_success() {

        mediaPlayer.addTracks(audioTrack, video);

        assertTrue(mediaPlayer.getPlayList().contains(audioTrack));
        assertTrue(mediaPlayer.getPlayList().contains(video));
        assertEquals(2, mediaPlayer.getPlayList().size());
        assertEquals("ABBA",audioTrack.getName());
        assertEquals("КВН",video.getName());
        assertNotNull(mediaPlayer);
        assertNotNull(audioTrack);
        assertNotNull(video);
    }

    @Test
    void addTracks_addNullTrack_throwException_success() {

        MediaPlayer mediaPlayer = new MediaPlayer();

        assertThrows(NullPointerException.class, () -> mediaPlayer.addTracks(null));
    }


    @Test
    @Disabled("Этот тест еще не готов")
    void playAll_playOk_success() {

        mediaPlayer.addTracks(audioTrack,video);
        mediaPlayer.playAll();
    }
}