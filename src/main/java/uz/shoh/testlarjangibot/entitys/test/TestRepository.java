package uz.shoh.testlarjangibot.entitys.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.shoh.testlarjangibot.entitys.test.entity.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {
}
