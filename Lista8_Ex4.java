
public class Lista8_Ex4 {

    public static void main(String[] args) {

        System.out.println("2^8=" + potencia(2, 8));
        System.out.println("5!=" + fat(5));
        System.out.printf( "%.2f", seno(90) );
    }

    public static double potencia(double b, int e) {
        double n = 1;

        for (int i = 0; i < e; i++) {
            n = n * b;
        }
        return n;
    }

    public static int fat(int f) {
        int n = 1;

        for (int i = 1; i <= f; i++) {
            n = n * i;
        }
        return n;
    }

    public static double seno(int x) {
        //forma de calcular o seno:
        //seno x = x - x^3/3! + x^5/5! - x^7/7! + ...
        // o calculo é feito em radianos
        // portanto é preciso converter o parametro"x" que está em graus, para radianos
        // sabendo que 1 grau =  0,0174532925 radianos

        double n, rad;

        rad = x*0.017;
        //rad = x*0.0174;
        n = rad - (potencia(rad, 3) / fat(3)) + (potencia(rad, 5) / fat(5)) - (potencia(x, 7) / fat(7));// + (potencia(x, 9) / fat(9));
        return n;
    }
}

