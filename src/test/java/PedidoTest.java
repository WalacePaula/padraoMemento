import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveArmazenarEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        pedido.setEstado(PedidoEstadoPago.getInstance());

        assertEquals(2, pedido.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        pedido.setEstado(PedidoEstadoPago.getInstance());
        pedido.restauraEstado(0);

        assertEquals(PedidoEstadoAberto.getInstance(), pedido.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoAberto.getInstance());
        pedido.setEstado(PedidoEstadoPago.getInstance());
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        pedido.setEstado(PedidoEstadoCancelado.getInstance());

        pedido.restauraEstado(2);

        assertEquals(PedidoEstadoEnviado.getInstance(), pedido.getEstado());
    }
}