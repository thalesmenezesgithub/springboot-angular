package br.com.projeto.springbootapi.controller;

import br.com.projeto.springbootapi.dto.ClienteDTO;
import br.com.projeto.springbootapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(
        origins = {"*"},
        maxAge = 3600L
)
@RequestMapping({"/parking-spot"})
public class ClienteController
{
    @Autowired
    private ClienteService clienteService;


}
