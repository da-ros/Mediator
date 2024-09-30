public class Main {

    public static void main(String[] args) {
        //Instanciar un Mediator
        TorreControlMaritimo controlPuerto = new TorreControlPuerto();

        //Instanciar colegas concretos (Naves)
        Nave portacontenedores = new Portacontenedores(controlPuerto);
        Nave buqueFrigorifico = new BuqueFrigorifico(controlPuerto);

        //Establecer asociacion entre los Colegas Concretos y el Mediator
        portacontenedores.solicitarZarpar();
        buqueFrigorifico.solicitarArribar();

    }

}