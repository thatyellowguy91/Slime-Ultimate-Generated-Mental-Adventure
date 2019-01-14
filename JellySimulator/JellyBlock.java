import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class spring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JellyBlock  extends Actor
{
    GreenfootImage screen = new GreenfootImage(600, 400);
    double[] x = {225,275,275,225};
    double[] y = {225,225,275,275};
    double[] xv = {0,0,0,0};
    double[] yv = {0,0,0,0};
    double a,b,c,d,l,ang;
    int[] conect1 = {0,1,2,3,0,1}; //0,1,2,3,0,1 for sq
    int[] conect2 = {1,2,3,0,2,3}; //1,2,3,0,2,3 for sq
    double[] dl = new double[6];

    public Car(){
        setImage(screen);
        for(int f=0;f<6;f++){
            dl[f] = Math.sqrt(Math.pow((x[conect1[f]] - x[conect2[f]]),2)+Math.pow((y[conect1[f]] - y[conect2[f]]),2));
        }
   }
    
    
    
    public void act() 
    {
        screen.clear();
        for(int f=0;f<6;f++)
        {
            ((JellyWorld) getWorld()).isGround((int)(x[conect1[f]]),(int)(y[conect1[f]]),(int)(x[conect2[f]]),(int)(y[conect2[f]]));
            screen.setColor(Color.RED);
            screen.drawLine((int)(x[conect1[f]]),(int)(y[conect1[f]]),(int)(x[conect2[f]]),(int)(y[conect2[f]]));
        }
        
        for(int f=0;f<4;f++){
            
             if(((JellyWorld) getWorld()).isGround==false)
             {
                yv[f] = yv[f]+.2;
            }
            
            if(((JellyWorld) getWorld()).isGround==true)
             {
                yv[f] = yv[f]-.3;
            }

            if(Greenfoot.isKeyDown("right"))
                xv[f] = xv[f]+.2;
            if(Greenfoot.isKeyDown("left"))
                xv[f] = xv[f]-.2;
            if(Greenfoot.isKeyDown("up") && ((JellyWorld) getWorld()).isGround==true)
            {
                yv[f] = - 7;
                y[f] = y[f] - 7;
            }
        }
        
        for(int f=0;f<6;f++){
            l = Math.sqrt(Math.pow((x[conect1[f]] - x[conect2[f]]),2)+Math.pow((y[conect1[f]] - y[conect2[f]]),2));
            l = dl[f]-l;
            l=l/10.0;
            ang = Math.atan2(y[conect1[f]]-y[conect2[f]],x[conect1[f]]-x[conect2[f]]);
            xv[conect1[f]] = xv[conect1[f]] + l*Math.cos(ang);
            xv[conect2[f]] = xv[conect2[f]] - l*Math.cos(ang);
            
//             if(((JellyWorld) getWorld()).isGround==false)
//             {
                yv[conect1[f]] = yv[conect1[f]] + l*Math.sin(ang);
                yv[conect2[f]] = yv[conect2[f]] - l*Math.sin(ang);
//            }
        }
        
        for(int f=0;f<4;f++){
            
            xv[f] = .99*xv[f];
            x[f] = x[f] + xv[f];
            yv[f] = .99*yv[f];
            
                y[f] = y[f] + yv[f];
            
            if(y[f]>399){
                yv[f] = 0;
                y[f]=399;
                xv[f]=0;
            }
            if(y[f]<0){
                yv[f] = 0;
                y[f]=0;
                xv[f]=0;
            }
            if(x[f]<0){
                yv[f] = 0;
                x[f]=0;
                xv[f]=0;
            }
            if(x[f]>599){
                yv[f] = 0;
                x[f]=599;
                xv[f]=0;
            }
        }
        
    }    
}

