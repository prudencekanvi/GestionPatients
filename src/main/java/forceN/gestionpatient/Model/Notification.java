package forceN.gestionpatient.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Notification  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private  String message;
    private String type;
    private Date dateEnvoi;
    private String statut;



}
