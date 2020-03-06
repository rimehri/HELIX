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
 * @author ASUS
 */
public interface FournisseurI <F> {
      void ajouter(F f) throws SQLException;

    boolean delete(F f) throws SQLException;

    boolean update(F f) throws SQLException;

    List<F> readAll() throws SQLException;
}
