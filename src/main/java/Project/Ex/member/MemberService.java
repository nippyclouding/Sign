package Project.Ex.member;

import Project.Ex.member.memberDomain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberRepository getMemberRepository(){
        return memberRepository;
    }

    public Member findByLoginIdAndPassword(String loginId, String password){
        return memberRepository.findByLoginIdAndPassword(loginId, password);
    }
}
