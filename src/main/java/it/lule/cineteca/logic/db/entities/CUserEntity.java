/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.db.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;


        

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it> ISTC-CNR
 */

@Entity

@NamedQueries({   
@NamedQuery(name= "User", query = "SELECT a FROM CUserEntity a WHERE a.user=:user"),
})

public class CUserEntity implements Serializable {
   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true, length = 120)
    private String user;
    private String password;    

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CUserEntity)) {
            return false;
        }
        CUserEntity other = (CUserEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "videoteca.Film[ id=" + id + " ]";
    }
    
}
