/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.castell.controller.reporte;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("reporte")
public class ReporteController {
    
    @RequestMapping("excel")    
    public String excel(Model model){
        
        Map<String, String> notas = new HashMap<String, String>();
        notas.put("Pablo","12");
        notas.put("Kathy","10.5");
        notas.put("Gemma","08");
        notas.put("Gino","12");
        notas.put("Elena","12");
        
        model.addAttribute("reporteNotas",notas);
        
        return "excelView";
    }
    
    @RequestMapping("pdf")    
    public String pdf(Model model){
        
        Map<String, String> notas = new HashMap<String, String>();
        notas.put("Pablo","14");
        notas.put("Kathy","12.5");
        notas.put("Gemma","10");
        notas.put("Gino","14");
        notas.put("Elena","14");
        
        model.addAttribute("reporteNotas",notas);
        
        return "pdfView";
    }
}
