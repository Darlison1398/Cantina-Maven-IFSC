
package model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Cliente extends Pessoa implements Serializable {

    @Column
    private String cpf;
    
    @Column
    private String rg;
    
    @Column
    private String matricula;
    
    @Column
    private String dataNascimento;

    public Cliente() {
    }

    public Cliente(int id, String nome, String fone1, String fone2, String email, boolean status, String complementoEndereco, Endereco endereco, String cpf, String rg, String matricula, String dataNascimento) {
       super(id, nome, fone1, fone2, email, status, complementoEndereco, endereco);
       this.cpf = cpf;
       this.rg = rg;
       this.matricula = matricula;
       this.dataNascimento = dataNascimento;
}

    
    
    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() + ", "
                + this.getCpf() + ", "
                + this.getRg() + ", "
                + this.getMatricula() + ", "
                + this.getDataNascimento() + ", ";

    }


}
