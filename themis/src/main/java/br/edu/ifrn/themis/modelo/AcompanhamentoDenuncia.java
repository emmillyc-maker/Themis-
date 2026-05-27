package br.edu.ifrn.themis.modelo;

public class AcompanhamentoDenuncia {

    private String status;

    public String acompanharDenuncia() {

        return "A denúncia está com status: "
                + this.status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
