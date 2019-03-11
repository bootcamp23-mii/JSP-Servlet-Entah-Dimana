/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Region;

/**
 *
 * @author AdhityaWP
 */
public interface RegionControllerInterface {
    public String save(String id,String name);
    public String delete(String id);
    public List<Region> getAll();
    public List<Region> searchBy(Object key);
    public Region getById(String key);
    
    
}
