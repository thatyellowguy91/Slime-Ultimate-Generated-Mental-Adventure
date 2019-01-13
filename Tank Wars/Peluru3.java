import greenfoot.*; 
public class Peluru3 extends Peluru
{
    public void act() 
    {
        move(20);
        GreenfootImage x = getImage();
        x.scale(20,20);
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
}