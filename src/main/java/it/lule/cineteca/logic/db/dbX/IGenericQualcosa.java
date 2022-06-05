/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.lule.cineteca.logic.db.dbX;

import java.util.List;

/**
 *
 * @author lele
 * @param <A>
 */
public interface IGenericQualcosa < A > {
    public void create(A a);
    public void edit(A a);
    public void delete(A a);
    public A getById(A a);
    public List<A> getAll(A a);
}
