import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
//not compatibal with mp3
import java.util.Scanner;

public class Main{
    public static void main(String[]args) throws UnsupportedAudioFileException, IOException,LineUnavailableException{

        Scanner scanner = new Scanner(System.in);

        File file = new File("drill_mix.m4a");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();

        String response =scanner.next();

    }
}