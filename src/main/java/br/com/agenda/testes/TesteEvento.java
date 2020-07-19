package br.com.agenda.testes;

import java.sql.SQLException;

import br.com.agenda.dao.EventoDAO;
import br.com.agenda.model.Evento;

public class TesteEvento {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Evento ev1 = new Evento("Festa a fantasia");
		EventoDAO evDAO = new EventoDAO();
		
		evDAO.inserir(ev1);		
		
	}

}
