/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Ach
 */
public class AccController implements Initializable {

    @FXML
    private Button btn_admin;
    @FXML
    private ImageView img_admin;
    @FXML
    private Button btn_user;jb ,l;: kl;
    @FXML
    private ImageView img_user;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Admin(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminLivreur.fxml"));
            
                Parent root = loader.load();
              AdminLivreurController alc = loader.getController();
               
                btn_admin.getScene().setRoot(root);
    }

    @FXML
    private void User(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UserLivraison.fxml"));
            
                Parent root = loader.load();
                UserLivraisonController ulc = loader.getController();
                
                btn_user.getScene().setRoot(root);
    }
}
