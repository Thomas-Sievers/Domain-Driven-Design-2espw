import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Prato> cardapio = new ArrayList<>();

        Prato prato1 = new Prato("Strognoff", 40.0, "Molho de creme de leite temperado com frango");
        Prato prato2 = new Prato("Lasanha", 35.0, "Massa com molho bolonhesa e queijo");

        cardapio.add(prato1);
        cardapio.add(prato2);

        System.out.println("Cardapio atual: " + cardapio);

        Pedido meuPedido = new Pedido(1, "Thomas");

        meuPedido.adicionarPrato(prato1);
        meuPedido.adicionarPrato(prato2);

        meuPedido.exibirDetalhes();

        meuPedido.removerPrato(prato2);
        meuPedido.exibirDetalhes();
    }
}
