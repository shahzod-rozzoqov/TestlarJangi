package uz.shoh.testlarjangibot.entitys.testSubmission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.shoh.testlarjangibot.entitys.testSubmission.entity.TestSubmission;

@Repository
public interface TestSubmissionRepository extends JpaRepository<TestSubmission, String> {
    TestSubmission findByUserIdAndTestId(String userId, Integer testId);

}
