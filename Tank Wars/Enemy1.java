import greenfoot.*;
public class Enemy1 extends Enemy
{
    public void act() 
    {
        move(-3);
        Actor Enemy1 = getOneIntersectingObject(Peluru1.class);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
        //Enemy1 menembak
        if (Greenfoot.getRandomNumber(1200)<2){
            Greenfoot.playSound("fire.wav");
            Bom1 myBom1 = new Bom1();
            getWorld().addObject(myBom1, getX(),getY());
        }
        //Enemy1 kena peluru player
        if (Enemy1 != null){
            Greenfoot.playSound("lose3.wav");
            getWorld().removeObject(Enemy1);
            Asap1 myAsap1 = new Asap1();
            getWorld().addObject(myAsap1, getX(),getY());
            getWorld().removeObject(this);
            Level1.Score = Level1.Score + 5;
        }
    }    
}
