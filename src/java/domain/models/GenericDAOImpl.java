/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.models;

import domain.util.HibernateUtil;
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
    protected static Session sessao;
    protected Transaction transacao;
    
    public void inserir(T obj) throws Exception
    {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        sessao.save(obj);
        sessao.flush();
        transacao.commit();
        sessao.close();
    }
    
    public void alterar (T obj) throws Exception
    {
        sessao = HibernateUtil.getSession();
    }
    
    public List<T> listar(Class clazz) throws Exception
    {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        List objts;
        objts = null;
        Criteria selectAll = sessao.createCriteria(clazz);
        transacao.commit();
        objts = selectAll.list();
        sessao.close();
        return objts;
    }        
    
    public void deletar(T obj) throws Exception
    {
        sessao = HibernateUtil.getSession();
        transacao = sessao.beginTransaction();
        sessao.delete(obj);
        sessao.flush();
        transacao.commit();
        sessao.close();
    }
}
