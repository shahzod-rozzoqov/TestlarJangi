package uz.shoh.testlarjangibot.entitys.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.shoh.testlarjangibot.entitys.user.entiry.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
