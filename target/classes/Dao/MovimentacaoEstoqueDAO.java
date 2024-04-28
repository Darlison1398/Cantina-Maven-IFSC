
package Dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.bo.Compra;
import model.bo.MovimentacaoEstoque;


public class MovimentacaoEstoqueDAO implements InterfaceDAO<MovimentacaoEstoque>{
            
              /*********   inicio   **********/
    private static MovimentacaoEstoqueDAO instance;
    protected EntityManager entityManager;
    
    public static MovimentacaoEstoqueDAO getInstance(){
        if (instance == null) {
            instance = new MovimentacaoEstoqueDAO();
        }
        
        return instance;
    }

    public MovimentacaoEstoqueDAO() {
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
    public void create(MovimentacaoEstoque objeto) {
        
        try {
            entityManager.getTransaction().begin();

            /*Compra compra = objeto.getCompra();
            entityManager.persist(compra);*/


            entityManager.persist(objeto);

            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        
    }
    

    @Override
    public List<MovimentacaoEstoque> retrieve() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MovimentacaoEstoque retrieve(int parPK) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MovimentacaoEstoque> retrieve(String parString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(MovimentacaoEstoque objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(MovimentacaoEstoque objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
