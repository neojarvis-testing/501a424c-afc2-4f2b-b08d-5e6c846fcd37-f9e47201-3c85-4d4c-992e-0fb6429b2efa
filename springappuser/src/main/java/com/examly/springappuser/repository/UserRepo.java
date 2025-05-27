package main.java.com.examly.springappuser.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import main.java.com.examly.springappuser.model.User;

// @Repository
public interface UserRepo extends JpaRepository<User, Long>{

    boolean findByEmail(String email);
    
}
