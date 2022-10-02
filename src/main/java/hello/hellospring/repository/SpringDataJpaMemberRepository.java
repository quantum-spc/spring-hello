package hello.hellospring.repository;
import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name); // JPQL select m from Member m where m.name = ?

    // Optional<Member> findByNameAndId(String name); // 메소드명을 기준으로 데이터를 검색해준다. 기본규격이 있음

}