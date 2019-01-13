import greenfoot.*; 
public class tambahan extends Object
{
    int time=3;
    public void act()
    {        
        if (time>0){
            time--;
        }
        else {
            getWorld().removeObject(this);
        }
    }
}