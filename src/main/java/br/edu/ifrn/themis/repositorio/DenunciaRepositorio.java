package br.edu.ifrn.themis.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.ifrn.themis.modelo.Denuncia;

public class DenunciaRepositorio {

    private Connection getConnection() throws SQLException {
        return GerenciadorDeConexao.getConnection();
    }

    public void inserir(Denuncia denuncia) {

        String sql = "INSERT INTO denuncia (tipo, descricao, local, anonima, codigo, status) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, denuncia.getTipo());
            stmt.setString(2, denuncia.getDescricao());
            stmt.setString(3, denuncia.getLocal());
            stmt.setBoolean(4, denuncia.isAnonima());
            stmt.setString(5, denuncia.getCodigo());
            stmt.setString(6, denuncia.getStatus());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir denúncia", e);
        }
    }
}
