import greenfoot.*;  
public class Bom1 extends Bom
{
    public void act() 
    {
       Actor Bom1 = getOneIntersectingObject(Player1.class);
       setLocation(getX(),getY()+3);
       
       if (isAtEdge()){
           getWorld().removeObject(this);
        }
       //Bom1 kena player
       if (Bom1 != null){
            Asap2 myAsap2 = new Asap2();
            getWorld().addObject(myAsap2,getX(),getY());            
            getWorld().removeObject(this);
            if (Level1.Health>0){
                Level1.Health--;
            }
            else if (Level1.Health<=0 && Level1.Live>0){
                Level1.Health=Level1.MaxHealth;
                Level1.Live--;
            }
            else if (Level1.Health<=0 && Level1.Live==0){
                Greenfoot.stop();
            }
        }
    }    
}
