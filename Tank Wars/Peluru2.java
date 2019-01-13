import greenfoot.*;  
public class Peluru2 extends Peluru
{
    
    public void act() 
    {
        move(20);
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
}