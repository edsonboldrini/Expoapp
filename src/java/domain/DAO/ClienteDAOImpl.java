/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

import domain.models.Cliente;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 801a02eee05704baa4b6d8a54d3da7a195542172

/**
 *
 * @author edson
 */
<<<<<<< HEAD
public class ClienteDAOImpl extends GenericDAOImpl implements ClienteDAO {

    public ClienteDAOImpl() {
        super();
    }

    public void removeByCpf(String cpf) {
        try {
            entityManager.getTransaction().begin();
            Cliente cliente = getByCpf(cpf);
            entityManager.remove(cliente);
            entityManager.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }   

    public Cliente getById(final int id) {
        return entityManager.find(Cliente.class, id);
    }

    public Cliente getByCpf(final String cpf) {
        return (Cliente) entityManager.createQuery("FROM " + Cliente.class.getName() + " where cpf = '" + cpf + "'").getSingleResult();
=======
public class ClienteDAOImpl extends GenericDAOImpl<Cliente> implements ClienteDAO{

    @Override
    public Cliente Listar(Class clazz, String pk) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rollBack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> 801a02eee05704baa4b6d8a54d3da7a195542172
    }
    
    public List<Cliente> findAll() {
        return entityManager.createQuery("FROM " + Cliente.class.getName()).getResultList();
    }

    @Override
    public List listar(Class clazz) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object Listar(Class clazz, String pk) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rollBack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
