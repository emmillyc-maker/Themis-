package br.edu.ifrn.themis.modelo;

public class RespostaAdministracao {

    private String respostaAdministracao;

    public void responderAdministracao(
            String resposta
    ) {

        this.respostaAdministracao =
                resposta;
    }

    public String getRespostaAdministracao() {

        return respostaAdministracao;
    }

    public void setRespostaAdministracao(
            String respostaAdministracao
    ) {

        this.respostaAdministracao =
                respostaAdministracao;
    }
}