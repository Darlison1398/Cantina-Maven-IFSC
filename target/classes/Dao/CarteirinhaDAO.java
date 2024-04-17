
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
import model.bo.Carteirinha;
import model.bo.Cliente;


public class CarteirinhaDAO implements InterfaceDAO<Carteirinha> {
    
    
            /*********   inicio   **********/
    private static CarteirinhaDAO instance;
    protected EntityManager entityManager;
    
    public static CarteirinhaDAO getInstance(){
        if (instance == null) {
            instance = new CarteirinhaDAO();
        }
        
        return instance;
    }

    public CarteirinhaDAO() {
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
    public void create(Carteirinha objeto) {
        
        try {
            entityManager.getTransaction().begin();

            Cliente cliente = objeto.getCliente();
            entityManager.persist(cliente);


            entityManager.persist(objeto);

            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        
    }

    @Override
    public List<Carteirinha> retrieve() {
        List<Carteirinha> listaCarteirinha;
        listaCarteirinha = entityManager.createQuery("SELECT c FROM Carteirinha c LEFT JOIN FETCH c.cliente", Carteirinha.class).getResultList();
        return listaCarteirinha;
        
    }

    @Override
    public Carteirinha retrieve(int parPK) {  
        
        return entityManager.find(Carteirinha.class, parPK);
    }

    @Override
    public List<Carteirinha> retrieve(String parString) {
        List<Carteirinha> listaCarteirinha;
        listaCarteirinha = entityManager.createQuery("SELECT c FROM Carteirinha c WHERE c.nome LIKE :parString", Carteirinha.class)
                .setParameter("parString", "%" + parString +  "%" ).getResultList();
        
        return listaCarteirinha;
    }
    
   // @Override
    public List<Carteirinha> retrieveByCodBarras(String codBarras) {
        List<Carteirinha> listaCarteirinha;
        listaCarteirinha = entityManager.createQuery("SELECT c FROM Carteirinha c WHERE c.codigocarteirinha LIKE :parString", Carteirinha.class)
                .setParameter("parString", "%" + codBarras +  "%" ).getResultList();
        
        return listaCarteirinha;
        
    }

    

    
    @Override
    public void update(Carteirinha objeto) {
        try {
            entityManager.getTransaction().begin();
            Carteirinha carteirinha = entityManager.find(Carteirinha.class, objeto.getId());
            carteirinha.setCodigocarteirinha(objeto.getCodigocarteirinha());
            carteirinha.setDataCancelamento(objeto.getDataCancelamento());
            Cliente cliente = objeto.getCliente();
            carteirinha.getCliente().getNome();
            carteirinha.getCliente().getCpf();
            
            entityManager.merge(cliente);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    
    }
    
    
    

    @Override
    public void delete(Carteirinha objeto) {
        
        try {
            Carteirinha carteirinha = entityManager.find(Carteirinha.class, objeto.getId());
            entityManager.getTransaction().begin();
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            
        }
        
    }

}
