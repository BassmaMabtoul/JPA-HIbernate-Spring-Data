package ma.bassma.tp2app.repository;


import ma.bassma.tp2app.entities.Consultation;
import ma.bassma.tp2app.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
