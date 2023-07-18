package br.com.projeto.springbootapi.service;

import br.com.projeto.springbootapi.dto.ClienteDTO;
import br.com.projeto.springbootapi.model.Cliente;
import br.com.projeto.springbootapi.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService
{
    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional
    public Cliente salva(Cliente cliente)
    {
        return (Cliente) this.clienteRepository.save(cliente);
    }
}
