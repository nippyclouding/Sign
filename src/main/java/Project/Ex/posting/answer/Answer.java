package Project.Ex.posting.answer;

import Project.Ex.member.memberDomain.Member;
import Project.Ex.posting.question.Question;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Answer {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private Long answerId;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "serial_id")
    private Member writer;





}
