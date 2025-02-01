package programs.designPattern.structuralDesignPattern.adapterPattern;
/*
interface MediaPlayer {
    void play(String audioType, String fileName);
}

class Mp3Player implements MediaPlayer {
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("MP3")) {
            System.out.println("Playing MP3 file: " + fileName);
        }
    }
}

public class AdapterDesignPattern implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdapterDesignPattern(String audioType) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advancedMediaPlayer.playVlc(fileName);
        }
    }
}*/
