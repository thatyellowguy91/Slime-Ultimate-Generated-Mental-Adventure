import greenfoot.*; 
public class lev1 extends Tulisan
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Level1());
        }
    }    
}
