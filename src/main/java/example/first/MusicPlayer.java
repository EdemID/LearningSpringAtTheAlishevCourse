package example.first;

/**
 * В этом классе применена архитектура IoC
 */
public class MusicPlayer {

    private Music music;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
    // IoC - здесь внедрена зависимость
    public void setMusic(Music music) {
        this.music = music;
    }

}
