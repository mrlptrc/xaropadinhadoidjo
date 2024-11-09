package modelo;

import java.util.ArrayList;
import java.util.List;

public class Fachada {
    private List<String> lista = new ArrayList<>();
    private Pedido pedido;

    public boolean temPedido() {
        return pedido != null;
    }

    public void adicionarItem(String item) {
        lista.add(item);
    }

    public void realizarPedido() {
        if (!lista.isEmpty()) {
            pedido = new Pedido(lista);
        } else {
            System.out.println("Não há itens no pedido");
        }
    }

    public void adicionarObservadores(Observadores observador) {
        if (temPedido()) {
            pedido.registrarObservadores(observador);
        } else {
            System.out.println("Não há pedidos!");
        }
    }

    public void alterarEstadoPedido() {
        if (pedido.temObservadores()) {
            pedido.avancarEstado();
        } else {
            System.out.println("Não há observadores");
        }
    }

    public void exibir() {
        if (temPedido()) {
            System.out.println("Detalhes do pedido");
            System.out.println("Estado inicial do pedido: " + pedido);
        } else {
            System.out.println("Não há pedidos!");
        }
    }
}
