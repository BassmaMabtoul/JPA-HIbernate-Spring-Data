package ma.bassma.tp2app.repository;


import ma.bassma.tp2app.entities.Patient;
import ma.bassma.tp2app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUserName(String userName);
}
