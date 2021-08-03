import greenfoot.*;  

public class Menu extends World
{
    Selector selector = new Selector();
    private int opcion=0;
    GreenfootSound menuMusic = new GreenfootSound("SubwooferLullabySC.wav");
    
    public Menu()
    {    
        super(700, 700, 1); 
        prepare();
        menuMusic.setVolume(85);
    }
    
    private void prepare()
    {
        addObject(selector,234,285);
    }

    public void started()
    {
        menuMusic.playLoop(); 
    }

    public void stopped()
    {
        menuMusic.pause();
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("UP") && opcion !=0) {opcion++;}
        if (Greenfoot.isKeyDown("DOWN") && opcion !=1) {opcion--;}
        
        if (opcion >=2) opcion=0;
        
        if (opcion <0) opcion=1;
        
        if (opcion == 0)
        {
            selector.setLocation(234,285);
        }
        
        if (opcion == 1)
        {
            selector.setLocation(234,285 +(opcion*80));
        }
        
        if (Greenfoot.isKeyDown("ENTER"))
        {
            switch (opcion)
            {
                case 0:
                    Greenfoot.setWorld(new Stage1());
                    stopped();
                    break;
                case 1:
                    Greenfoot.stop();
                    break;
            }
        }
    }   
}




   
