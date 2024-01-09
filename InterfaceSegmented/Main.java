package InterfaceSegmented;

public class Main {
    public static void main(String[] args) {
        WimpAmPlayer ad = new WimpAmPlayer();
        VLCMediaPlayer vlc = new VLCMediaPlayer();
        vlc.playAudio();
        vlc.playVideo();
        ad.playAudio();
    }
}
