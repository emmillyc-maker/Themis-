package br.edu.ifrn.themis.repositorio;

import br.edu.ifrn.themis.modelo.Denuncia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DenunciaRepositorio {

    private Connection getConnection() throws SQLException {
        return GerenciadorDeConexao.getConnection();
    }

    public void inserir(Denuncia denuncia) {

        String sql = "INSERT INTO denuncia (tipo, descricao, codigo, status) VALUES (?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, denuncia.getTipo());
            stmt.setString(2, denuncia.getDescricao());
            stmt.setString(3, denuncia.getCodigo());
            stmt.setString(4, denuncia.getStatus());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir denúncia no MySQL", e);
        }
    }
}
