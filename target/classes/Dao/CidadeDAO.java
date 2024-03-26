
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.bo.Bairro;
import model.bo.Cidade;

public class CidadeDAO implements InterfaceDAO<Cidade> {

    
        /*********   inicio   **********/
    private static CidadeDAO instance;
    protected EntityManager entityManager;
    
    public static CidadeDAO getInstance(){
        if (instance == null) {
            instance = new CidadeDAO();
        }
        
        return instance;
    }

    public CidadeDAO() {
        entityManager = getEntityManager();
    }
    
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu_cantina");
        
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        
        return entityManager;
    }
    
    
    /*********   fim   **********/
    

    @Override
    public void create(Cidade objeto) {
        
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            
            // vai voltar ao estado anterior caso de errado a gravação de dados no banco
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public List<Cidade> retrieve() {
        
        List<Cidade> listaCidade;
  
        listaCidade = entityManager.createQuery("SELECT c FROM cidade c", Cidade.class).getResultList();        
        
        return listaCidade;
        
    }

    @Override
    public Cidade retrieve(int parPK) {
        
        return  entityManager.find(Cidade.class, parPK);
    }

    @Override
    public List<Cidade> retrieve(String parString) {
        
        List<Cidade> listaCidade;
        listaCidade = entityManager.createQuery("SELECT c FROM cidade c WHERE c.descricao LIKE :parDescricao", Cidade.class)
                .setParameter("parDescricao", "%" + parString +  "%" ).getResultList();
        
        return listaCidade;
        
    }
    
    
    

    @Override
    public void update(Cidade objeto) {
        
        try {
            
            Cidade cidade = entityManager.find(Cidade.class, objeto);
            entityManager.getTransaction().begin();
            entityManager.merge(cidade);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void delete(Cidade objeto) {
        try {
            
            Cidade cidade = entityManager.find(Cidade.class, objeto);
            entityManager.getTransaction().begin();
            entityManager.remove(cidade);
            //entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }

    }
        
        
        
    

    
    
}
