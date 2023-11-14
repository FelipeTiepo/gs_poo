package br.com.hospital.dao;

import java.util.List;

public interface TecnologiasDAO {

	void cadastrar(Tecnologias tecnologias) throws DBException;
	void atualizar(Tecnologias tecnologias) throws DBException;
	void remover(int codigo) throws DBException;
	Tecnologias buscar(int id);
	List<Tecnologias> listar();
}
