package BeingsOfTheEarth;
//Importan las clases de los otros paquetes

import GodCreator.LivingBeings;
import SkyBeings.SkyBeingInt;

//Human implementa los metodos de los EarthBeing y SkyBeing
//Porque se especifica que puede acceder a los metodos de skyBeing tambien
public class Human extends LivingBeings implements EarthBeinInt, SkyBeingInt {

    //Sobreescritura de los metodos para que impriman algo
    @Override
    public void born() {
        System.out.println("The Human being was born");
    }

    @Override
    public void grow() {
        System.out.println("The Human being is growing");
    }

    @Override
    public void respawn() {
        System.out.println("The Human being is respawning");
    }

    @Override
    public void reproduce() {
        System.out.println("The Human being is reproducing");
    }

    @Override
    public void die() {
        System.out.println("The Human being is dying");
    }

    @Override
    public void fly() {
        System.out.println("The Human being is flying");
    }

    @Override
    public void changeDimensionChange() {
        System.out.println("The human being is changing dimensions. See you Lord");
    }
}
