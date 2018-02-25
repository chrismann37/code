package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private TextField txtUsername;

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;
    
    @FXML
    private Label lblMessage;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        
    }
    
    @FXML
    void handleBtnLogin(ActionEvent event) {
    	
    	CheckLogin login = new CheckLogin(txtUsername.getText(), txtPassword.getText());
    	if (login.login()) {
    		try 
            {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainScreen.fxml"));
                Parent root = (Parent)fxmlLoader.load();
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setTitle("Main Screen");
                stage.setScene(scene);
                stage.show();

                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
            catch (IOException ex) 
            {
            	System.out.println("Error: " + ex);
            }
    	}
    	else {
    		lblMessage.setText("Login failed.");
            lblMessage.setTextFill(Color.RED);
    	}
    }
}
