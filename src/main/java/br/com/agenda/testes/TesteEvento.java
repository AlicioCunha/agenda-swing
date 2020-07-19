package br.com.agenda.testes;

import java.sql.SQLException;

import br.com.agenda.dao.EventoDAO;
import br.com.agenda.model.Evento;

public class TesteEvento {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		/*
		Testanto a inserção de evento
		Evento ev1 = new Evento("Aula de java no domingo na proway");
		EventoDAO evDAO = new EventoDAO();
		
		evDAO.inserir(ev1);	*/	
		
		
		/*Testando a busca de todos os evento*/
		
		EventoDAO evDAO = new EventoDAO();
		
		System.out.println(evDAO.listar());
	}

}
