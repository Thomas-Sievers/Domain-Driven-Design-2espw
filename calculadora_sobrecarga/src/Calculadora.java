public class Calculadora {
    public Calculadora(){

    }

    public int somar(int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }

    public double somar(double numero1, double numero2){
        double resultado = numero1 + numero2;
        return resultado;
    }

    public int somar(int numero1, int numero2, int numero3){
        int resultado = numero1 + numero2 + numero3;
        return resultado;
    }

    public int somar(int[] array){
        int resultado = 0;
        for (int i = 0; i > array.length; i++){
            resultado = resultado + i;
        }
        return resultado;
    }

    public int subtrair(int numero1, int numero2){
        int resultado = numero1 - numero2;
        return resultado;
    }

    public double subtrair(double numero1, double numero2){
        double resultado = numero1 + numero2;
        return resultado;
    }

    public int subtrair(int numero1, int numero2, int numero3){
        int resultado = numero1 + numero2 + numero3;
        return resultado;
    }

    public int subtrair(int[] array){
        int resultado = 0;
        for (int i = 0; i > array.length; i++){
            resultado = resultado - i;
        }
        return resultado;
    }

    public int multiplicar(int numero1, int numero2){
        int resultado = numero1 * numero2;
        return resultado;
    }

    public double multiplicar(double numero1, double numero2){
        double resultado = numero1 * numero2;
        return resultado;
    }

    public int multiplicar(int numero1, int numero2, int numero3){
        int resultado = numero1 * numero2 * numero3;
        return resultado;
    }

    public int multiplicar(int[] array){
        int resultado = 0;
        for (int i = 0; i > array.length; i++){
            resultado = resultado * i;
        }
        return resultado;
    }

    public int dividir(int numero1, int numero2){
        int resultado = numero1 / numero2;
        return resultado;
    }

    public double dividir(double numero1, double numero2){
        double resultado = numero1 / numero2;
        return resultado;
    }

    public int dividir(int numero1, int numero2, int numero3){
        int resultado = numero1 / numero2 / numero3;
        return resultado;
    }

    public int dividir(int[] array){
        int resultado = 0;
        for (int i = 0; i > array.length; i++){
            resultado = resultado / i;
        }
        return resultado;
    }
}
