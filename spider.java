import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kawaii_spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class spider extends Actor
{
    GreenfootSound screech = new GreenfootSound("AWTQTLF-alien-creature-short-screech-or-scream-1.mp3");
    GreenfootImage[] idle = new GreenfootImage[3];
    /**
     * Act - do whatever the kawaii_spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public spider()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int i = 0; i < 3; i++)
            {
                idle[i] = new GreenfootImage("images/idle" + i + ".png");
            }
            
            setImage(idle[0]);
        }
    }
    
    
    public void act() 
    {
        // Add your action code here.
        int y = this.getY();
        int x = this.getX();
        if (Greenfoot.isKeyDown("a"))
        {
            move(-3);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            move(3);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(x,y-3);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(x,y+3);
        }
        
        eat();
    }   
    
    public void eat()
    {
        if (isTouching(fly.class))
        {
            removeTouching(fly.class);
            MyWorld world = (MyWorld) getWorld();
            world.createFly();
            world.changeScore();
            screech.play();
        }
    }
}
