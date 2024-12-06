package practice.member;

public class Test {
    public static void main(String[] args) {
        //멤버 저장소 객체 생성
        MemberRepository mr = new MemberRepository();

        // 회원 데이터 추가
        mr.addMember(new Member("pppp@naver.com", "3333", "말포이", Gender.MALE, 8));

        //이메일 중복 검사
        boolean flag = mr.isDuplicateEmail("ppp1234@lll.com");
        System.out.println(flag);

        Member[] members = mr.getMembers();
        for (Member m : members) {
            m.inform();
        }

    }
}
