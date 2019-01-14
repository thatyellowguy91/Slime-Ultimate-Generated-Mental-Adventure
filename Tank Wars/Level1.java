import greenfoot.*;  
public class Level1 extends World
{
    public static int Score=0;
    public static int Peluru=50, MaxPeluru=Peluru;
    public static int Health=5, MaxHealth=Health;
    public static int Live=3;
    public static int time=1000;
    public static int target=50;
    public static int Level=1; 
    
    public Level1()
    {    
        super(498, 260, 1); 
        prepare();
        show();
    }
    public void act(){
        Musuh1();
        Enemy1();
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
                    Next myNext = new Next();
                    addObject(myNext,600,430);
                }
            }
        }
        show();
    }
    public void prepare(){
        Object1 myObject1 = new Object1();
        addObject(myObject1, 400, 100);
        
        
        tembok mytembok = new tembok();
        addObject(mytembok,700, 240);
        tembok mytembok1 = new tembok();
        addObject(mytembok1, 530, 240);
        tembok mytembok2 = new tembok();
        addObject(mytembok2,320, 240);
        tembok mytembok3 = new tembok();
        addObject(mytembok3,180, 240);
        tembok mytembok4 = new tembok();
        addObject(mytembok4,80, 240);
        
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
        
        Player1 myPlayer1 = new Player1();
        addObject(myPlayer1,50, 400);
        
        show();
    }
    public void Musuh1(){
        if (Greenfoot.getRandomNumber(1200)<6){
            Musuh1 myMusuh1 = new Musuh1();
            addObject(myMusuh1, getWidth()+5, 340);
        }
        if (Greenfoot.getRandomNumber(1250)<6){
            Musuh1 myMusuh11 = new Musuh1();
            addObject(myMusuh11, getWidth()+8, 400);
        }
        show();
    }
     public void Enemy1(){
        if (Greenfoot.getRandomNumber(1000)<5){
            Enemy1 myEnemy1 = new Enemy1();
            addObject(myEnemy1, getWidth()+5, 80);
        }
        if (Greenfoot.getRandomNumber(1000)<6){
            Enemy1 myEnemy11 = new Enemy1();
            addObject(myEnemy11, getWidth()+5, 130);
        }
        show();
        
    }
}