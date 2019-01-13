import greenfoot.*;  
public class Player2 extends Player
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
           if (Level2.Peluru>0){
               Greenfoot.playSound("bullet.wav");
               Peluru2 myPeluru2 = new Peluru2();
               getWorld().addObject(myPeluru2, getX(), getY()); 
               myPeluru2.setRotation(getRotation());
               Level2.Peluru--;
            }           
       }
       if (Level2.Peluru==0){
           tambahan mytambahan = new tambahan();
           getWorld().addObject(mytambahan, 650, 410);
       }
       if (x!=null){
           Greenfoot.playSound("plung.wav");
           getWorld().removeObject(x);
           Level2.Peluru=Level2.MaxPeluru;
       }
       
       if (isTouching(tembok.class)){
           setRotation(7);
       }
       if (isTouching(Object2.class)){
            setRotation(5);
       }
       
       
    }
}
