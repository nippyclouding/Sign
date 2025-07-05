package Project.Ex.posting.answer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;

    public AnswerRepository getAnswerRepository() {
        return answerRepository;
    }

}
