import greenfoot.*; 

public class Zanahoria extends Actor
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
