import greenfoot.*;  
public class Next extends Tombol
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
            getWorld().removeObject(this);
            Greenfoot.setWorld(new Level2());
        }
    }    
}
