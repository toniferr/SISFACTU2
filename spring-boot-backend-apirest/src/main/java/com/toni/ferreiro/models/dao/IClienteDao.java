package com.toni.ferreiro.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.toni.ferreiro.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
