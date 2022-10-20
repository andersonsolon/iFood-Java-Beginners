package edu.solon.estudo;
public class NomeCompleto {
  public static void main(String[] args) {
    String primeiroNome = "Anderson";
    String segundoNome = "Solon";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);

  }
}