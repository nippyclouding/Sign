package Project.Ex.member;

import Project.Ex.member.memberDomain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberRepository getMemberRepository(){
        return memberRepository;
    }

    public Member findByLoginIdAndPassword(String loginId, String password){
        return memberRepository.findByLoginIdAndPassword(loginId, password);
    }
}
