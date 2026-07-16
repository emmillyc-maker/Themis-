package br.edu.ifrn.themis;

import br.edu.ifrn.themis.modelo.Denuncia;
import br.edu.ifrn.themis.servico.DenunciaService;

public class Main {

    public static void main(String[] args) {

        DenunciaService service = new DenunciaService();

        Denuncia denuncia = new Denuncia();

        denuncia.setTipo("Infraestrutura");
        denuncia.setDescricao("Problema na iluminação da sala.");
        denuncia.setLocal("Sala 05");
        denuncia.setAnonima(true);

        service.cadastrarDenuncia(denuncia);

        System.out.println("Denúncia cadastrada com sucesso!");
        System.out.println("Código: " + denuncia.getCodigo());
        System.out.println("Status: " + denuncia.getStatus());
    }
}
