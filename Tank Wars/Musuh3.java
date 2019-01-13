import greenfoot.*; 
public class Musuh3 extends Musuh
{
    public void act() 
    {
        move(-4);
        Actor Musuh = getOneIntersectingObject(Peluru3.class);
        Actor Musuh3 = getOneIntersectingObject(Bom3.class);
        Actor nabrak = getOneIntersectingObject(Player3.class);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
        //musuh menembak
        if (Greenfoot.getRandomNumber(1200)<10){
            Bullet3 myBullet3 = new Bullet3();
            getWorld().addObject(myBullet3,getX(),getY());
        }
        //Musuh kena peluru player
        if (Musuh != null){
            Greenfoot.playSound("lose3.wav");
            getWorld().removeObject(Musuh);
            Asap1 myAsap1 = new Asap1();
            getWorld().addObject(myAsap1, getX(), getY());
            getWorld().removeObject(this);
            Level3.Score = Level3.Score + 5;
        }
        //Musuh kena bom dari Enemy1
        if (Musuh3 != null){
            Greenfoot.playSound("explosion.wav");
            Greenfoot.playSound("lose3.wav");
            getWorld().removeObject(Musuh3);
            Asap1 myAsap1 = new Asap1();
            getWorld().addObject(myAsap1, getX(), getY());
            getWorld().removeObject(this);
        }
        //Musuh nabrak Player
        if (nabrak != null){
            Asap3 myAsap3 = new Asap3();
            getWorld().addObject(myAsap3,getX(),getY());
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
