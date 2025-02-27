public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        // Testando funcionalidades
        iphone.tocar();
        iphone.selecionarMusica("Shape of You");
        iphone.pausar();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
