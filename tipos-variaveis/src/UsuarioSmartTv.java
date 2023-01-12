public class UsuarioSmartTv {
    public static void main(String[] args) throws Exception {

        MetodosSmartTv smartTv = new MetodosSmartTv();

        smartTv.ligar ();

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume ();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(13);
        

    }
}
