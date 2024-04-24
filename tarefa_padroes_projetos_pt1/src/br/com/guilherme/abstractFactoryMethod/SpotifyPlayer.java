package br.com.guilherme.abstractFactoryMethod;

public class SpotifyPlayer implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Tocando musica no spotify");
    }
}
