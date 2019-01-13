import greenfoot.*;  
public class Bullet2 extends Bullet
{
    public void act() 
    {
        move(-18);
        Actor Bullet2 = getOneIntersectingObject(Player2.class);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
        //Bullet kena player
        if (Bullet2 != null){
            Greenfoot.playSound("explosion.wav");
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
