public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorDeAudio {
    @Override
    public void tocar() {
        System.out.println("Reproduzindo áudio...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando áudio...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música... " + musica);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página... " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando telefone... " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo telefone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio voz...");
    }
}