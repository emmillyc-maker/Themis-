package br.edu.ifrn.themis.service;

import br.edu.ifrn.themis.modelo.Denuncia;

public class DenunciaService {

    // RF.001 - Cadastro de denúncia
    public void cadastrarDenuncia(Denuncia novaDenuncia) {

        // Critério de Aceitação: descrição obrigatória
        if (novaDenuncia.getDescricao() == null ||
            novaDenuncia.getDescricao().isEmpty()) {

            throw new IllegalArgumentException(
                "A descrição da denúncia é obrigatória."
            );
        }

        // Critério de Aceitação: tipo obrigatório
        if (novaDenuncia.getTipo() == null ||
            novaDenuncia.getTipo().isEmpty()) {

            throw new IllegalArgumentException(
                "O tipo da denúncia é obrigatório."
            );
        }

        // Gerando código automático
        novaDenuncia.setCodigo(novaDenuncia.gerarCodigo());

        // Definindo status inicial
        novaDenuncia.setStatus("Enviada");

        // Simulação de salvamento
        System.out.println(
            "Denúncia cadastrada com sucesso! Código: "
            + novaDenuncia.getCodigo()
        );
    }
}