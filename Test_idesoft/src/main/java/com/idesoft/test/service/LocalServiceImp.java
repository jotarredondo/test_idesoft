package com.idesoft.test.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.idesoft.test.model.Local;
import com.idesoft.test.repository.LocalDao;

@Service
public class LocalServiceImp implements LocalService {
	
	// Se hace la Inyección de la clase Dao y declaración de variables implementadas en cada método
	// Se utiliza recurso try-catch, para la ejecución de los métodos que implican conexión directa a la base de datos
	// Se adjunta logger para capturar errores que estén implicados de manera externa a la aplicación
	// Método update hace actualización de atributos específicos que se podrían modificar en una situación real
	
	@Autowired
	LocalDao localDao;
	
	private Local localTemp = null;
	private List<Local> locales = null;
	private static Logger logger = LoggerFactory.getLogger(LocalDao.class);
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Local> findAll() {
		try {
			locales = localDao.findAll();
		}catch(Exception e) {
			logger.error("LocalServicioImp findAll()" + e);
		}
		return locales;
	}

	
	@Override
	public List<Local> findByComuna(String comuna) {
		
		try {
			locales = localDao.findByComuna(comuna);
		} catch (Exception e) {
			logger.error("LocalServicioImp findByComuna()" + e);
		}
		
		return locales;
	}

	@Override
	@Transactional
	public Local findById(Integer id) {
		try {
			localTemp = localDao.findById(id).get();
		} catch (Exception e) {
			logger.error("LocalServicioImp findById()" + e);
		}
		return localTemp;
	}

	@Override
	@Transactional
	public void save(Local local) {
		try {
			localDao.save(local);
		} catch (Exception e) {
			logger.error("LocalServicioImp save()" + e);
		}

	}

	@Override
	@Transactional
	public void update(Local local) {
		localTemp = findById(local.getId());
		if(localTemp != null) {
			
			localTemp.setNombreDeLocal(local.getNombreDeLocal());
			localTemp.setComuna(local.getComuna());
			localTemp.setDireccion(local.getDireccion());
			localTemp.setLatitud(local.getLatitud());
			localTemp.setLongitud(local.getLongitud());
			localTemp.setTelefono(local.getTelefono());
			try {
				localDao.save(localTemp);
			} catch (Exception e) {
				logger.error("LocalServicioImp update()" + e);
			}
				
		}
		
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		try {
		localDao.deleteById(id);
		} catch (Exception e) {
			logger.error("LocalServicioImp delete()" + e);
		}
	}

}
