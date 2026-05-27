package br.edu.ifrn.themis.modelo;

public class ConsultaDenuncia {

    private String titulo;
    private String descricao;
    private String status;

    public String visualizarDenuncia() {

        return "Título: " + this.titulo +
               "\nDescrição: " + this.descricao +
               "\nStatus: " + this.status;
    }

    // Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}