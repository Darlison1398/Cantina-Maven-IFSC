
package model.bo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private LocalDateTime dataHoraEmissao;
    
    @Column
    private Date dataVencimento;
    
    @Column
    private Date dataQuitação;
    
    @Column
    private float valorEmitido;
    
    @Column
    private float valorDesconto;
    
    @Column
    private float valorAcrescimo;
    
    @Column
    private float valorQuitado;
    
    @Column
    private float observacao;
    
    @Column
    private char flagTipoConta;
    
    @Column
    private char status;

    @JoinColumn
    @ManyToOne
    private Venda venda;
    
    @JoinColumn
    @ManyToOne
    private Compra compra;

    public Contas() {
    }

    public Contas(int id, LocalDateTime dataHoraEmissao, Date dataVencimento, Date dataQuitação, float valorEmitido, float valorDesconto, float valorAcrescimo, float valorQuitado, float observacao, char flagTipoConta, char status, Venda venda, Compra compra) {
        this.id = id;
        this.dataHoraEmissao = dataHoraEmissao;
        this.dataVencimento = dataVencimento;
        this.dataQuitação = dataQuitação;
        this.valorEmitido = valorEmitido;
        this.valorDesconto = valorDesconto;
        this.valorAcrescimo = valorAcrescimo;
        this.valorQuitado = valorQuitado;
        this.observacao = observacao;
        this.flagTipoConta = flagTipoConta;
        this.status = status;
        this.venda = venda;
        this.compra = compra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    public void setDataHoraEmissao(LocalDateTime dataHoraEmissao) {
        this.dataHoraEmissao = dataHoraEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataQuitação() {
        return dataQuitação;
    }

    public void setDataQuitação(Date dataQuitação) {
        this.dataQuitação = dataQuitação;
    }

    public float getValorEmitido() {
        return valorEmitido;
    }

    public void setValorEmitido(float valorEmitido) {
        this.valorEmitido = valorEmitido;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float getValorAcrescimo() {
        return valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getValorQuitado() {
        return valorQuitado;
    }

    public void setValorQuitado(float valorQuitado) {
        this.valorQuitado = valorQuitado;
    }

    public float getObservacao() {
        return observacao;
    }

    public void setObservacao(float observacao) {
        this.observacao = observacao;
    }

    public char getFlagTipoConta() {
        return flagTipoConta;
    }

    public void setFlagTipoConta(char flagTipoConta) {
        this.flagTipoConta = flagTipoConta;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    
    @Override
    public String toString() {
        return this.getId() + ", "
                + this.getDataHoraEmissao() + ", "
                + this.getDataVencimento() + ", "
                + this.getDataQuitação() + ", "
                + this.getValorEmitido() + ", "
                + this.getValorDesconto() + ", "
                + this.getValorAcrescimo() + ", "
                + this.getValorQuitado() + ", "
                + this.getObservacao() + ", "
                + this.getFlagTipoConta() + ", "
                + this.getStatus() + ", "
                + this.venda.getId() + ", "
                + this.venda.getFuncionario().getUsuario() + ", "
                + this.venda.getCarteirinha().getId() + ", "
                + this.compra.getId() + ", "
                + this.compra.getNumerofi();

    }

}
