import greenfoot.*; 
public class Level2 extends World
{
    public static int Score=0;
    public static int Peluru=50, MaxPeluru=Peluru;
    public static int Health=5, MaxHealth=Health;
    public static int Live=3;
    public static int time=1500;
    public static int target=75;
    public static int Level=2; 
    
    public Level2()
    {    
        super(800, 500, 1); 
        prepare();
        show();
    }
    public void act(){
        Musuh2();
        Enemy2();
        waktu();
    }
    public void show(){
        showText("Health : "+Health,60,20);
        showText("Live : "+Live,160,20);
        showText("Score : "+Score,255,20);
        showText("Peluru : "+Peluru,380,20);
        showText("Time : "+time,490,20);
        showText("Target : "+target,600,20);
        showText("Level : "+Level,700,20);
    }
    public void waktu (){
        if (time>0){
            time--;
        }
        else {
            if (Health==0 && Live==0 || time==0){
                if (Score<=target){
                    lose mylose = new lose();
                    addObject(mylose, 400, 250);
                    Greenfoot.stop();
                    
                    
                }
                else {
                    win mywin = new win();
                    addObject(mywin, 400, 250);
                    Next3 myNext3 = new Next3();
                    addObject(myNext3,600,430);
                }
            }
        }
        show();
    }
    public void prepare(){
        Object1 myObject1 = new Object1();
        addObject(myObject1, 400, 100);
        
        
        tree mytree = new tree();
        addObject(mytree, 760, 210);
        tree mytree1 = new tree();
        addObject(mytree1, 660, 210);
        tree mytree2 = new tree();
        addObject(mytree2, 560, 210);
        tree mytree3 = new tree();
        addObject(mytree3, 460, 210);
        tree mytree4 = new tree();
        addObject(mytree4, 360, 210);
        tree mytree5 = new tree();
        addObject(mytree5, 260, 210);
        tree mytree6 = new tree();
        addObject(mytree6, 160, 210);
        tree mytree7 = new tree();
        addObject(mytree7, 60, 210);
        
        Object2 myObject2 = new Object2();
        addObject(myObject2, 740, 266);
        Object2 myObject21 = new Object2();
        addObject(myObject21, 560, 266);
        Object2 myObject22 = new Object2();
        addObject(myObject22, 380, 266);
        Object2 myObject23 = new Object2();
        addObject(myObject23, 200, 266);
        Object2 myObject24 = new Object2();
        addObject(myObject24, 20, 266);
        
        Player2 myPlayer2 = new Player2();
        addObject(myPlayer2,50, 400);
        
        show();
    }
    public void Musuh2(){
        if (Greenfoot.getRandomNumber(1200)<5){
            Musuh2 myMusuh2 = new Musuh2();
            addObject(myMusuh2, getWidth()+5, 340);
        }
        if (Greenfoot.getRandomNumber(1250)<4){
            Musuh2 myMusuh21 = new Musuh2();
            addObject(myMusuh21, getWidth()+8, 400);
        }
        show();
    }
     public void Enemy2(){
        if (Greenfoot.getRandomNumber(1100)<4){
            Enemy2 myEnemy2 = new Enemy2();
            addObject(myEnemy2, getWidth()+5, 80);
        }
        if (Greenfoot.getRandomNumber(1000)<4){
            Enemy2 myEnemy21 = new Enemy2();
            addObject(myEnemy21, getWidth()+5, 130);
        }
        show();
        
    }
}