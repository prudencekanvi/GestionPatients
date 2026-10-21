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
public class Rapport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private Date dateCreation;
    private String type;

    @ManyToOne
    @JoinColumn(name = "administrateur_id")
    private Administrateur administrateur;
}
