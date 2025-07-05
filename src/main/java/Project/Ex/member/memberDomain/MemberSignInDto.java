package Project.Ex.member.memberDomain;

import Project.Ex.member.MemberRepository;
import Project.Ex.member.MemberService;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class MemberSignInDto {



    @NotBlank(message = "ID는 필수입니다.")
    private String loginId;

    @NotBlank(message = "비밀번호는 필수입니다.")
    private String password;

    public Member toEntity() {
        return new Member(loginId, password, null);
    }
}
