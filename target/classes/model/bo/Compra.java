
package model.bo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Compra {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private int numeroNF;
    
    @Column
    private LocalDateTime dataHoraCompra;
    
    @Column
    private float valorDesconto;
    
    @Column
    private char flagTipoDesconto;
    
    @Column
    private char status;
    
    @Column
    private String observacao;
    
    
    @JoinColumn
    @ManyToOne
    private Fornecedor fornecedor;

    public Compra() {
    }

    public Compra(int id, int numeroNF, LocalDateTime dataHoraCompra, float valorDesconto, char flagTipoDesconto, char status, String observacao, Fornecedor fornecedor) {
        this.id = id;
        this.numeroNF = numeroNF;
        this.dataHoraCompra = dataHoraCompra;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.status = status;
        this.observacao = observacao;
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(int numeroNF) {
        this.numeroNF = numeroNF;
    }

    public LocalDateTime getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(LocalDateTime dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public char getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public void setFlagTipoDesconto(char flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getNumeroNF() + ", " 
                + this.getDataHoraCompra() + ", " 
                + this.getValorDesconto() + ", " 
                + this.getFlagTipoDesconto() + ", " 
                + this.getStatus() + ", " 
                + this.getObservacao() + ", "
                + this.fornecedor.getCnpj() + ", "
                + this.fornecedor.getRazaoSocial();

    }

}
