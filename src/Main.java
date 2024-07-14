public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.atender();
        iphone.pausar();
    }
}