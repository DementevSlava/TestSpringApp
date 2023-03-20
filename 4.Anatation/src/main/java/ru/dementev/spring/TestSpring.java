package ru.dementev.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicMusic classicMusic1 = context.getBean("classicMusic", ClassicMusic.class);
       // ClassicMusic classicMusic2 = context.getBean("classicMusic", ClassicMusic.class);


        context.close();
    }
}
