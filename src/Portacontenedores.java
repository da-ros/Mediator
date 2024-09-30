public class Portacontenedores implements Nave{

    private TorreControlMaritimo mediator;

    public Portacontenedores(TorreControlMaritimo mediator) {
        this.mediator = mediator;
    }

    @Override
    public void solicitarZarpar(){
        mediator.solicitarZarpar(this);
    }

    @Override
    public void solicitarArribar(){
        mediator.solicitarArribar(this);
    }

    @Override
    public void notificarControlMaritimo(String message){
        System.out.println("Portacontenedores: " + message);
    }

}
