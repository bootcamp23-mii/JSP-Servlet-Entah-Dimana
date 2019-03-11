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
import models.Country;
import models.Region;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author gerydanu
 */
public class CountryController implements CountryControllerInterface{
    private DAOInterface<Country> dao;

    public CountryController(SessionFactory sessionFactory) {
        dao=new GeneralDAO<>(sessionFactory, Country.class);
    }
    
    
    @Override
     public String save(String id, String name, String region){
        if (dao.saveOrDelete(new Country(id, name, new Region(new BigDecimal(region)) ), true)) {
             return "Sukses input data!";
        }
         return "Maaf Anda Gagal memasukkan data";
    }
    
    @Override
    public String delete(String id){
        if (dao.saveOrDelete(new Country(id), false)) {
             return "Selamat Berhasil menghapus data";
        }
         return "Maaf Anda Gagal menghapus data"; 
    }
        
    @Override
    public List<Country> getAll(){
        return dao.getData("");
    }
    
    @Override
    public List<Country> searchBy(Object key){
        return dao.getData(key);
    }
    
    @Override
    public Country getById(Object key){
        return dao.getById(key);
        
    }

    
}
