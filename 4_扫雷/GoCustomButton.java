import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoCustomButtom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoCustomButton extends Button
{
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new GameWorld(Props.rows, Props.cols, Props.bombs));
        }
    }
}
