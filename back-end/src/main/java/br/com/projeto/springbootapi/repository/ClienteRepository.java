package br.com.projeto.springbootapi.repository;

import br.com.projeto.springbootapi.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long>
{
}
