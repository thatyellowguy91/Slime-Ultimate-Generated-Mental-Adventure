import greenfoot.*; 
public class Player3 extends Player
{
    public void act() 
    {
        Actor x = getOneIntersectingObject(tambahan.class);
        
       if (Greenfoot.isKeyDown("right")){
           turn (2);
       }
       if (Greenfoot.isKeyDown("left")){
           turn (-2);
       }
       if (Greenfoot.isKeyDown("up")){
           move (5);        
       }
       if (Greenfoot.isKeyDown("down")){
           move (-5);
        }
       //menembak
       if ("space".equalsIgnoreCase(Greenfoot.getKey())){
           if (Level3.Peluru>0){
               Greenfoot.playSound("bullet.wav");
               Peluru3 myPeluru3 = new Peluru3();
               getWorld().addObject(myPeluru3, getX(), getY()); 
               myPeluru3.setRotation(getRotation());
               Level3.Peluru--;
            }           
       }
       if (Level3.Peluru==0){
           tambahan mytambahan = new tambahan();
           getWorld().addObject(mytambahan, 650, 410);
       }
       if (x!=null){
           Greenfoot.playSound("plung.wav");
           getWorld().removeObject(x);
           Level3.Peluru=Level3.MaxPeluru;
       }
       
       if (isTouching(tembok.class)){
           setRotation(7);
       }
       if (isTouching(Object2.class)){
            setRotation(5);
       }
       
       
    }
}
