package Strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {
    @Test
    void deveRetornarPrecoSemDesconto() {
        Cliente cliente = new Cliente();
        cliente.precoSemDesconto(100.0f);
        assertEquals(100.0f, cliente.getPreco());
    }
    @Test
    void deveRetornarPrecoComDescontoFixo() {
        Cliente cliente = new Cliente();
        cliente.precoComDiscontoFixo(50.0f,25);
        assertEquals(25.0f, cliente.getPreco());
    }
    @Test
    void deveRetornarPrecoComDescontoPorcentagem() {
        Cliente cliente = new Cliente();
        cliente.precoComDiscontoPorcentagem(50.0f,50);
        assertEquals(25.0f, cliente.getPreco());
    }

}
