import greenfoot.*; 
public class Next3 extends Tombol
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Level3());
        }
    }
}