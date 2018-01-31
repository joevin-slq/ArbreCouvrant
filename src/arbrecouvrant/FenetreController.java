package arbrecouvrant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controleur de la vue FXML
 */
public class FenetreController implements Initializable {
   @FXML
   private Graphe graphe;
   
   @FXML
   private void toutEffacer(ActionEvent event)  {
	   graphe.toutEffacer();
   }
   
   @FXML
   private void calculerDistance(ActionEvent event) {
	   graphe.calculDistance();
   }
   
   @Override
   public void initialize(URL url, ResourceBundle rb) {  }
}
