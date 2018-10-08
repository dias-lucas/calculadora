package ifro.edu.br.control;

import ifro.edu.br.model.historico;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CalculadoraController implements Initializable {

    @FXML
    private TextField txtResultado;
    @FXML
    private TextField txtUm;
    @FXML
    private TextField txtDois;
    @FXML
    private Button btnSoma;
    @FXML
    private Button btnDividi;
    @FXML
    private Button btnSubtrair;
    @FXML
    private Button btnMultiplicar;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    

    @FXML
    private void somar(ActionEvent event) {
       Double num1 = Double.parseDouble(txtUm.getText());
       Double num2 = Double.parseDouble(txtDois.getText());
       Double result;
       
       result = (num1 + num2);
       
       txtResultado.setText(result.toString());
       
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
        EntityManager em = emf.createEntityManager();
        
        historico historico1 = new historico();
        
    }

    @FXML
    private void dividir(ActionEvent event) {
        Double num1 = Double.parseDouble(txtUm.getText());
        Double num2 = Double.parseDouble(txtDois.getText());
        Double result;
        
        result = (num1 / num2);
        
        txtResultado.setText(result.toString());
    }

    @FXML
    private void subtrai(ActionEvent event) {
        Double num1 = Double.parseDouble(txtUm.getText());
        Double num2 = Double.parseDouble(txtDois.getText());
        Double result;
       
        result = (num1 - num2);
        
        txtResultado.setText(result.toString());
    }

    @FXML
    private void multiplica(ActionEvent event) {
        Double num1 = Double.parseDouble(txtUm.getText());
        Double num2 = Double.parseDouble(txtDois.getText());
        Double result;
        
        result = (num1 * num2);
        
        txtResultado.setText(result.toString());
    }
    
}
