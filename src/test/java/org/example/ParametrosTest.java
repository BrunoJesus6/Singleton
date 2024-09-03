package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @BeforeEach
    void setUp() {
        Parametros.resetInstance();
    }

    @Test
    public void testarInstanciaUnicaSingleton() {
        Parametros instancia1 = Parametros.getInstance();
        Parametros instancia2 = Parametros.getInstance();
        assertEquals(instancia1, instancia2);
    }

    @Test
    public void testarDefinirEObterUsuarioAtivo() {
        Parametros parametros = Parametros.getInstance();
        parametros.setUsuarioAtivo("usuarioTeste");
        assertEquals("usuarioTeste", parametros.getUsuarioAtivo());
    }

    @Test
    public void testarUsuarioAtivoNuloPorPadrao() {
        Parametros parametros = Parametros.getInstance();
        assertNull(parametros.getUsuarioAtivo());
    }

    @Test
    public void testarAlterarUsuarioAtivo() {
        Parametros parametros = Parametros.getInstance();
        parametros.setUsuarioAtivo("usuarioInicial");
        parametros.setUsuarioAtivo("usuarioAlterado");
        assertEquals("usuarioAlterado", parametros.getUsuarioAtivo());
    }

    @Test
    public void testarDeslogarUsuario() {
        Parametros parametros = Parametros.getInstance();
        parametros.setUsuarioAtivo("usuarioTeste");
        parametros.setDeslogar();
        assertNull(parametros.getUsuarioAtivo());
        assertEquals("Usuario Deslogado.", parametros.getDeslogar());
    }

    @Test
    public void testarDeslogarSemUsuarioAtivo() {
        Parametros parametros = Parametros.getInstance();
        parametros.setDeslogar();
        assertNull(parametros.getUsuarioAtivo());
        assertEquals("Usuario Deslogado.", parametros.getDeslogar());
    }
}
