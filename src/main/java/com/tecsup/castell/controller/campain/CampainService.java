/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.castell.controller.campain;

import com.tecsup.castell.model.Campain;
import java.util.List;

public interface CampainService {
    
     List<Campain> all();
    
    Campain find(Long id);
    
    void save(Campain campain);
    
    void delete(Long id);
}
