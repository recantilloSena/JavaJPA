package com.sena.app;

import com.sena.app.modelo.Deportes;
import com.sena.app.service.DataService;
import java.util.List;

/**
 *
 * @author RICARDO
 */
public class App {

    public static void main(String[] args) {
        
        DataService dataService = new DataService();
        
        List<Deportes> lista =dataService.deportesService().findAll();
        
        lista.forEach(d-> System.out.println(d.getNombreDeporte()) );
        
        
    }
}
