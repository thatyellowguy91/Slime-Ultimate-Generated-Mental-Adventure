import greenfoot.*; 
public class Enemy2 extends Enemy
{
    public void act() 
    {
       GreenfootImage x = getImage();
       x.scale(70, 70);
       move(-4);
       Actor Enemy2 = getOneIntersectingObject(Peluru2.class);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
        //Enemy1 menembak
        if (Greenfoot.getRandomNumber(1200)<8){
            Greenfoot.playSound("fire.wav");
            Bom2 myBom2 = new Bom2();
            getWorld().addObject(myBom2, getX(),getY());
        }
        //Enemy1 kena peluru player
        if (Enemy2 != null){
            Greenfoot.playSound("lose3.wav");
            getWorld().removeObject(Enemy2);
            Asap1 myAsap1 = new Asap1();
            getWorld().addObject(myAsap1, getX(),getY());
            getWorld().removeObject(this);
            Level2.Score = Level2.Score + 5;
        }
    }    
}