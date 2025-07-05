package Project.Ex.member;

import Project.Ex.member.memberDomain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByLoginIdAndPassword(String loginId, String password);
}
