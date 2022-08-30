/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.enumname;

/**
 *
 * @author lele
 */
public enum QueryEnum {
    BY_USER_NAME("SELECT a FROM CUserEntity a WHERE a.user=:user"),
    BY_USER_ID("SELECT a FROM CUserEntity a WHERE a.id=:id");
        
    private String query;

    private QueryEnum(String query) {
        this.query = query;
    }

    public String byUserName(String user) {
       return query.replace(":user", "'" + user +"'");
    }

    public String byUserID(String id) {
       return query.replace(":id", "'" + id +"'");
    }

    
    
//    public String getQuery() {
//        return query;
//    }
    
//    public void setQuery(String query) {
//        this.query = query;
//    }

}
