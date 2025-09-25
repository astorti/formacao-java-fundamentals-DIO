package ProgramacaoOrientadaObjetos.Interfaces.Interface;

public class Main {

    public static void main(String[] args) {
        
        runMusic(new Computer());
        runVideo(new Smartphone());
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }
}
