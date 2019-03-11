/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Country;

/**
 *
 * @author AdhityaWP
 */
public interface CountryControllerInterface {
    public String save(String id,String name, String region);
    public String delete(String id);
    public List<Country> getAll();
    public List<Country> searchBy(Object key);
    public Country getById(Object key);
    
}
