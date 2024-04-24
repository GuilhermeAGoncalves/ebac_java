package br.com.guilherme.abstractFactoryMethod;

public class Main {

    public static void main(String[] args) {
        MusicPlayerFactory spotifyFactory = new SpotifyPlayerFactory();
        MusicPlayer spotifyPlayer = spotifyFactory.createMusicPlayer();
        spotifyPlayer.play();

        MusicPlayerFactory youTubeFactory= new YouTubePlayerFactory();
        MusicPlayer youTubePlayer = youTubeFactory.createMusicPlayer();
        youTubePlayer.play();
    }
}
