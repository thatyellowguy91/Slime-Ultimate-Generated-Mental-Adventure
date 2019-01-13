import greenfoot.*;  
public class Bullet1 extends Bullet
{
    public void act() 
    {
        move(-18);
        Actor Bullet1 = getOneIntersectingObject(Player1.class);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
        //Bullet kena player
        if (Bullet1 != null){
            Greenfoot.playSound("explosion.wav");
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
