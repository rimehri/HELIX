/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Livreur;
import IService.ILivreur;
import Utility.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ach
 */
public class ServiceLivreur implements ILivreur<Livreur> {

    private Connection con;
    private Statement ste;

    public ServiceLivreur() {
        con = DataBase.getInstance().getConnection();

    }

    /* ajout */
    @Override
    public void ajouter(Livreur l) throws SQLException {
        ste = con.createStatement();
        String requeteInsert = "INSERT INTO livreur (`id`, `nom`, `prenom`, `telephone`, `adresse`, `password`, `specialite`) "
                + "VALUES (NULL, '" + l.getNom() + "', '" + l.getPrenom() + "', '" + l.getTelephone() + "', '" + l.getAdresse() + "', '" + l.getPassword() + "', '" + l.getSpecialite() + "');";
        ste.executeUpdate(requeteInsert);
        JOptionPane.showMessageDialog(null, "livreur ajouté avec succes");
    }

    /* update */
    @Override
    public void update(String nomm, String prenom, int telephone, String adresse, String password, String specialite) {
        try {
            PreparedStatement pt = con.prepareStatement("UPDATE livreur SET `prenom` = ? , `telephone` = ? , `adresse` = ? , `password` = ? , `specialite` = ? where `nom` = '" + nomm + "' ;");

            pt.setString(1, prenom);
            pt.setInt(2, telephone);
            pt.setString(3, adresse);
            pt.setString(4, password);
            pt.setString(5, specialite);

            pt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceLivreur.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /* suppression */
    @Override
    public void supprimer(String nomm) {

        try {
            PreparedStatement pt = con.prepareStatement(" DELETE FROM `livreur` WHERE `livreur`.`nom` = '" + nomm + "' ;");

            pt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceLivreur.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public int recuperer_i(String t) throws SQLException {
        int arr = 0;
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select  livreur.id from  livreur where livreur.nom = '" + t + "' ;");

        while (rs.next()) {
            int id = rs.getInt("id");

            arr = id;
        }
        return arr;
    }

    public void supprimer_id(int id) {

        try {
            PreparedStatement pt = con.prepareStatement(" DELETE FROM `livreur` WHERE `livreur`.`id` = '" + id + "' ;");

            pt.execute();
            JOptionPane.showMessageDialog(null, "livreur supprimé avec succes");

        } catch (SQLException ex) {
            Logger.getLogger(ServiceLivreur.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    /*tri */
    @Override
    public List<Livreur> trier() throws SQLException {
        List<Livreur> arr = new ArrayList<>();
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select * from livreur order by id desc");
        while (rs.next()) {
            int id = rs.getInt(1);
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String adresse = rs.getString("adresse");
            int telephone;
            telephone = rs.getInt("telephone");
            String password;
            password = rs.getString("password");
            String specialite = rs.getString("specialite");
            Livreur l = new Livreur(id, nom, prenom, telephone, adresse, password, specialite);
            arr.add(l);
        }
        return arr;
    }

    /* recherche */
    /**
     *
     * @return @throws SQLException
     */
    /*    Affichage   */
    @Override
    public List<Livreur> readAll() throws SQLException {
        List<Livreur> arr = new ArrayList<>();
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select * from livreur");
        while (rs.next()) {
            int id = rs.getInt(1);
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String adresse = rs.getString("adresse");
            String specialite = rs.getString("specialite");
            String password;
            password = rs.getString("password");
            int telephone = rs.getInt("telephone");
            Livreur l = new Livreur(id, nom, prenom, telephone, adresse, password, specialite);
            arr.add(l);
        }
        return arr;
    }

    public List<Livreur> read() throws SQLException {
        List<Livreur> arr = new ArrayList<>();
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select id,nom,specialite from livreur");
        while (rs.next()) {
            int id = rs.getInt(1);
            String nom = rs.getString("nom");
            String specialite = rs.getString("specialite");
            Livreur l = new Livreur(nom, id, specialite);
            arr.add(l);
        }
        return arr;
    }

    public List<Livreur> RECHERCHER(String nomm) throws SQLException {
        List<Livreur> arr = new ArrayList<>();
        ste = con.createStatement();
        ResultSet rs = ste.executeQuery("select * from livreur where nom = '" + nomm + "' ");
        while (rs.next()) {
            int id = rs.getInt(1);
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            String adresse = rs.getString("adresse");
            String specialite = rs.getString("specialite");
            String password;
            password = rs.getString("password");
            int telephone = rs.getInt("telephone");
            Livreur l = new Livreur(id, nom, prenom, telephone, adresse, password, specialite);
            arr.add(l);
        }
        return arr;
    }

    @Override
    public List<Livreur> RECHERCHER(int idd) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
