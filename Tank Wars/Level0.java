import greenfoot.*;  
public class Level0 extends World
{
    public Level0()
    {            
        super(800, 500, 1); 
        prepare();
    }
    public void prepare(){
      tank mytank = new tank();
      addObject(mytank, 400, 160);
      Play myPlay = new Play();
      addObject(myPlay,400,350);
      
      lev1 mylev1 = new lev1();
      addObject(mylev1, 650, 80);
      lev2 mylev2 = new lev2();
      addObject(mylev2, 650, 160);
      lev3 mylev3 = new lev3();
      addObject(mylev3, 650, 240);
      
        balok mybalok = new balok();
        addObject(mybalok,780, 440);
        balok mybalok1 = new balok();
        addObject(mybalok1,700, 440);
        balok mybalok2 = new balok();
        addObject(mybalok2,620, 440);
        balok mybalok3 = new balok();
        addObject(mybalok3,540, 440);
        balok mybalok4 = new balok();
        addObject(mybalok4,460, 440);
        balok mybalok5 = new balok();
        addObject(mybalok5,380, 440);
        balok mybalok6 = new balok();
        addObject(mybalok6,300, 440);
        balok mybalok7 = new balok();
        addObject(mybalok7,220, 440);
        balok mybalok8 = new balok();
        addObject(mybalok8,140, 440);
        balok mybalok9 = new balok();
        addObject(mybalok9,60, 440);
        balok mybalok11 = new balok();
        addObject(mybalok11,20, 440);
    }
}
