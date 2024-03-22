package GodCreator;

//Creacion de interface Creator
public interface Creator {

    //Creacion del metodo abstracto createLivingBeings que nos servira para la creacion del metodo factory
    public LivingBeings createLivingBeings(String type);

}
