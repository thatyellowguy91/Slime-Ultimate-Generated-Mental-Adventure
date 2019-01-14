import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class More here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class More extends Actor
{
    /**
     * Act - do whatever the More wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void more() 
    {
       if (Greenfoot.mouseClicked(this)) 
            getWorld().addObject(new JellyBlock(),300,200);       
    }
}
