/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.enumname;

/**
 *
 * @author lele
 */
public enum QueryEnum1 {
    QUERY_USER("SELECT a FROM CUserEntity a WHERE a.user=:user");
    
    private String query;

    private QueryEnum1(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public String getQuery(String user) {
       return query.replace(":user", "'" + user +"'");
    }

    public void setQuery(String query) {
        this.query = query;
    }

}