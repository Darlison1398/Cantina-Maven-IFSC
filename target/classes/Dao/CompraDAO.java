
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.bo.Bairro;
import model.bo.Caixa;
import model.bo.Carteirinha;
import model.bo.Cidade;
import model.bo.Cliente;
import model.bo.Compra;
import model.bo.Endereco;
import model.bo.Funcionario;

public class CompraDAO implements InterfaceDAO<Compra> {
    
        
            /*********   inicio   **********/
    private static CompraDAO instance;
    protected EntityManager entityManager;
    
    public static CompraDAO getInstance(){
        if (instance == null) {
            instance = new CompraDAO();
        }
        
        return instance;
    }

    public CompraDAO() {
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
    
    
    
    
    
    public Carteirinha dadosCliente(int parPK){
        return entityManager.find(Carteirinha.class, parPK);
            
    }

    @Override
    public void create(Compra compra) {
        try {
            entityManager.getTransaction().begin();

            /*Funcionario funcionario = compra.getFuncionario();
            entityManager.persist(funcionario);
            
            Carteirinha carteirinha = compra.getCarteirinha();
            entityManager.persist(carteirinha);*/


            entityManager.persist(compra);

            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        
    }

    @Override
    public List<Compra> retrieve() {
        List<Compra> listaCompra;
  
        listaCompra = entityManager.createQuery("SELECT c FROM Compra c", Compra.class).getResultList();        
        
        return listaCompra;
    }

    @Override
    public Compra retrieve(int parPK) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Compra> retrieve(String parString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Compra objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Compra objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
