import greenfoot.*;  
public class lev2 extends Tulisan
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Level2());
        }
    }    
}
