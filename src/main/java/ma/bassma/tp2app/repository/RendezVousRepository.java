package ma.bassma.tp2app.repository;


import ma.bassma.tp2app.entities.Patient;
import ma.bassma.tp2app.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}
