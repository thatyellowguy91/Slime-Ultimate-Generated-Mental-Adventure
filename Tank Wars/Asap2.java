import greenfoot.*;  
public class Asap2 extends Asap
{
    int time=5;
    public void act() 
    {
        GreenfootImage x = getImage();
        x.scale(100,80);
        if (time>0){
            time--;
        }
        else {
            getWorld().removeObject(this);
        }
   }    
}