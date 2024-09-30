public class TorreControlPuerto implements TorreControlMaritimo{

    @Override
    public void solicitarZarpar(Nave nave){
        //Logica para coordinar Zarpar
        nave.notificarControlMaritimo("Solicita autorizacion para Zarpar.");
    }

    @Override
    public void solicitarArribar(Nave nave){
        //Logica para coordinar Arribar
        nave.notificarControlMaritimo("Solicita autorizacion para Arribar.");
    }

}
