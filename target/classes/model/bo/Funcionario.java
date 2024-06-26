
package model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa implements Serializable {

    @Column
    private String cpf;
    
    @Column
    private String rg;
    
    @Column
    private String usuario;
    
    @Column
    private String senha;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String fone1, String fone2, String email, boolean status, String complementoEndereco, Endereco endereco) {
        super(id, nome, fone1, fone2, email, status, complementoEndereco, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.usuario = usuario;
        this.senha = senha;
    }

    

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return this.getCpf() + ", " + this.getRg() + ", " + this.getUsuario() + ", " + this.getSenha();

    }

}
