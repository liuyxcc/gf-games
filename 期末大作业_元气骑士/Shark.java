import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Enemy {
    
    public static int HP = 20; // 小怪生命值
    
    private static GifImage gif = new GifImage("enemy/shark.gif");
    private static int moveBufferTime = 30;
    private static int attack = 1;
    
    public Shark() {
        super(gif, moveBufferTime, HP, attack);
    }
}