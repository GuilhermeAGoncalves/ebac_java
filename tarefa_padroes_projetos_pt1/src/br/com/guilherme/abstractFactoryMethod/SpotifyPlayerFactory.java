package br.com.guilherme.abstractFactoryMethod;

public class SpotifyPlayerFactory implements  MusicPlayerFactory{
    @Override
    public MusicPlayer createMusicPlayer() {
        return new SpotifyPlayer();
    }
}
