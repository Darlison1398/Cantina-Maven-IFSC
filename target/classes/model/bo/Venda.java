
package model.bo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private LocalDateTime dataHoraVenda;
    
    @Column
    private float valorDesconto;
    
    @Column
    private char flagTipoDesconto;
    
    @Column
    private String observacao;
    
    @Column
    private char status;

    @JoinColumn
    @ManyToOne
    private Carteirinha carteirinha;
    
    @JoinColumn
    @ManyToOne
    private Funcionario funcionario;

    public Venda() {
    }

    public Venda(int id, LocalDateTime dataHoraVenda, float valorDesconto, char flagTipoDesconto, String observacao, char status, Carteirinha carteirinha, Funcionario funcionario) {
        this.id = id;
        this.dataHoraVenda = dataHoraVenda;
        this.valorDesconto = valorDesconto;
        this.flagTipoDesconto = flagTipoDesconto;
        this.observacao = observacao;
        this.status = status;
        this.carteirinha = carteirinha;
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraVenda() {
        return dataHoraVenda;
    }

    public void setDataHoraVenda(LocalDateTime dataHoraVenda) {
        this.dataHoraVenda = dataHoraVenda;
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
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
                + this.getDataHoraVenda() + ", " 
                + this.getValorDesconto() + ", " 
                + this.getFlagTipoDesconto() + ", " 
                + this.getObservacao() + ", " 
                + this.getStatus() + ", "
                + this.carteirinha.getId()
                + this.carteirinha.getCliente().getNome();

    }

}
