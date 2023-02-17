package clienteCrud.Models.entities;

import java.sql.Date;



public class Cliente {
    private int codigo;
    private String nome;
    private String cnpj;
    private String endereco;
    private String cidade;
    private String complemento;
    private String uf;
    private String celular;
    private String telefone;
    private String observacao;
    private String rg;
    private Date dataNascmemto;
    
    public Cliente() {
    }

    public Cliente(String nome,String cnpj, String endereco, String cidade, String complemento, String uf, String celular,
        String telefone, String observacao, String rg, Date dataNascmemto) {
        this.nome = nome;    
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.cidade = cidade;
        this.complemento = complemento;
        this.uf = uf;
        this.celular = celular;
        this.telefone = telefone;
        this.observacao = observacao;
        this.rg = rg;
        this.dataNascmemto = dataNascmemto;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getUf() {
        return uf;
    }

    public String getCelular() {
        return celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getObservacao() {
        return observacao;
    }

    public String getRg() {
        return rg;
    }

    public Date getDataNascmemto() {
        return dataNascmemto;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setDataNascmemto(Date dataNascmemto) {
        this.dataNascmemto = dataNascmemto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (codigo != other.codigo)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cnpj == null) {
            if (other.cnpj != null)
                return false;
        } else if (!cnpj.equals(other.cnpj))
            return false;
        return true;
    }

    
    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cnpj=" + cnpj + "]";
    }
    
   

    
    
    
    

    
    
    


}
