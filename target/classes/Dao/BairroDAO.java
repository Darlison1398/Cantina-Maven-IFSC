
package Dao;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import model.bo.Bairro;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class BairroDAO implements InterfaceDAO<Bairro> {
    
    
    
    
    // copiar nos demais DAOS
    
    /*********   inicio   **********/
    private static BairroDAO instance;
    protected EntityManager entityManager;
    
    public static BairroDAO getInstance(){
        if (instance == null) {
            instance = new BairroDAO();
        }
        
        return instance;
    }

    public BairroDAO() {
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
    public void create(Bairro objeto) {
        
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
    public List<Bairro> retrieve() {
        
        List<Bairro> listaBairros;
  
        listaBairros = entityManager.createQuery("SELECT b FROM Bairro b", Bairro.class).getResultList();        
        
        return listaBairros;
        
    }

    @Override
    public Bairro retrieve(int parPK) {
        
        return  entityManager.find(Bairro.class, parPK);
        
    }

    
    
    @Override
    public List<Bairro> retrieve(String parString) {
    List<Bairro> listaBairros;
    listaBairros = entityManager.createQuery("SELECT b FROM Bairro b WHERE b.descricao LIKE :parDescricao", Bairro.class)
            .setParameter("parDescricao", "%" + parString +  "%" ).getResultList();
    return listaBairros;
}

    
    

    @Override
    public void update(Bairro objeto) {
        
        // merge faz update no banco
        
        try {
            
            Bairro bairro = entityManager.find(Bairro.class, objeto.getId());
            entityManager.getTransaction().begin();
            entityManager.merge(objeto);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            
        }
        
    }

    @Override
    public void delete(Bairro objeto) {
        try {
            Bairro bairro = entityManager.find(Bairro.class, objeto.getId());
            entityManager.getTransaction().begin();
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            
        }

    }
   
}