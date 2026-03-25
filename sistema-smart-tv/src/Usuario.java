public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVoume();
        smartTV.diminuirVoume();
        smartTV.diminuirVoume();
        smartTV.aumentarVolume();
        smartTV.ligar();
        System.out.println();
        System.out.println("Canal Atual: " + smartTV.canal);
        smartTV.mudarCanal(22);
        System.out.println("Canal Atual: " + smartTV.canal);


        System.out.println();
        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);
        System.out.println();

        smartTV.ligar();
        System.out.println("New state - TV Ligada? " + smartTV.ligada);

        smartTV.desligar(); 
        System.out.println("New state - TV Ligada? " + smartTV.ligada);
    }
}
