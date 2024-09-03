package org.example;

public class Parametros {

    private Parametros() {
    }

    private static Parametros instance = new Parametros();

    public static synchronized Parametros getInstance() {
        return instance;
    }

    public static synchronized void resetInstance() {
        instance = new Parametros();
    }

    private String usuarioAtivo;
    private String deslogar;

    public String getUsuarioAtivo() {
        return usuarioAtivo;
    }

    public void setUsuarioAtivo(String usuarioAtivo) {
        this.usuarioAtivo = usuarioAtivo;
        this.deslogar = null;
    }

    public String getDeslogar() {
        return deslogar;
    }

    public void setDeslogar() {
        this.deslogar = "Usuario Deslogado.";
        this.usuarioAtivo = null;
    }
}
