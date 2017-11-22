/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.DAO;

<<<<<<< HEAD
import java.util.List;
=======
import domain.models.Cidade;
>>>>>>> 801a02eee05704baa4b6d8a54d3da7a195542172

/**
 *
 * @author edson
 */
<<<<<<< HEAD
public class CidadeDAOImpl extends GenericDAOImpl implements ClienteDAO{
    
    public CidadeDAOImpl(){
        super();
    }

    @Override
    public List listar(Class clazz) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object Listar(Class clazz, String pk) throws Exception {
=======
public class CidadeDAOImpl extends GenericDAOImpl<Cidade> implements CidadeDAO{

    @Override
    public Cidade Listar(Class clazz, String pk) throws Exception {
>>>>>>> 801a02eee05704baa4b6d8a54d3da7a195542172
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rollBack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
