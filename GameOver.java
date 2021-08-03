import greenfoot.*;  

public class GameOver extends Actor
{
    private int counter = 0;
    public void act() 
    {
        counter++;
        if(counter<20)
        {}
        else if(Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("space")||Greenfoot.mouseClicked(null))
        {
            Greenfoot.setWorld(new Stage1());
        }
    }
}
