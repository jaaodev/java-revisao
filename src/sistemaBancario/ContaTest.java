package sistemaBancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void deveDepositarCorretamente() {
        Conta conta = new Conta("João", 1000, TipoConta.CORRENTE);

        conta.depositar(500);

        assertEquals(1500, conta.getSaldo());
    }

    @Test
    void deveSacarCorretamente() {
        Conta conta = new Conta("João", 1000, TipoConta.CORRENTE);

        conta.sacar(350);

        assertEquals(650, conta.getSaldo());
    }

    @Test
    void deveImpedirSaqueSemSaldo() {
        Conta conta = new Conta("João", 500, TipoConta.CORRENTE);

        assertThrows(SaldoInsuficienteException.class, () -> {
            conta.sacar(1000);
        });

        assertEquals(500, conta.getSaldo());
    }

}