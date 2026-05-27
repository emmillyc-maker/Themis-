package br.edu.ifrn.themis.service;

import br.edu.ifrn.themis.modelo.AcompanhamentoDenuncia;

public class AcompanhamentoDenunciaService {

    public void acompanharStatus(
            AcompanhamentoDenuncia denuncia
    ) {

        if (denuncia == null) {

            throw new IllegalArgumentException(
                    "Denúncia não encontrada."
            );
        }

        System.out.println(
                denuncia.acompanharDenuncia()
        );
    }
}