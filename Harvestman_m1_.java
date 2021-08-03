import greenfoot.*;  

public class Harvestman_m1_ extends Actor
{
    public void act()
    {
        move();
        Actor Papa = getOneObjectAtOffset(0,0, Papa.class);
        if (Papa!= null)
        {
            World world;
            world = getWorld();
            world.removeObject(Papa);
        }
        
        Actor Maiz = getOneObjectAtOffset(0,0, Maiz.class);
        if (Maiz!= null)
        {
            World world;
            world = getWorld();
            world.removeObject(Maiz);
        }
        
        Actor Rabano = getOneObjectAtOffset(0,0, Rabano.class);
        if (Rabano!= null)
        {
            World world;
            world = getWorld();
            world.removeObject(Rabano);
        }
        
        Actor Tomate = getOneObjectAtOffset(0,0, Tomate.class);
        if (Tomate!= null)
        {
            World world;
            world = getWorld();
            world.removeObject(Tomate);
        }
        
        Actor Zanahoria = getOneObjectAtOffset(0,0, Zanahoria.class);
        if (Zanahoria!= null)
        {
            World world;
            world = getWorld();
            world.removeObject(Zanahoria);
        }
        
    }
    
    public Harvestman_m1_()
    {
        GreenfootImage myImage = getImage ();
        myImage.scale (100,200);
    }
    
     public void move()
    {
        if (Greenfoot.isKeyDown("LEFT"))
        {
            move(-6);
        }
        if (Greenfoot.isKeyDown("RIGHT"))
        {
            move(6);
        }
    }
   
}
