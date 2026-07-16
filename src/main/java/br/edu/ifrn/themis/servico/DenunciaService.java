package br.edu.ifrn.themis.servico;

import br.edu.ifrn.themis.modelo.Denuncia;
import br.edu.ifrn.themis.repositorio.DenunciaRepositorio;

public class DenunciaService {

    private final DenunciaRepositorio repositorio = new DenunciaRepositorio();

    public void cadastrarDenuncia(Denuncia denuncia) {

        if (denuncia.getTipo() == null || denuncia.getTipo().isEmpty()) {
            throw new IllegalArgumentException("O tipo da denúncia é obrigatório.");
        }

        if (denuncia.getDescricao() == null || denuncia.getDescricao().isEmpty()) {
            throw new IllegalArgumentException("A descrição da denúncia é obrigatória.");
        }

        if (denuncia.getCodigo() == null) {
            denuncia.setCodigo(denuncia.gerarCodigo());
        }

        if (denuncia.getStatus() == null) {
            denuncia.setStatus("Recebida");
        }

        repositorio.inserir(denuncia);
    }
}
