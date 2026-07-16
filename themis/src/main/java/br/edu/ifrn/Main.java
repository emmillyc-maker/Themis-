package br.edu.ifrn;

import br.edu.ifrn.themis.modelo.Denuncia;
import br.edu.ifrn.themis.service.DenunciaService;

public class Main {

    public static void main(String[] args) {

        Denuncia denuncia = new Denuncia();

        denuncia.setTipo("Bullying");
        denuncia.setDescricao("Aluno sofrendo intimidação na sala.");

        DenunciaService service = new DenunciaService();

        service.salvarNovaDenuncia(denuncia);

        System.out.println("Tipo: " + denuncia.getTipo());
        System.out.println("Descrição: " + denuncia.getDescricao());
        System.out.println("Status: " + denuncia.getStatus());
        System.out.println("Código: " + denuncia.getCodigo());
    }
}
