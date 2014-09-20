/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.castell.controller.campain;

import com.tecsup.castell.dao.CampainDAO;
import com.tecsup.castell.helper.EstadoEnum;
import com.tecsup.castell.model.Campain;
import com.tecsup.castell.model.Categoria;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author SABADO-MANHANA
 */
@Service
@Transactional
public class CampainServiceImp implements CampainService{
@Autowired
CampainDAO campainDAO;
    
    @Override
    public List<Campain> all() {
        return campainDAO.all();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Campain find(Long id) {
        return campainDAO.find(id);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Campain campain) {
        if(campain.getId()==null){
            campain.setEstado(EstadoEnum.ACTIVO.toString());
            campainDAO.save(campain);
        }else{
            campainDAO.update(campain);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Long id) {
        Campain campain = this.find(id);
        campainDAO.delete(campain);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
