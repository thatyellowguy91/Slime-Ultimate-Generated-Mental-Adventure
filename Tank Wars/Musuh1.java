import greenfoot.*; 
public class Musuh1 extends Musuh
{
    public void act() 
    {
        move(-2);
        Actor Musuh1 = getOneIntersectingObject(Peluru1.class);
        Actor Musuh = getOneIntersectingObject(Bom1.class);
        Actor nabrak = getOneIntersectingObject(Player1.class);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
        //musuh menembak
        if (Greenfoot.getRandomNumber(1200)<8){
            Bullet1 myBullet1 = new Bullet1();
            getWorld().addObject(myBullet1,getX(),getY());
        }
        //Musuh kena peluru player
        if (Musuh1 != null){
            Greenfoot.playSound("lose3.wav");
            getWorld().removeObject(Musuh1);
            Asap1 myAsap1 = new Asap1();
            getWorld().addObject(myAsap1, getX(), getY());
            getWorld().removeObject(this);
            Level1.Score = Level1.Score + 5;
        }
        //Musuh kena bom dari Enemy1
        if (Musuh != null){
            Greenfoot.playSound("lose3.wav");
            getWorld().removeObject(Musuh);
            Asap1 myAsap1 = new Asap1();
            getWorld().addObject(myAsap1, getX(), getY());
            getWorld().removeObject(this);
        }
        //Musuh nabrak Player
        if (nabrak != null){
            Greenfoot.playSound("explosion.wav");
            Asap3 myAsap3 = new Asap3();
            getWorld().addObject(myAsap3,getX(),getY());
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
