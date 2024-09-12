package com.sena.app.service;

import com.sena.app.controller.ConexionModelo;
import com.sena.app.controller.DeportesDao;

/**
 *
 * @author RICARDO
 */
public class DataService {
    
    ConexionModelo conexion = ConexionModelo.getConexion(); 
	
	
    //Declaración de Servicios de Acceso a Datos//
    private DeportesDao deportesService;
	
    //Mapeo de Controllers//
    public DeportesDao deportesService(){
         deportesService = new  DeportesDao(conexion.getEntityManagerFactory());
	 return deportesService ;
	}
	
	
	
   }
