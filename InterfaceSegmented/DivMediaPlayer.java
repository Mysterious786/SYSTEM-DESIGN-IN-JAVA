package InterfaceSegmented;

public class DivMediaPlayer implements AudioMediaPlayer, VideMediaPlayer {
    @Override
    public void playVideo() {
        System.out.println("Playing Audio");

    }

    @Override
    public void playAudio() {
        System.out.println("Playing Video");

    }

}
