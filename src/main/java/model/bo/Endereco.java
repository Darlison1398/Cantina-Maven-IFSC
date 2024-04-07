
package model.bo;

import Dao.BairroDAO;
import Dao.CidadeDAO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String cep;
    
    @Column
    private String logradouro;
    
    @Column
    private boolean status;
    
    
    @JoinColumn
    @ManyToOne
    private Bairro bairro;
    
    
    @JoinColumn
    @ManyToOne
    private Cidade cidade;

    public Endereco() {
    }

    public Endereco(int id, String cep, String logradouro, boolean status, Bairro bairro, Cidade cidade) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.status = status;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }



    public int getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public boolean getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    
    
    /**** implementei  ***/
    
    
    
   /* public void setCidade(int cidadeId) {
        // Suponha que você tenha um método em CidadeDAO para obter uma cidade por ID
        this.cidade = CidadeDAO.obterCidadePorId(cidadeId);
    }

    // Método para configurar o Bairro com base no ID
    public void setBairro(int bairroId) {
        // Suponha que você tenha um método em BairroDAO para obter um bairro por ID
        this.bairro = BairroDAO.obterBairroPorId(bairroId);
    }*/
    
    
    
    
    
    
    
    
    
    
/*****/
    
    
    

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getCep() + ", " 
                + this.getLogradouro() + ", " 
                + this.getStatus() +", " 
                + this.cidade.getDescricao() 
                + this.bairro.getDescricao();

    }


}
