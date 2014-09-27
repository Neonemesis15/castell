/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.castell.dao;

import com.tecsup.castell.dao.hibernate.BaseHibernateDAO;
import com.tecsup.castell.model.Archivo;
import com.tecsup.castell.model.Campain;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author SABADO-MANHANA
 */
@Repository
public class ArchivoPruebaDAOH extends BaseHibernateDAO implements ArchivoPruebaDAO {

    @Override
    public List<Archivo> all() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria criteria = this.getSession().createCriteria(Campain.class);
        return criteria.list();
    }

    @Override
    public Archivo find(Long id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Criteria criteria = this.getSession().createCriteria(Campain.class);
        criteria.add(Restrictions.eq("id", id));
        return (Archivo) criteria.uniqueResult();
    }

    @Override
    public void save(Archivo t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          this.getSession().save(t);
    }

    @Override
    public void update(Archivo t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.getSession().merge(t);
    }

    @Override
    public void delete(Archivo t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         this.getSession().delete(t);
    }

   
}
