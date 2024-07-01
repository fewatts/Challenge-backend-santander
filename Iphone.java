public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Música parada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada(String numero) {
        System.out.println("Recebendo chamada de: " + numero);
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void fecharPagina() {
        System.out.println("Fechando página.");
    }
}
