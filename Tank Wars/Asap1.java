import greenfoot.*; 
public class Asap1 extends Asap
{
    int time=5;
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
