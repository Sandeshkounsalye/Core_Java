package Multithreading.Demo;

public class MusicDemo {
    public static void main(String[] args) {
        MusicServiceImpl ms=()-> System.out.println("playing Music by lambda ---- ");
        ms.playMusic();
        acceptMusicService(()-> System.out.println("playing Music by lambda ---- "));

    }
   private static void acceptMusicService(MusicServiceImpl musicServiceimpl) {
       musicServiceimpl.playMusic();
     }
}
