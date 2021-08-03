import greenfoot.*;  

public class Contador extends Actor
{
    double Puntaje = 1;
    double Reloj = 0.1;
    int Mostrar = 0;
    public void act()
    {
        Reloj= Reloj + 0.000001;
        Puntaje = Puntaje + Reloj;
        Mostrar = (int) Puntaje;
        setImage(new GreenfootImage("Puntaje Actual: " + Mostrar, 50, Color.GREEN, Color.BLACK));
    }
}
