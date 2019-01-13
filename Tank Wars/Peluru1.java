import greenfoot.*;  
public class Peluru1 extends Peluru
{
    public void act() 
    {
        move(20);
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }    
}
