package br.com.guilherme.abstractFactoryMethod;

public class YouTubePlayerFactory implements MusicPlayerFactory{
    @Override
    public MusicPlayer createMusicPlayer() {
        return new YouTubePlayer();
    }
}
