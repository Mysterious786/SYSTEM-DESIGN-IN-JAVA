package InterfaceSegmented;

public class VLCMediaPlayer implements AudioMediaPlayer, VideMediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("Playing Audio");

    }

    @Override
    public void playVideo() {
        System.out.println("Playig Video");

    }
}
