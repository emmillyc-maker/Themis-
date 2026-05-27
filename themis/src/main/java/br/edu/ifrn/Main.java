package br.edu.ifrn;

import br.edu.ifrn.themis.modelo.Denuncia;
import br.edu.ifrn.themis.service.DenunciaService;

public class Main {

    public static void main(String[] args) {

        // Criando denúncia
        Denuncia denuncia = new Denuncia();

        denuncia.setTipo("Bullying");
        denuncia.setDescricao("Aluno sofrendo intimidação na sala.");
        denuncia.setLocal("Sala 12");
        denuncia.setAnonima(true);

        // Criando service
        DenunciaService service = new DenunciaService();

        // Executando cadastro da denúncia
        service.cadastrarDenuncia(denuncia);

        // Exibindo informações
        System.out.println("Tipo: " + denuncia.getTipo());
        System.out.println("Descrição: " + denuncia.getDescricao());
        System.out.println("Local: " + denuncia.getLocal());
        System.out.println("Status: " + denuncia.getStatus());
        System.out.println("Anônima: " + denuncia.isAnonima());
        System.out.println("Código: " + denuncia.getCodigo());
    }
}