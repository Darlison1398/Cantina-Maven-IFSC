
package Dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JTextField;
import model.bo.Caixa;
import model.bo.Funcionario;
import view.AbrirCaixa;

public class AbrirCaixaDAO implements InterfaceDAO<Caixa> {
    
        
            /*********   inicio   **********/
    private static AbrirCaixaDAO instance;
    protected EntityManager entityManager;
    
    public static AbrirCaixaDAO getInstance(){
        if (instance == null) {
            instance = new AbrirCaixaDAO();
        }
        
        return instance;
    }

    public AbrirCaixaDAO() {
        entityManager = getEntityManager();
    }
    
    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu_Cantina");
        
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        
        return entityManager;
    }

    @Override
    public void create(Caixa objeto) {
        
        try {
            entityManager.getTransaction().begin();

            Funcionario funcionario = objeto.getFuncionario();
            entityManager.persist(funcionario);


            entityManager.persist(objeto);

            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        
    }
    

    @Override
    public List<Caixa> retrieve() {
        List<Caixa> listaCaixa;
        listaCaixa = entityManager.createQuery("SELECT c FROM Caixa c LEFT JOIN FETCH c.funcionario", Caixa.class).getResultList();
        return listaCaixa;
    }
    
    public String retornarFuncionario(String nomeF){
        String nomeFuncionario = null;
         try {
             Query query = entityManager.createQuery("SELECT f.nome FROM Funcionario f WHERE f.nome = :nome");
             query.setParameter("nome", nomeF);
             nomeFuncionario = (String) query.getSingleResult();
         } catch (NoResultException ex) {
              System.out.println("Funcionário não encontrado com o nome fornecido: " + nomeF);
         } catch (Exception ex) {
               ex.printStackTrace();
         }
        
         return nomeFuncionario;
    }

    @Override
    public Caixa retrieve(int parPK) {
        return entityManager.find(Caixa.class, parPK);
    }

    @Override
    public List<Caixa> retrieve(String parString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Caixa objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Caixa objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public Funcionario retrieveEmployeeByCaixaId(int caixaId) {
        try {
            Query query = entityManager.createQuery("SELECT c.funcionario FROM Caixa c WHERE c.id = :caixaId");
            query.setParameter("caixaId", caixaId);
            return (Funcionario) query.getSingleResult();
        } catch (NoResultException ex) {
            System.out.println("Caixa não encontrado com o ID fornecido: " + caixaId);
            return null;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }


    
    
}
