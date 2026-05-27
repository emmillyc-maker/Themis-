package br.edu.ifrn.themis.service;

import br.edu.ifrn.themis.modelo.ConsultaDenuncia;

public class ConsultaDenunciaService {

    public void consultarDenuncia(
            ConsultaDenuncia denuncia
    ) {

        if (denuncia == null) {

            throw new IllegalArgumentException(
                    "A denúncia não foi encontrada."
            );
        }

        System.out.println(
                "=== CONSULTA DE DENÚNCIA ==="
        );

        System.out.println(
                denuncia.visualizarDenuncia()
        );
    }
}
