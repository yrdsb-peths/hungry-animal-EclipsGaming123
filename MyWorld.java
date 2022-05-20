import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,600,1); 
        spider x = new spider();
        addObject(x,300,500);
        
        createFly();
        
        Label score = new Label(0, 50);
        addObject(score, 30,30);
    }
    
    public void createFly()
    {
        int randomNumber = Greenfoot.getRandomNumber(500);
        fly fly = new fly();
        addObject(fly, randomNumber + 100,0);
    }
}
