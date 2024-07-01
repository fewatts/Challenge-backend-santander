public class Main {
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();

        // Testando métodos do Reprodutor Musical
        meuIPhone.selecionarMusica("Ritzi lee - Traction");
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.parar();

        // Testando métodos do Aparelho Telefônico
        meuIPhone.fazerChamada("123-456-7890");
        meuIPhone.receberChamada("098-765-4321");
        meuIPhone.encerrarChamada();

        // Testando métodos do Navegador na Internet
        meuIPhone.abrirPagina("http://www.example.com");
        meuIPhone.atualizarPagina();
        meuIPhone.fecharPagina();
    }
}
