package GodCreator;
//Se importan las clases de los otros paquetes con la estructura nombrePaquete.nombreClase
import BeingsOfTheEarth.Animal;
import BeingsOfTheEarth.Human;
import SkyBeings.Angel;
import SkyBeings.Bird;

// Se declara que la clase implementa de la interfaz creator
public class LivingBeingCreator implements Creator {

    //Creacion del metodo factory
    //El metodo factory sirve para crear objetos sin saber su tipo.
    //Se le asigna un parametro que indica el tipo para poder crear el objeto ddel tipo correcto
    //@Override para sobreescribir el metodo abstracto createLivingBeings de la interface Creator
    @Override
    public LivingBeings createLivingBeings(String type) {
        if (type.equalsIgnoreCase("human")) {
            return new BeingsOfTheEarth.Human();
        } else if (type.equalsIgnoreCase("animal")) {
            return new BeingsOfTheEarth.Animal();
        } else if (type.equalsIgnoreCase("celestial")) {
            return new SkyBeings.Angel();
        } else if (type.equalsIgnoreCase("bird")) {
            return new SkyBeings.Bird();
        } else {
            throw new IllegalArgumentException("Tipo de ser vivo desconocido: " + type);
        }
    }

    public static void main(String[] args) {
        GodCreator.LivingBeingCreator creatorOfLivingBeings = new GodCreator.LivingBeingCreator();

        System.out.println(" ");

        //Se crea un objeto un tipo LivingBeingCreator para poder acceder al metodo factory
        Human Human = (Human) creatorOfLivingBeings.createLivingBeings("human");
        Human.born();
        Human.grow();
        Human.reproduce();
        Human.respawn();
        Human.fly();
        Human.changeDimensionChange();
        Human.die();

        System.out.println(" ");

        Animal Animal = (Animal) creatorOfLivingBeings.createLivingBeings("Animal");
        Animal.born();
        Animal.grow();
        Animal.reproduce();
        Animal.die();
        Animal.respawn();

        System.out.println(" ");

        Angel Angel = (Angel) creatorOfLivingBeings.createLivingBeings("celestial");
        Angel.born();
        Angel.grow();
        Angel.reproduce();
        Angel.respawn();
        Angel.fly();
        Angel.changeDimensionChange();
        Angel.die();

        System.out.println(" ");

        Bird Bird = (Bird) creatorOfLivingBeings.createLivingBeings("bird");
        Bird.born();
        Bird.grow();
        Bird.reproduce();
        Bird.respawn();
        Bird.fly();
        Bird.changeDimensionChange();
        Bird.die();


    }

}
