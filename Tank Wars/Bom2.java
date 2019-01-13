import greenfoot.*;  
public class Bom2 extends Bom
{
    
    public void act() 
    {
        GreenfootImage x =getImage();
        x.scale(30,30);
        Actor Bom2 = getOneIntersectingObject(Player2.class);
        setLocation(getX(),getY()+4);
       
       if (isAtEdge()){
           getWorld().removeObject(this);
        }
       //Bom1 kena player
       if (Bom2 != null){
            Asap2 myAsap2 = new Asap2();
            getWorld().addObject(myAsap2,getX(),getY());            
            getWorld().removeObject(this);
            if (Level2.Health>0){
                Level2.Health--;
            }
            else if (Level2.Health<=0 && Level2.Live>0){
                Level2.Health=Level2.MaxHealth;
                Level2.Live--;
            }
            else if (Level2.Health<=0 && Level2.Live==0){
                Greenfoot.stop();
            }
        }
    }    
}
