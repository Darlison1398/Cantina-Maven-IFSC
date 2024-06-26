
package Dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.bo.Produto;



public class ProdutoDAO implements InterfaceDAO<Produto>{

          /*********   inicio   **********/
    private static ProdutoDAO instance;
    protected EntityManager entityManager;
    
    public static ProdutoDAO getInstance(){
        if (instance == null) {
            instance = new ProdutoDAO();
        }
        
        return instance;
    }

    public ProdutoDAO() {
        entityManager = getEntityManager();
    }
    
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu_Cantina");
        
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        
        return entityManager;
    }
    
    
    /*********   fim   **********/
    
    
    
    
    
    
    
    @Override
    public void create(Produto objeto) {
        
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        
    }

    @Override
    public List<Produto> retrieve() {
        
        List<Produto> listaProdutos;
        listaProdutos = entityManager.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();        
        return listaProdutos;
    }

    @Override
    public Produto retrieve(int parPK) {
        
        return  entityManager.find(Produto.class, parPK);
    }

    @Override
    public List<Produto> retrieve(String parString) {
        List<Produto> listaProduto;
        listaProduto = entityManager.createQuery("SELECT p FROM Produto p WHERE p.descricao LIKE :parDescricao", Produto.class)
            .setParameter("parDescricao", "%" + parString +  "%" ).getResultList();
        return listaProduto;
        
    }
    
    public List<Produto> retrieveByCodBarras(String codBarras) {
        /*List<Produto> listaProduto;
        listaProduto = entityManager.createQuery("SELECT p FROM Produto p WHERE p.codigobarras LIKE :parcodBarras", Produto.class)
            .setParameter("parDescricao", "%" + codBarras +  "%" ).getResultList();
        return listaProduto;*/
            List<Produto> listaProduto;
    listaProduto = entityManager.createQuery("SELECT p FROM Produto p WHERE p.codigoBarras LIKE :parcodBarras", Produto.class)
        .setParameter("parcodBarras", "%" + codBarras + "%").getResultList();
    return listaProduto;
    }

    
    
    

    @Override
    public void update(Produto objeto) {
        
        try {
            
            entityManager.getTransaction().begin();
            
            Produto produto = entityManager.find(Produto.class, objeto.getId());
            produto.setCodigoBarras(objeto.getCodigoBarras());
            produto.setDescricao(objeto.getDescricao());
            produto.setStatus(objeto.isStatus());
            produto.setValor(objeto.getValor());
            
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            
        }
    }

    @Override
    public void delete(Produto objeto) {
        try {
            Produto produto = entityManager.find(Produto.class, objeto.getId());
            entityManager.getTransaction().begin();
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            
        }
    
    }
    
}
