
package model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Fornecedor extends Pessoa  implements Serializable{

    @Column
    private String cnpj;
    
    @Column
    private String inscricaoEstadual;
    
    @Column
    private String razaoSocial;

    public Fornecedor() {
    }

    public Fornecedor(int id, String nome, String fone1, String fone2, String email, boolean status, String complementoEndereco, Endereco endereco) {
        super(id, nome, fone1, fone2, email, status, complementoEndereco, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    
    

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return super.toString() + ", "
                + this.getCnpj() + ", "
                + this.getInscricaoEstadual() + ", "
                + this.getRazaoSocial() + ", ";

    }

}
