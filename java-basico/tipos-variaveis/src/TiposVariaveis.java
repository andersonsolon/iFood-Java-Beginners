public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        final double PI = 3.14;

        System.out.println(salarioMinimo);
        System.out.println(numeroCurto);
        System.out.println(numeroCurto2);
        System.out.println(numero);
        System.out.println(PI);
    }
}
