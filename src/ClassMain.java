

public class ClassMain {
    public static void main(String[] arg) {
        PopMusic MichaelJackson = new PopMusic();

        RockMusic Sinderella = new RockMusic();

        ClassicMusic Beethoven = new ClassicMusic();



        MusicStyles[] a = {MichaelJackson, Sinderella, Beethoven};
        MusicStyles objectMusic;

        for (MusicStyles x :a) {
            objectMusic=x;
        objectMusic.PlayMusic();
        }


    }


}

