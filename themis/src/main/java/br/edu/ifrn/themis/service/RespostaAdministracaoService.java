package br.edu.ifrn.themis.service;

import br.edu.ifrn.themis.modelo.RespostaAdministracao;

public class RespostaAdministracaoService {

    public void responderDenuncia(
            RespostaAdministracao denuncia,
            String resposta
    ) {

        if (resposta == null ||
            resposta.isEmpty()) {

            throw new IllegalArgumentException(
                    "A resposta não pode ser vazia."
            );
        }

        denuncia.responderAdministracao(
                resposta
        );

        System.out.println(
                "Resposta registrada com sucesso!"
        );
    }
}