/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Fournisseur;
import IService.FournisseurI;
import Utility.DataBase;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


/**
 *
 * @author ASUS
 */
public class  ServicesFournisseur implements FournisseurI<Fournisseur> {
     private Connection con;
    private Statement ste;

    public ServicesFournisseur() {
        con = DataBase.getInstance().getConnection();
    }

    @Override
    public void ajouter(Fournisseur f) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Fournisseur f) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Fournisseur f) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Fournisseur> readAll() throws SQLException {
       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
          
}
