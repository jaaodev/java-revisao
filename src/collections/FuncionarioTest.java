package collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void rejeitarNomeComApenasEspacos() {
        assertThrows(IllegalArgumentException.class, () -> {
            Funcionario funcionario = new Funcionario("    ", 3500);
        });
    }

    @Test
    void deveRejeitarSalarioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            Funcionario funcionario = new Funcionario("João", -200);
        });
    }

    @Test
    void deveRejeitarSalarioZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Funcionario funcionario = new Funcionario("João", 0);
        });
    }

    @Test
    void retornarGetterNome() {
        Funcionario funcionario = new Funcionario("João", 3500);

        assertEquals("João", funcionario.getNome());
    }

    @Test
    void retornarGetterSalario() {
        Funcionario funcionario = new Funcionario("João", 3500);

        assertEquals(3500, funcionario.getSalario());
    }

}