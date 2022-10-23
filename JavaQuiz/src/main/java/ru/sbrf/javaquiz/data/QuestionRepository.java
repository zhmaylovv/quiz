package ru.sbrf.javaquiz.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sbrf.javaquiz.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
