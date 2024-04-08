
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
import model.bo.Endereco;


import model.bo.Endereco;


public class EnderecoDAO implements InterfaceDAO<Endereco> {
    
    
              /*********   inicio   **********/
    private static EnderecoDAO instance;
    protected EntityManager entityManager;
    
    public static EnderecoDAO getInstance(){
        if (instance == null) {
            instance = new EnderecoDAO();
        }
        
        return instance;
    }

    public EnderecoDAO() {
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
    public void create(Endereco endereco) {
        try {
            entityManager.getTransaction().begin();

            Bairro bairro = endereco.getBairro();
            entityManager.persist(bairro);


            Cidade cidade = endereco.getCidade();
            entityManager.persist(cidade);


            entityManager.persist(endereco);

            entityManager.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    

    @Override
    public List<Endereco> retrieve() {
        
        List<Endereco> listaEndereco;
        listaEndereco = entityManager.createQuery("SELECT e FROM Endereco e LEFT JOIN FETCH e.bairro LEFT JOIN FETCH e.cidade", Endereco.class).getResultList();
        
        return listaEndereco;
    }

    @Override
    public Endereco retrieve(int parPK) {
        
        return entityManager.find(Endereco.class, parPK);
        
    }

    @Override
    public List<Endereco> retrieve(String parString) {
        
       List<Endereco> listaEnderecos;
       listaEnderecos = entityManager.createQuery("SELECT e FROM Endereco e WHERE e.bairro.descricao LIKE :parString OR e.cidade.descricao LIKE :parString", Endereco.class)
                .setParameter("parString", "%" + parString +  "%" ).getResultList();
        
        return listaEnderecos;
         
    }
    
    
       

    @Override
    public void update(Endereco objeto) {
    try {
        entityManager.getTransaction().begin();
        
        // Obtém o endereço gerenciado pelo contexto de persistência
        Endereco endereco = entityManager.find(Endereco.class, objeto.getId());
        
        // Mescla as alterações do objeto fornecido no objeto gerenciado
        endereco.setCep(objeto.getCep());
        endereco.setLogradouro(objeto.getLogradouro());
        endereco.setStatus(objeto.getStatus());
        // Não é necessário mesclar bairro e cidade, pois já estão associados ao endereço

        // Mescla o objeto Endereco atualizado no contexto de persistência
        entityManager.merge(endereco);

        entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
}


    @Override
    public void delete(Endereco objeto) {
        try {
            Endereco endereco = entityManager.find(Endereco.class, objeto.getId());
            entityManager.getTransaction().begin();
            entityManager.remove(objeto);
            entityManager.getTransaction().commit();
            
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
            
        }
        
    }

    
}
