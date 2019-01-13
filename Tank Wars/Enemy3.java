import greenfoot.*;  
public class Enemy3 extends Enemy
{
    public void act() 
    {
       GreenfootImage x = getImage();
       x.scale(70, 70);
       move(-4);
       Actor Enemy3 = getOneIntersectingObject(Peluru3.class);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
        //Enemy menembak
        if (Greenfoot.getRandomNumber(1200)<10){
            Greenfoot.playSound("fire.wav");
            Bom3 myBom3 = new Bom3();
            getWorld().addObject(myBom3, getX(),getY());
        }
        //Enemy kena peluru player
        if (Enemy3 != null){
            Greenfoot.playSound("lose3.wav");
            getWorld().removeObject(Enemy3);
            Asap1 myAsap1 = new Asap1();
            getWorld().addObject(myAsap1, getX(),getY());
            getWorld().removeObject(this);
            Level3.Score = Level3.Score + 5;
        }
    }    
}
