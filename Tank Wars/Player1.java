import greenfoot.*; 
public class Player1 extends Player
{
    public void act() 
    {
        Actor a = getOneIntersectingObject(tambahan.class);
        
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
           if (Level1.Peluru>0){
               Greenfoot.playSound("bullet.wav");
               Peluru1 myPeluru1 = new Peluru1();
               getWorld().addObject(myPeluru1, getX(), getY()); 
               myPeluru1.setRotation(getRotation());
               Level1.Peluru--;
            }           
       }
       if (Level1.Peluru==0){
           tambahan mytambahan = new tambahan();
           getWorld().addObject(mytambahan, 650, 410);
       }
       if (a!=null){
           Greenfoot.playSound("plung.wav");
           getWorld().removeObject(a);
           Level1.Peluru=Level1.MaxPeluru;
       }
       
       if (isTouching(tembok.class)){
           setRotation(7);
       }
       if (isTouching(Object2.class)){
            setRotation(5);
       }
       
       
    }
}
