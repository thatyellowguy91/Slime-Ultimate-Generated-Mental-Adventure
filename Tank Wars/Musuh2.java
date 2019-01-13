import greenfoot.*; 
public class Musuh2 extends Musuh
{
   
    public void act() 
    {
       move(-4);
        Actor Musuh = getOneIntersectingObject(Peluru2.class);
        Actor Musuh1 = getOneIntersectingObject(Bom2.class);
        Actor nabrak1 = getOneIntersectingObject(Player2.class);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
        //musuh menembak
        if (Greenfoot.getRandomNumber(1200)<10){
            Bullet2 myBullet2 = new Bullet2();
            getWorld().addObject(myBullet2,getX(),getY());
        }
        //Musuh kena peluru player
        if (Musuh != null){
            Greenfoot.playSound("lose3.wav");
            getWorld().removeObject(Musuh);
            Asap1 myAsap1 = new Asap1();
            getWorld().addObject(myAsap1, getX(), getY());
            getWorld().removeObject(this);
            Level2.Score = Level2.Score + 5;
        }
        //Musuh kena bom dari Enemy1
        if (Musuh1 != null){
            Greenfoot.playSound("lose3.wav");
            getWorld().removeObject(Musuh1);
            Asap1 myAsap1 = new Asap1();
            getWorld().addObject(myAsap1, getX(), getY());
            getWorld().removeObject(this);
        }
        //Musuh nabrak Player
        if (nabrak1 != null){
            Greenfoot.playSound("explosion.wav");
            Asap3 myAsap3 = new Asap3();
            getWorld().addObject(myAsap3,getX(),getY());
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
