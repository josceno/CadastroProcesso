package clienteCrud.Models.interfaces;

import clienteCrud.Models.entities.Cliente;

public interface Cadastrar {
    
    public void novo(Cliente cliente);
    public void alterar(Cliente cliente);
    public void excluir(Cliente cliente);
    public void vizualizar(Cliente cliente);

}
