
package ifro.edu.br.control;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HistoricoController {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    
}
