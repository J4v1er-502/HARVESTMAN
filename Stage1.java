import greenfoot.*;

public class Stage1 extends World
{
    int rocaCount = 0;
    int papaCount = 0;
    int rabanoCount = 0;
    int tomateCount = 0;
    int maizCount = 0;
    int zanahoriaCount = 0;
    double Dificultad = 0.0;
    GreenfootSound backgroundMusic = new GreenfootSound("HaggstromSC.wav");
    public Stage1()
    {    
        super(700,700, 1);
        prepare();
        backgroundMusic.setVolume(85);
    }

    public void started()
    {
        backgroundMusic.playLoop();
    }

    public void stopped()
    {
        backgroundMusic.pause();
    }
    
    public void act()
    {
        rocaCount++;
        Dificultad = Dificultad + 0.001;
        if(rocaCount>(60 - Dificultad))
        {
            Roca();
            rocaCount = 0;
        }
    
        papaCount++;
        Dificultad = Dificultad + 0.001;
        if(papaCount>(100 - Dificultad))
        {
            Papa();
            papaCount = 0;
        }
        
        rabanoCount++;
        Dificultad = Dificultad + 0.001;
        if(rabanoCount>(300 - Dificultad))
        {
            Rabano();
            rabanoCount = 0;
        }
        
        tomateCount++;
        Dificultad = Dificultad + 0.001;
        if(tomateCount>(200 - Dificultad))
        {
            Tomate();
            tomateCount = 0;
        }
        
        maizCount++;
        Dificultad = Dificultad + 0.001;
        if(maizCount>(400 - Dificultad))
        {
            Maiz();
            maizCount = 0;
        }
        
        zanahoriaCount++;
        Dificultad = Dificultad + 0.001;
        if(zanahoriaCount>(500 - Dificultad))
        {
            Zanahoria();
            zanahoriaCount = 0;
        }
    }
    
    private void prepare()
    {
        started();
        Harvestman_m1_ harvestman_m1_ = new Harvestman_m1_();
        addObject(harvestman_m1_,360,515);
        Contador contador = new Contador();
        addObject(contador,185,36);
    }

    public void Roca()
    {
        addObject(new Roca(), Greenfoot.getRandomNumber(700),0);
    }
    
     public void Papa()
    {
        addObject(new Papa(), Greenfoot.getRandomNumber(700),0);
    }
    
     public void Rabano()
    {
        addObject(new Rabano(), Greenfoot.getRandomNumber(700),0);
    }
    
     public void Tomate()
    {
        addObject(new Tomate(), Greenfoot.getRandomNumber(700),0);
    }
    
     public void Maiz()
    {
        addObject(new Maiz(), Greenfoot.getRandomNumber(700),0);
    }
    
     public void Zanahoria()
    {
        addObject(new Zanahoria(), Greenfoot.getRandomNumber(700),0);
    }
}
