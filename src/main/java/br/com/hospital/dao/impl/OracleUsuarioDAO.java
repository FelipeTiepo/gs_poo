package br.com.hospital.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.hospital.connection.ConnectionManager;
import br.com.hospital.dao.UsuarioDAO;
import br.com.hospital.model.Usuario;


public class OracleUsuarioDAO implements UsuarioDAO {

	private Connection conecxao;
	
	@Override
	public boolean validarUsuario(Usuario usuario) {
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM TB_USER WHERE EMAIL = ? AND SENHA = ?");
			stmt.setString(1, usuario.getEmail());
			stmt.setString(2, usuario.getSenha());
			rs = stmt.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
