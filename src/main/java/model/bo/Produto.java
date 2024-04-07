
package model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto implements Serializable {
    
    /*
    Eu mudei a propriedade do status de char para boolean
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String descricao;
    
    @Column
    private String codigoBarra;
    
    @Column
    private float valor;
    
    @Column
    private boolean status;

    public Produto() {
    }

    public Produto(int id, String descricao, String codigoBarra, float valor, boolean status) {
        this.id = id;
        this.descricao = descricao;
        this.codigoBarra = codigoBarra;
        this.valor = valor;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public boolean getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public void setStatus(boolean status) {
        this.status = status;    
    }
    
    /*public void setStatus(boolean status){
        if(status == true){
            this.status = 'I';
        } else{
            this.status = 'A';
        }
    
    }*/

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
    
    



    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getDescricao() + ", " 
                + this.getCodigoBarra() + ", "
                + this.getValor()
                + ", " + this.getStatus();

    }

}
