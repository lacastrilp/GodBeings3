package SkyBeings;
//Se importa la clase LivingBeings del paquete GodCreator
import BeingsOfTheEarth.EarthBeinInt;
import GodCreator.LivingBeings;

//Implementa de las interfaces los metodos de todos lo seres vivos
public class Bird extends LivingBeings implements SkyBeingInt, EarthBeinInt {
    @Override
    public void born() {
        System.out.println("The bird was born");
    }

    @Override
    public void grow() {
        System.out.println("The bird is growing");
    }

    @Override
    public void fly() {
        System.out.println("The bird is flying");
    }

    @Override
    public void respawn() {
        System.out.println("The bird is respawning");
    }

    @Override
    public void reproduce() {
        System.out.println("The bird reproduces");
    }

    @Override
    public void die() {
        System.out.println("The bird is dying");
    }

    @Override
    public void changeDimensionChange() {
        System.out.println("The bird is changing dimensions");
    }


}
