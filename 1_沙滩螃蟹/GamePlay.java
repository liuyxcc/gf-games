import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GamePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GamePlay extends GameUI {
    /**
     * Act - do whatever the GamePlay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            getWorld().removeObject(this);
            CrabWorld.isStart = true;
        }
    }
}
