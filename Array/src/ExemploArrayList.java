import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
    static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Elemento1");
        lista.add("Elemento2");
        lista.add("Elemento3");

        System.out.println("Lista: " + lista);

        String elemento = lista.get(1);
        System.out.println("Elemento no índice 1: " + elemento);

        lista.remove(0);
        System.out.println("Lista após remoção do índice 0: " + lista);

        System.out.println("Iterando sobre a lista: ");
        for (String s : lista){
            System.out.println(s);
        }
    }
}
