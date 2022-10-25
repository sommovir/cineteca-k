/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.controller;

/**
 *
 * @author lele
 */
public class Search {

    public static String userByUserName(String user) {
        String query = "SELECT a FROM CUserEntity a WHERE a.user= :user";
        query = query.replace(":user", "'" + user +"'");
        return query;
    }

    public static String userAllUsers() {
        String query = "SELECT a FROM CUserEntity a WHERE a";
        return query;
    }

    public static String userByUserID(String id) {
        String query = "SELECT a FROM CUserEntity a WHERE a.id=:id";
        query = query.replace(":id", "'" + id +"'");
        return query;
    }

    public static String filmDirectorByUserName(String name) {
        String query = "SELECT a FROM FilmDirectorEntity a WHERE a.name= :name";
        query = query.replace(":name", "'" + name +"'");
        return query;
    }

    public static String filmDirectorBySurname(String surname) {
        String query = "SELECT a FROM FilmDirectorEntity a WHERE a.surname= :surname";
        query = query.replace(":surname", "'" + surname +"'");
        return query;
    }

    public static String filmDirectorByDateOfBirth(String dateOfBirth) {
        String query = "SELECT a FROM FilmDirectorEntity a WHERE a.dateOfBirth= :dateOfBirth";
        query = query.replace(":dateOfBirth", "'" + dateOfBirth +"'");
        return query;
    }

    public static String filmDirectorByUserID(String id) {
        String query = "SELECT a FROM FilmDirectorEntity a WHERE a.id= :id";
        query = query.replace(":id", "'" + id +"'");
        return query;
    }

    public static String movieEntityByUserID(String id) {
        String query = "SELECT a FROM MovieEntity a WHERE a.id= :id";
        query = query.replace(":id", "'" + id +"'");
        return query;
    }

    public static String movieEntityByMainActor(String mainActor) {
        String query = "SELECT a FROM MovieEntity a WHERE a.mainActor= :mainActor";
        query = query.replace(":mainActor", "'" + mainActor +"'");
        return query;
    }

    public static String movieEntityByReleaseDate(String releaseDate) {
        String query = "SELECT a FROM MovieEntity a WHERE a.releaseDate= :releaseDate";
        query = query.replace(":releaseDate", "'" + releaseDate +"'");
        return query;
    }

    public static String movieEntityByoriginalTitle(String originalTitle) {
        String query = "SELECT a FROM MovieEntity a WHERE a.originalTitle= :originalTitle";
        query = query.replace(":originalTitle", "'" + originalTitle +"'");
        return query;
    }

    public static String movieEntityByTranslatedTitle(String translatedTitle) {
        String query = "SELECT a FROM MovieEntity a WHERE a.translatedTitle= :translatedTitle";
        query = query.replace(":translatedTitle", "'" + translatedTitle +"'");
        return query;
    }

}
