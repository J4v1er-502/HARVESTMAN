import greenfoot.*;  

public class Rabano extends Actor
{
    public void act()
    {
        move();
        remove();
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
