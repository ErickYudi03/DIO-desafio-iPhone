public class iPhone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{
    public static void main(String[] args) {
        
    
    }
    @Override
    public void ExibirPagina() {
      System.out.println("O iPhone está Exibindo página");
    }

    @Override
    public void AdicionarNovaAba() {
      System.out.println("O iPhone está adicionando nova aba");
    }

    @Override
    public void AtualizarPagina() {
      System.out.println("O iPhone está atualizando página");
    }

    @Override
    public void Tocar() {
      System.out.println("O iPhone está tocando música");
    }

    @Override
    public void Pausar() {
      System.out.println("O iPhone está pausando música");
    }

    @Override
    public void SelecionarMusica() {
      System.out.println("O iPhone está selecionando música");
    }

    @Override
    public void Ligar() {
      System.out.println("O iPhone está fazendo ligação");
    }

    @Override
    public void Atender() {
      System.out.println("O iPhone está atendendo chamada");
    }

    @Override
    public void IniciarCorreioVoz() {
      System.out.println("O iPhone está iniciando correio de voz");
    }
}
