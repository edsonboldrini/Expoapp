/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import domain.util.Conexao;
import javax.persistence.*;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author 20151bsi0223
 */
public abstract class GenericDAOImpl<T> implements GenericDAO<T> 
{
    private static GenericDAOImpl instance;
    protected EntityManager entityManager;
    

    public GenericDAOImpl(){
        entityManager = Conexao.getEntityManager();
    }
    public void inserir(T obj) throws Exception
    {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(obj);
            entityManager.getTransaction().commit();
        }
        catch (Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    public void alterar (T obj) throws Exception
    {
        try{
            entityManager.getTransaction().begin();
            entityManager.merge(obj);
            entityManager.getTransaction().commit();
        }
        catch (Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    public List<T> listar(Class clazz){
        List<T> objects = null;
        try{
            entityManager.getTransaction().begin();
            Query query = entityManager.createQuery("from " + clazz.getName());
            objects = query.getResultList();
            entityManager.getTransaction().commit();
        }
        catch(Exception ex){
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
        return objects;
    }
    public void remove(T obj) throws Exception{
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(obj);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }
    
    public List<T> listar(T obj) throws Exception{
        List<T> l = null;

        return l;
    }
}
