package br.com.agenda.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.agenda.data.ConexaoJDBC;
import br.com.agenda.data.ConexaoMysqlJDBC;
import br.com.agenda.model.Evento;

public class EventoDAO {
	
	private final ConexaoJDBC conexao;

	public EventoDAO() throws SQLException, ClassNotFoundException	{
		this.conexao = new ConexaoMysqlJDBC();
	}

	
	public Long inserir(Evento ev) throws SQLException, ClassNotFoundException {
		
		Long id = null;
		String sqlQuery = "INSERT INTO evento (descricao) VALUES (?); ";

		try {
			PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
			stmt.setString(1, ev.getDescricao());

			stmt.execute();

			this.conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;
		}

		return id;
	}


	public List<Evento> listar() throws SQLException, ClassNotFoundException {
		String sqlQuery = "select descricao from evento order by descricao ; ";

		try {
			PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sqlQuery);
			ResultSet rs = stmt.executeQuery();

			List<Evento> chamados = new ArrayList<Evento>();

			while (rs.next()) {
				chamados.add(parser(rs));
			}

			return chamados;
		} catch (SQLException e) {
			throw e;
		}
	}
	
	private Evento parser(ResultSet resultSet) throws SQLException {
		Evento c = new Evento(resultSet.getString("descricao"));
		return c;
	}
}
