public class App {
    public static void main(String[] args) throws Exception {
        final double  VALOR_PI = 3.14;

        System.out.println(VALOR_PI);

        boolean variavel = false;
        variavel = !variavel;
        System.out.println(variavel);


        int a = 10;
        int b = 10;

        String resultado  = a==b ? "Verdadeiro" : "falso";

        System.out.println(resultado);


        String nomeUm = "Elailson";
        String nomeDois = "Elailson";

        System.out.println(nomeUm.equals(nomeDois));
    }
}
