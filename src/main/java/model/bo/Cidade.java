
package model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cidade implements Serializable{

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String descricao;
    
    @Column
    private String uf;

    public Cidade() {
    }

    public Cidade(int id, String descricao, String uf) {
        this.id = id;
        this.descricao = descricao;
        this.uf = uf;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUf() {
        return uf;
    }
    

    @Override
    public String toString() {
        return this.getId() + ", " 
                + this.getDescricao() + ", " 
                + this.getUf();

    }

}
