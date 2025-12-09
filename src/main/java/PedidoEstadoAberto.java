public class PedidoEstadoAberto implements PedidoEstado {
    private PedidoEstadoAberto() {};
    private static PedidoEstadoAberto instance = new PedidoEstadoAberto();
    public static PedidoEstadoAberto getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aberto";
    }
}
