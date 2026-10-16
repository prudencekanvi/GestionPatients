package forceN.gestionpatient.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notification  {
    long id;
    private  String message;
    private String type;
    private Date dateEnvoi;
    private String statut;



}
