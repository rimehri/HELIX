/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IService;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ach
 */
public interface ILivreur<T>{
    void ajouter(T t) throws SQLException;
    void supprimer (String nomm) ;
    public void supprimer_id(int id);
    void update(String nomm,String prenom, int telephone ,String adresse,String password,String specialite) ;
    List<T> readAll() throws SQLException;
    List<T> trier() throws SQLException;
    List<T> RECHERCHER(int idd) throws SQLException;
}
