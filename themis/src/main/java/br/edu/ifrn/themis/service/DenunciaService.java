package br.edu.ifrn.themis.service;

import br.edu.ifrn.themis.modelo.Denuncia;
import br.edu.ifrn.themis.repositorio.DenunciaRepositorio;

public class DenunciaService {

    private final DenunciaRepositorio repositorio = new DenunciaRepositorio();

    public void salvarNovaDenuncia(Denuncia denuncia) {

        if (denuncia.getDescricao() == null ||
            denuncia.getDescricao().trim().isEmpty()) {

            throw new IllegalArgumentException(
                "Erro de Regra: A descrição da denúncia é obrigatória."
            );
        }

        if (denuncia.getTipo() == null ||
            denuncia.getTipo().trim().isEmpty()) {

            throw new IllegalArgumentException(
                "Erro de Regra: O tipo da denúncia é obrigatório."
            );
        }

        denuncia.setCodigo(denuncia.gerarCodigo());
        denuncia.setStatus("Enviada");

        repositorio.inserir(denuncia);
    }
}
