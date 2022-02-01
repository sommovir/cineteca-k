/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.prova.gui.logic;

import it.lule.cineteca.logic.entities.UserEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lele
 */
public class ManagerList {
    private List < UserEntity > entitys = new ArrayList<>();

    public List<UserEntity> getEntitys() {
        return entitys;
    }

    public void setEntitys(List<UserEntity> entitys) {
        this.entitys = entitys;
    }
    
    public void adduserEntity ( UserEntity userEntity ){
        entitys.add(userEntity);
    }

    public UserEntity getUserEntity(int i){
        return entitys.get(i);
    }

    public void removeUserEntity ( UserEntity userEntity ){
        entitys.remove(userEntity);
    }
    
}
