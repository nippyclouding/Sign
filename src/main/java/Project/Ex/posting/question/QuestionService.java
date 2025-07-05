package Project.Ex.posting.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class QuestionService  {

    private final QuestionRepository questionRepository;

    public QuestionRepository getQuestionRepository() {
        return questionRepository;
    }
}
