package ru.dementev.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        /*Music music = context.getBean( "rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music1 = context.getBean("classicMusic", Music.class);

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music1);
        classicalMusicPlayer.playMusic();
*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();


        context.close();
    }
}
