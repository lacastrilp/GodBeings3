package BeingsOfTheEarth;
//Se importa la clase LivingBeings de los otros paquetes
import GodCreator.LivingBeings;

//Creacion de la clase Animal, extiende de la clase abstracta e implementa de la interfaz los metodos
public class Animal extends LivingBeings implements EarthBeinInt {

    //@Override porque se sobreescriben todos los metodos para darles contenido
    @Override
    public void born() {
        System.out.println("The animal was born");
    }

    @Override
    public void die() {
        System.out.println("The animal is dying");
    }

    @Override
    public void grow() {
        System.out.println("The animal is growing");
    }

    @Override
    public void respawn() {
        System.out.println("The animal is respawning");
    }

    @Override
    public void reproduce() {
        System.out.println("The animal is reproducing");
    }
}
