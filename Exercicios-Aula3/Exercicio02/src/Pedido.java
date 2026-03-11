import java.util.ArrayList;
import java.util.List;

public class Pedido {
    int numeroPedido;
    String cliente;
    double total;
    List<Prato> itensEscolhidos;

    public Pedido(int numeroPedido, String cliente){
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.total = 0.0;
        this.itensEscolhidos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        itensEscolhidos.add(prato);
        total += prato.getPreco();
    }

    public void removerPrato(Prato prato){
        itensEscolhidos.remove(prato);
        total -= prato.getPreco();
    }

    public void exibirDetalhes(){
        System.out.println("--- Detalhes do Pedido ---");
        System.out.println("Numero do pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente);
        System.out.println("Itens: ");

        for (Prato prato : itensEscolhidos) {
            System.out.println(" - " + prato.getNome() + "(R$ " + prato.getPreco() + ")");
        }

        System.out.println("Total a pagar: R$ " + total);
    }
}
