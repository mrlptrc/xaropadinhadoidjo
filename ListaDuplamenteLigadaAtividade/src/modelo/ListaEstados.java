package modelo;

public enum ListaEstados implements Estado {
    PENDENTE {
        @Override
        public void proximoEstado(Pedido pedido){
            pedido.setEstado(PENDENTE);
            pedido.notificaObservadores(" está em separação!");
        }
    },
    SEPARACAO {
        @Override
        public void proximoEstado(Pedido pedido){
            pedido.setEstado(ROTA);
            pedido.notificaObservadores(" está em rotina de entrega!");
        }
    },
    ROTA {
        @Override
        public void proximoEstado(Pedido pedido){
            pedido.setEstado(ENTREGUE);
            pedido.notificaObservadores(" está entregue!");
        }
    },
    ENTREGUE {
        @Override
        public void proximoEstado(Pedido pedido){
            pedido.setEstado(null);
            pedido.notificaObservadores(" foi entregue com sucesso!");
        }
    };
}
