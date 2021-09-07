package com.company;

public class Consulta {

    private final String data;
    private final String motivo;
    private final String diagnostico;
    private final String tratamento;

    public Consulta(String data, String motivo, String diagnostico, String tratamento) {
        this.data = data;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
    }

    @Override
    public String toString() {
        return "Consulta -- " +
                " data = " + data +
                " - motivo = " + motivo +
                " - diagnostico = " + diagnostico +
                " \n         -- tratamento = " + tratamento;
    }
}
