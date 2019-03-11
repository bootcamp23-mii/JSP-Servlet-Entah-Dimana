/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.math.BigDecimal;
import java.util.List;
import javassist.compiler.Javac;
import models.Region;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author AdhityaWP
 */
public class RegionController implements RegionControllerInterface{
    private DAOInterface<Region> dao;
    
    public RegionController(SessionFactory sessionFactory) {
        dao = new GeneralDAO<>(sessionFactory, Region.class);
    }
    
    @Override
    public String save(String id,String name){
        if(dao.saveOrDelete(new Region(new BigDecimal(id), name), true)){
            return "Sukses input data!";
        }else{
            return "Maaf coba lagi";
        }
    }
    
    @Override
    public String delete(String id){
        if(dao.saveOrDelete(new Region(new BigDecimal(id)), false)){
            return "Selamat delete berhasil";
        }else{
            return "Maaf coba lagi";
        }
    }
    
    @Override
    public List<Region> getAll(){   
        return dao.getData("");
    }
    
    @Override
    public List<Region> searchBy(Object key){   
        return dao.getData(key);
    }
    @Override
    public Region getById(String key){   
        return dao.getById(new BigDecimal(key));
    }
    
    
    
}
