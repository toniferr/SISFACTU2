package com.toni.ferreiro.models.services;

import java.util.List;

import com.toni.ferreiro.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save (Cliente cliente);
	
	public void delete (Long id);

}
