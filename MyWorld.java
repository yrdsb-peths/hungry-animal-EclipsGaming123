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
    int scoreValue = 0;
    
    Label score;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,600,1, false); 
        spider x = new spider();
        addObject(x,300,500);
        score = new Label(scoreValue, 50);
        createFly();
        addObject(score, 30,30);
    }
    
    public void createFly()
    {
        int randomNumber = Greenfoot.getRandomNumber(500);
        fly fly = new fly();
        addObject(fly, randomNumber + 100,0);
    }
    
    
    public void changeScore()
    {
        scoreValue++;
        score.setValue(scoreValue);
    }
    
    public void gameOver()
    {
        Label lost = new Label("Game Over", 100);
        addObject(lost, 300,300);
    }
}
