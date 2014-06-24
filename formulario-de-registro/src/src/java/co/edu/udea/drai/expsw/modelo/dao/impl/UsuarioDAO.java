/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.udea.drai.expsw.modelo.dao.impl;

import co.edu.udea.drai.expsw.modelo.cnf.HibernateSessionFactory;
import co.edu.udea.drai.expsw.modelo.dao.IUsuarioDAO;
import co.edu.udea.drai.expsw.modelo.dto.Usuario;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Usuario
 */
public class UsuarioDAO implements IUsuarioDAO{

    public Usuario registrarUsuario(Usuario usuario) throws HibernateException {
        Session session = null;
        Transaction tx = null;
        try {
            session = (Session) HibernateSessionFactory.getInstance();
            session.beginTransaction();
            //session = new HibernateUtil().getSessionFactory().getCurrentSession();
            session.getTransaction().commit();
            tx = session.getTransaction();
            tx.begin();
            session.save(usuario);
            tx.commit();
            session.flush();
        } catch ( HibernateException ex ){
            throw new HibernateException(ex);
        } finally {
            if (session != null)
                session.close();
        }
        return usuario;
    }
    
}
