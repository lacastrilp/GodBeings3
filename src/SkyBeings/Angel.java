package SkyBeings;

//Importacion de la clase LivingBeings del paquete GodCreator
import BeingsOfTheEarth.EarthBeinInt;
import GodCreator.LivingBeings;

//Creacion de la clase Angel, extiende de la clase abstracta Livingbeings e implementa metodos de los seres del cielo y la tierra
public class Angel extends LivingBeings implements SkyBeingInt, EarthBeinInt {

    //Sobreescritura de metodos
    @Override
    public void born() {
        System.out.println("The Angel was born");
    }

    @Override
    public void grow() {
        System.out.println("The Angel is growing");
    }

    @Override
    public void respawn() {
        System.out.println("The Angel is respawning");
    }

    @Override
    public void reproduce() {
        System.out.println("The Angel reproduces");
    }

    @Override
    public void fly() {
        System.out.println("The Angel is flying");
    }

    @Override
    public void die() {
        System.out.println("The Angel is dying");
    }

    @Override
    public void changeDimensionChange() {
        System.out.println("The Angel is changing dimensions. See you Lucifer...");
    }
}
