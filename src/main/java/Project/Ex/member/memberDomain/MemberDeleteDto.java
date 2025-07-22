package Project.Ex.member.memberDomain;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberDeleteDto {

    @NotBlank(message = "비밀번호를 입력해주세요.")
    private String password;

    public boolean isPasswordValid(String storedPassword) {
        return this.password != null && this.password.equals(storedPassword);
    }
    public Member toEntity() {
        return new Member(null, password, null);
    }
}
