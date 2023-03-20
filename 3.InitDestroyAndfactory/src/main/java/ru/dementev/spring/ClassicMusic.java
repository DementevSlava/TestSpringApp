package ru.dementev.spring;

public class ClassicMusic implements Music{
    public void doMyInit(){
        System.out.println("Do my initialization");
    }

    public void  doMyDestroy(){
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungrian Phapsody";
    }
}
