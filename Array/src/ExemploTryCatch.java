public class ExemploTryCatch {
    static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não permitida");
        }
        System.out.println("Código continua depois do bloco try catch");
    }
}
