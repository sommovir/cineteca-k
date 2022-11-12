/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.lule.cineteca.logic.enums;

/**
 *
 * @author lele
 */
public enum ErrorCodeEnum {
    DB_USER_NOT_EXISTS(1,"User not exists"),
    DB_USER_ALREADY_EXISTS(2,"User already exists"),
    DB_USER_ALREADY_CONNECTED(3,"User already connected"),
    DB_USER_DELETE(13,"Delete User"),
    DB_USER_CREATE(12,"Create User"),    
    DB_USER_EDIT(14,"Edit User"),    
    DB_USER_GET_BY_ID(4,"Get User by ID"),   
    DB_USER_GET_All(17,"Get all users"), 
    
    DB_FILM_DIRECTOR_DELETE(18,"Delete Film director"),
    DB_FILM_DIRECTOR_CREATE(19,"Create Film director"),    
    DB_FILM_DIRECTOR_EDIT(20,"Edit Film director"),    
    DB_FILM_DIRECTOR_GET_BY_ID(21,"Get Film director by ID"),   
    DB_FILM_DIRECTOR_GET_All(22,"Get all directors"), 
    DB_FILM_DIRECTOR_NOT_EXISTS(23,"Film director not exists"),// ID più alto 
    
    // ----------------------------

    DB_IS_NULL(15,"to complete: ID 15"),

    // ----------------------------
    PASSWORD_ARE_NOT_EQUALS(5,"Password are not equals"),
    PASSWORD_IS_EMPTY(6,"Password is empty"),
    PASSWORD_TOO_SHORT(7,"Password is too short"),
    PASSWORD_TOO_LONG(8,"Password is too long"),
    PASSWORD_IS_NOT_EQUAL(9,"Password has not equal"),
    PASSWORD_HAS_NOT_UPPER_CASE(10,"Password has not upper case"),
    PASSWORD_IS_WRONG(16, "Password is wrong"),
    // ----------------------------    
    PASSWORD_USER_EMPTY(11,"user is empty");

    private int code;
    private String message;
    
    private ErrorCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    
}
