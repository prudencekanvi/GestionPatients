package forceN.gestionpatient.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Creneau {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
    private Date date;
    private String heureDebut;
    private String heureFin;
    private boolean disponible;

    @ManyToOne
    @JoinColumn(name = "planning_id")
    private Planning planning;
}
