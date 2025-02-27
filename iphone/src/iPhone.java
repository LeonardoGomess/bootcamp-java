public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public iPhone() {
        reprodutorMusical = new ReprodutorMusicalImpl();
        telefone = new AparelhoTelefonicoImpl();
        navegador = new NavegadorInternetImpl();
    }

    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    @Override
    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    @Override
    public void atender() {
        telefone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }
}
