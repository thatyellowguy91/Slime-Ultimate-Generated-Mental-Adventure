import greenfoot.*;  
public class Play extends Tombol
{
    public void act() 
    {
       if (Greenfoot.mouseClicked(this)){
           getWorld().removeObject(this);
           Greenfoot.setWorld(new Level1());
        }
    }    
}
