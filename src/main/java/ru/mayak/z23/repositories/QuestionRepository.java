package ru.mayak.z23.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mayak.z23.domain.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    //Iterable<Question> findAllOrOrderById();
}
