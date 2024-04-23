
package model.bo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@Entity
public class Compra {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private int numerofi;
    
    @Column
    private LocalDateTime dataHoraCompra;
    
    @Column
    private float valorDesconto;
    
    @Column
    private String flagTipoDesconto;
    
    @Column
    private String observacao;
    
    @JoinColumn
    @ManyToOne
    private Carteirinha carteirinha;
    
    @JoinColumn
    @ManyToOne
    private Funcionario funcionario;
    

    public Compra() {
    }

    public Compra(int id, int numerofi, LocalDateTime dataHoraCompra, float valorDesconto, String flagTipoDesconto, String observacao, Carteirinha carteirinha, Funcionario funcionario) {
        this.id = id;
        this.numerofi = numerofi;
        this.dataHoraCompra = dataHoraCompra;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.observacao = observacao;
        this.carteirinha = carteirinha;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumerofi() {
        return numerofi;
    }

    public void setNumerofi(int numerofi) {
        this.numerofi = numerofi;
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

    public String getFlagTipoDesconto() {
        return flagTipoDesconto;
    }

    public void setFlagTipoDesconto(String flagTipoDesconto) {
        this.flagTipoDesconto = flagTipoDesconto;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Carteirinha getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(Carteirinha carteirinha) {
        this.carteirinha = carteirinha;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    
    

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getNumerofi() + ", " 
                + this.getDataHoraCompra() + ", " 
                + this.getValorDesconto() + ", " 
                + this.getFlagTipoDesconto() + ", " 
                + this.getObservacao();

    }

}
