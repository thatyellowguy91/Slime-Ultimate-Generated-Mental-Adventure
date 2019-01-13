import greenfoot.*;  
public class Bom3 extends Bom
{
    public void act() 
    {
        
        GreenfootImage x = getImage();
        x.scale(30,30);
        Actor Bom3 = getOneIntersectingObject(Player3.class);
        setLocation(getX(),getY()+5);
       
       if (isAtEdge()){
           getWorld().removeObject(this);
        }
       //Bom1 kena player
       if (Bom3 != null){
            Asap2 myAsap2 = new Asap2();
            getWorld().addObject(myAsap2,getX(),getY());            
            getWorld().removeObject(this);
            if (Level3.Health>0){
                Level3.Health--;
            }
            else if (Level3.Health<=0 && Level3.Live>0){
                Level3.Health=Level2.MaxHealth;
                Level3.Live--;
            }
            else if (Level3.Health<=0 && Level3.Live==0){
                Greenfoot.stop();
            }
        }
    }
}
