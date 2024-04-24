package br.com.guilherme.abstractFactoryMethod;

public class YouTubePlayer implements MusicPlayer{
    @Override
    public void play() {
        System.out.println("Tocando música no Youtube");
    }
}
