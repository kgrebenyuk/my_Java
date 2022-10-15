package HW18;

public class Main {
    public static void main(String[] args) {

        ClassicMusic bandClassic = new ClassicMusic();
        PopMusic bandPop = new PopMusic();
        RockMusic bandRock = new RockMusic();

        //  MusicStyles[] bands = {new ClassicMusic(),new PopMusic(),new RockMusic()}; // variant without names :)
        MusicStyles[] bands = {bandClassic, bandPop, bandRock};

        for (MusicStyles band : bands) {
            band.playMusic();
        }
    }
}
