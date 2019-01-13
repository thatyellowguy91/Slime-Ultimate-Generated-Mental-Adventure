import greenfoot.*;  
public class Level3 extends World
{

    public static int Score=0;
    public static int Peluru=50, MaxPeluru=Peluru;
    public static int Health=5, MaxHealth=Health;
    public static int Live=3;
    public static int time=2000;
    public static int target=100;
    public static int Level=3; 
    
    public Level3()
    {    
        super(800, 500, 1); 
        prepare();
        show();
    }
    public void act(){
        Musuh3();
        Enemy3();
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
                    Greenfoot.stop();
                    win mywin = new win();
                    addObject(mywin, 400, 250);
                    tropy mytropy = new tropy();
                    addObject(mytropy, 400, 150);
                }
            }
        }
        show();
    }
    public void prepare(){
        Object1 myObject1 = new Object1();
        addObject(myObject1, 400, 100);
        
        balok mybalok = new balok();
        addObject(mybalok,780, 240);
        balok mybalok1 = new balok();
        addObject(mybalok1,700, 240);
        balok mybalok2 = new balok();
        addObject(mybalok2,620, 240);
        balok mybalok3 = new balok();
        addObject(mybalok3,540, 240);
        balok mybalok4 = new balok();
        addObject(mybalok4,460, 240);
        balok mybalok5 = new balok();
        addObject(mybalok5,380, 240);
        balok mybalok6 = new balok();
        addObject(mybalok6,300, 240);
        balok mybalok7 = new balok();
        addObject(mybalok7,220, 240);
        balok mybalok8 = new balok();
        addObject(mybalok8,140, 240);
        balok mybalok9 = new balok();
        addObject(mybalok9,60, 240);
        balok mybalok11 = new balok();
        addObject(mybalok11,20, 240);

        
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
        
        Player3 myPlayer3 = new Player3();
        addObject(myPlayer3,50, 400);
        
        show();
    }
    public void Musuh3(){
        if (Greenfoot.getRandomNumber(1200)<7){
            Musuh3 myMusuh3 = new Musuh3();
            addObject(myMusuh3, getWidth()+5, 350);
        }
        if (Greenfoot.getRandomNumber(1200)<6){
            Musuh3 myMusuh31 = new Musuh3();
            addObject(myMusuh31, getWidth()+8, 410);
        }
        show();
    }
     public void Enemy3(){
        if (Greenfoot.getRandomNumber(1100)<6){
            Enemy3 myEnemy3 = new Enemy3();
            addObject(myEnemy3, getWidth()+5, 80);
        }
        if (Greenfoot.getRandomNumber(1000)<5){
            Enemy3 myEnemy31 = new Enemy3();
            addObject(myEnemy31, getWidth()+5, 130);
        }
        show();
        
    }
}