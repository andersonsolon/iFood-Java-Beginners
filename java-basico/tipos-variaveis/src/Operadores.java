public class Operadores {
  public static void main(String[] args) {
    // Estrutura de condição comum
    int a, b, c, d;
    a = 6;
    b = 6;
    c = 2;
    d = 1;

    String resultado = "";

    if (a == b)
      resultado = "Verdadeiro";
    else
      resultado = "falso";

    System.out.println(resultado);

    // condição ternario
    String valor = c == d ? "Verdadeiro" : "Falso";

    System.out.println(valor);

  }
}
