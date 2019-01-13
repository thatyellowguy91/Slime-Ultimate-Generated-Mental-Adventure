import greenfoot.*;  
public class Bullet3 extends Bullet
{
    
    public void act() 
    {
        move(-18);
        Actor Bullet3 = getOneIntersectingObject(Player3.class);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
        //Bullet kena player
        if (Bullet3 != null){
            Greenfoot.playSound("explosion.wav");
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
