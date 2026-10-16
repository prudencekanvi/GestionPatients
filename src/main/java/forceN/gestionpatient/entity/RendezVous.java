package forceN.gestionpatient.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RendezVous {
    long id;
    private Date date;
    private String heure;
    private String statut;
}
