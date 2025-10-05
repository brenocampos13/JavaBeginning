public class MatOp {
    public static void TabuadaLoop (int x) {
        System.out.printf("A tabuada de %d é:\n", x);
        for (int i = 1; i <= 10; i++) {
            int n1 = x * i;
            System.out.printf("%d x %d = %d\n", x, i, n1);
        }
    }
    public static void Parouimpar (int x){
        if (x % 2 == 0){
            System.out.printf("O número %d é par!\n", x);
        } else {
            System.out.printf("O número %d é par!\n", x);
        }
    }
    public static void Expoente (double x){
        double expoente = 3;
        double cube2 = Math.pow(x, expoente);
        System.out.printf("O %.0f elevado á %.0f é igual á %.3f\n", x, expoente, cube2);
    }
    public static void RaizQuadrada (int x){
        double raiz = Math.sqrt(x);
        System.out.printf("A raiz de %d é igual á %.2f\n", x, raiz);
    }
    public static void RaizCubica (int x){
        double cubic = Math.cbrt(x);
        System.out.printf("A raiz cúbica de %d é igual á %.2f\n", x, cubic);
    }
    public static void Absolut (int x){
        double absolut = Math.abs(x);
        System.out.printf("O número absoluto de %d é %.0f\n", x, absolut);
    }
}