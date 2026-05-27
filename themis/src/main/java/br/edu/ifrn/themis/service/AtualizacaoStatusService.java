package br.edu.ifrn.themis.service;

import br.edu.ifrn.themis.modelo.AtualizacaoStatus;

public class AtualizacaoStatusService {

    public void atualizarStatusDenuncia(
            AtualizacaoStatus denuncia,
            String novoStatus
    ) {

        if (novoStatus == null ||
            novoStatus.isEmpty()) {

            throw new IllegalArgumentException(
                    "O status não pode ser vazio."
            );
        }

        denuncia.atualizarStatus(
                novoStatus
        );

        System.out.println(
                "Status atualizado para: "
                + novoStatus
        );
    }
}