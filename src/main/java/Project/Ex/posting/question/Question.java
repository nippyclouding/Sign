package Project.Ex.posting.question;


import Project.Ex.member.memberDomain.Member;
import Project.Ex.posting.answer.Answer;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Question {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long questionId;

    @Column(length = 200) @NotBlank
    private String subject;

    @Column(columnDefinition = "TEXT") @NotBlank
    private String content;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "serial_id")
    private Member writer;

    public Question(Long id, String subject, String content, LocalDateTime createDate, Member writer) {
        this.questionId = id;
        this.subject = subject;
        this.content = content;
        this.createDate = createDate;
        this.writer = writer;
    }
}
