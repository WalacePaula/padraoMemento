public class PedidoEstadoPago implements PedidoEstado{
    private PedidoEstadoPago() {};
    private static PedidoEstadoPago instance = new PedidoEstadoPago();
    public static PedidoEstadoPago getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Pago";
    }
}
