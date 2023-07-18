package br.com.projeto.springbootapi.dto;

import br.com.projeto.springbootapi.model.Cliente;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class ClienteDTO
{
    private Long codigo;
    private String nome;
    private int idade;
    private String cidade;

    public ClienteDTO(){}

    public ClienteDTO(Cliente entity)
    {
        this.codigo = entity.getCodigo();
        this.nome   = entity.getNome();
        this.idade  = entity.getIdade();
        this.cidade = entity.getCidade();
    }
}