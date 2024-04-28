
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
public class MovimentacaoEstoque implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private LocalDateTime dataHoraMovimentacao;
    
    @Column
    private String flagTipoMovimentacao;
    
    @Column
    private String qtdMovimentada;
    
    @Column
    private String observacaoMovimentada;
    
    @Column
    private char status;

    public MovimentacaoEstoque(int id, LocalDateTime dataHoraMovimentacao, String flagTipoMovimentacao, String qtdMovimentada, String observacaoMovimentada, char status) {
        this.id = id;
        this.dataHoraMovimentacao = dataHoraMovimentacao;
        this.flagTipoMovimentacao = flagTipoMovimentacao;
        this.qtdMovimentada = qtdMovimentada;
        this.observacaoMovimentada = observacaoMovimentada;
        this.status = status;
    }
    

    
    

    

    public MovimentacaoEstoque() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraMovimentacao() {
        return dataHoraMovimentacao;
    }

    public void setDataHoraMovimentacao(LocalDateTime dataHoraMovimentacao) {
        this.dataHoraMovimentacao = dataHoraMovimentacao;
    }

    public String getFlagTipoMovimentacao() {
        return flagTipoMovimentacao;
    }

    public void setFlagTipoMovimentacao(String flagTipoMovimentacao) {
        this.flagTipoMovimentacao = flagTipoMovimentacao;
    }

    public String getQtdMovimentada() {
        return qtdMovimentada;
    }

    public void setQtdMovimentada(String qtdMovimentada) {
        this.qtdMovimentada = qtdMovimentada;
    }

    public String getObservacaoMovimentada() {
        return observacaoMovimentada;
    }

    public void setObservacaoMovimentada(String observacaoMovimentada) {
        this.observacaoMovimentada = observacaoMovimentada;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

  
    

    
    
    
    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getDataHoraMovimentacao()+ ", " 
                + this.getFlagTipoMovimentacao() + ", " 
                + this.getQtdMovimentada() + ", " 
                + this.getObservacaoMovimentada() + ", " 
                + this.getStatus();

    }

}
