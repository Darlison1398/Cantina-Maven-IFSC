
package model.bo;

import java.io.Serializable;
import javax.persistence.Column;
//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Entity;

@Entity
public class Carteirinha implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String codigocarteirinha;
    
    @Column
    private String dataGeracao;
    
    @Column
    private String dataCancelamento;
    
    
    @ManyToOne
    private Cliente cliente;

    public Carteirinha() {
    }

    public Carteirinha(int id, String codigocarteirinha, String dataGeracao, String dataCancelamento, Cliente cliente) {
        this.id = id;
        this.codigocarteirinha = codigocarteirinha;
        this.dataGeracao = dataGeracao;
        this.dataCancelamento = dataCancelamento;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigocarteirinha() {
        return codigocarteirinha;
    }

    public void setCodigocarteirinha(String codigocarteirinha) {
        this.codigocarteirinha = codigocarteirinha;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getDataCancelamento() {
        return dataCancelamento;
    }

    public void setDataCancelamento(String dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getCodigocarteirinha() + ", " 
                + this.getDataGeracao() + ", " 
                + this.getDataCancelamento() + ", "
                + this.cliente.getMatricula() + ", "
                + this.cliente.getNome();

    }

}
