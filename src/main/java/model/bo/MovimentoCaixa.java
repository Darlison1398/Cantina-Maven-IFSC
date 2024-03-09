
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

@Entity
public class MovimentoCaixa {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private LocalDateTime dataHorarioMovimento;
    
    @Column
    private float valorMovimento;
    
    @Column
    private String observacao;
    
    @Column
    private char flagTipoMovimento;
    
    @Column
    private char status;

    
    @JoinColumn
    @ManyToOne
    private Contas contas;
    
    @JoinColumn
    @ManyToOne
    private Caixa caixa;

    public MovimentoCaixa() {
    }

    public MovimentoCaixa(int id, LocalDateTime dataHorarioMovimento, float valorMovimento, String observacao, char flagTipoMovimento, char status, Contas contas, Caixa caixa) {
        this.id = id;
        this.dataHorarioMovimento = dataHorarioMovimento;
        this.valorMovimento = valorMovimento;
        this.observacao = observacao;
        this.flagTipoMovimento = flagTipoMovimento;
        this.status = status;
        this.contas = contas;
        this.caixa = caixa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHorarioMovimento() {
        return dataHorarioMovimento;
    }

    public void setDataHorarioMovimento(LocalDateTime dataHorarioMovimento) {
        this.dataHorarioMovimento = dataHorarioMovimento;
    }

    public float getValorMovimento() {
        return valorMovimento;
    }

    public void setValorMovimento(float valorMovimento) {
        this.valorMovimento = valorMovimento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public char getFlagTipoMovimento() {
        return flagTipoMovimento;
    }

    public void setFlagTipoMovimento(char flagTipoMovimento) {
        this.flagTipoMovimento = flagTipoMovimento;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Contas getContas() {
        return contas;
    }

    public void setContas(Contas contas) {
        this.contas = contas;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    @Override
    public String toString() {
        return this.getId() + ", "
                + this.getDataHorarioMovimento() + ", "
                + this.getValorMovimento() + ", "
                + this.getObservacao() + ", "
                + this.getFlagTipoMovimento() + ", "
                + this.getStatus() + ", "
                + this.caixa.getFuncionario().getUsuario() +", "
                + this.contas.getId() + ", "
                + this.caixa.getId();

    }

}
