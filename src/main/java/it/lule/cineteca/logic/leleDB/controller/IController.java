/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.leleDB.controller;

import it.lule.cineteca.logic.exceptions.abstractControllerException.CreateException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.DeleteException;
import it.lule.cineteca.logic.exceptions.abstractControllerException.IsNullException;

/**
 *
 * @author lele
 */
public interface IController<E> {
    public void create(E value) throws IsNullException, CreateException;
    public void edit(E value) throws IsNullException;
    public void delete(E value) throws IsNullException, DeleteException;
}
