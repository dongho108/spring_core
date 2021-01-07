package hello.core.member;

public class MemberServiceImlp implements MemberService{

    private final MemberRepository memberRepository;

    public MemberServiceImlp(MemberRepository memberRepository) {

        this.memberRepository = memberRepository;

    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById((memberId));
    }

    //test
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }

}
