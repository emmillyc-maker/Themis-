package br.edu.ifrn.themis.modelo;

public class AtualizacaoStatus {

    private String status;

    public void atualizarStatus(
            String novoStatus
    ) {

        this.status = novoStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}