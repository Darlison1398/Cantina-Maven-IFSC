
package model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class ItemVenda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private float qtdProduto;
    
    @Column
    private float valorUnitario;
    
    @Column
    private char status;
    
    @JoinColumn
    @ManyToOne
    private Venda venda;
    
    @JoinColumn
    @ManyToOne
    private Produto produto;
    
    @JoinColumn
    @ManyToOne
    private Compra comrpa;
    

    public ItemVenda() {
    }

    public ItemVenda(int id, float qtdProduto, float valorUnitario, char status, Venda venda, Produto produto, Compra comrpa) {
        this.id = id;
        this.qtdProduto = qtdProduto;
        this.valorUnitario = valorUnitario;
        this.status = status;
        this.venda = venda;
        this.produto = produto;
        this.comrpa = comrpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(float qtdProduto) {
        this.qtdProduto = qtdProduto;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
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

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Compra getComrpa() {
        return comrpa;
    }

    public void setComrpa(Compra comrpa) {
        this.comrpa = comrpa;
    }

    

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getQtdProduto() + ", " 
                + this.getValorUnitario() + ", " 
                + this.getStatus() + ", "
                + this.venda.getId() + ", "
                + this.produto.getId() + ", "
                + this.produto.getDescricao();

    }

}
