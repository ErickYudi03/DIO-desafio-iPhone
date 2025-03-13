public class main {
  public static void main(String[] args) {
    iPhone iphone = new iPhone();

    /*Utilize iphone.?? para usar o celular
    ?? - Tocar()
         Pausar()
         SelecionarMusica()
         ExibirPagina()
         AdicionarNovaAba()
         AtualizarPagina()
         Ligar()
         Atender()
         IniciarCorreioVoz()
    Exemplo:                                  */
    
    iphone.Atender();


  }

  public static void rodarReprodutorMusical(ReprodutorMusical reprodutorMusical){
      reprodutorMusical.Tocar(); 
      reprodutorMusical.Pausar();
      reprodutorMusical.SelecionarMusica();
  }

  public static void rodarNavegadorInternet(NavegadorInternet navegadorInternet){
      navegadorInternet.ExibirPagina();
      navegadorInternet.AdicionarNovaAba();
      navegadorInternet.AtualizarPagina();
  }
  public static void rodarAparelhoTelefonico(AparelhoTelefonico aparelhoTelefonico){
      aparelhoTelefonico.Ligar();
      aparelhoTelefonico.Atender();
      aparelhoTelefonico.IniciarCorreioVoz();
  }
}
