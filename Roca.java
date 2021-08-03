import greenfoot.*;  

public class Roca extends Actor
{
    public void act()
    {
        move();
        eat();
        remove();
    }
        
    public void eat()
    {
        Actor Harvestman_m1_;
        Harvestman_m1_= getOneObjectAtOffset(0,0, Harvestman_m1_.class);
        if (Harvestman_m1_ != null)
        {
            World world;
            world = getWorld();
            GameOver gameover = new GameOver();
            world.addObject(gameover,350,300);
            Greenfoot.stop();
            world.removeObject(Harvestman_m1_);
        }
    }
    
    public void move()
    {
        setLocation(getX(), getY()+4);
    }
    
    public void remove()
    {
        if(isAtEdge())
            getWorld().removeObject(this); 
    }
    
}
