import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class SlimeLand here.
 * 
 * @author (John Park, Jordan Hanna and Lawrence Huang) 
 * @version (8.00.81.35)
 */
public class SlimeLand  extends World
{

    public boolean isGround = false;
    GreenfootImage background = new GreenfootImage("background1.png");
    GreenfootImage mask = new GreenfootImage("mask1.png");

    /**
     * Constructor for objects of class JellyWorld.
     * 
     */
    public SlimeLand()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 

        addObject(new JellyBlock(), 300, 200);
        addObject(new More(),500, 350);
    }
    
    public void act()
    {
        setBackground(background);
    }
    
    public void isGround(int a, int b, int c, int d)
    {
        if(d<398 && b<398)
        {
            if(
            mask.getColorAt(c,d+2).equals(new Color(0,0,0)) ||
            mask.getColorAt(a,b+2).equals(new Color(0,0,0)) ||
            mask.getColorAt(a,d+2).equals(new Color(0,0,0)) ||
            mask.getColorAt(c,b+2).equals(new Color(0,0,0)) ||
            mask.getColorAt(b,d+2).equals(new Color(0,0,0)) ||
            mask.getColorAt(d,b+2).equals(new Color(0,0,0)))
            {
                isGround = true;
            }
            else
            {
                isGround = false;
            }
        }
    }
}
