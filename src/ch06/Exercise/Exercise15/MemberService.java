package ch06.Exercise.Exercise15;

public class MemberService {
    static final String id = "hong";
    static final String password = "12345";

    public boolean login(String id, String password) {
        if (this.id == id) {
            if (this.password == password) {
                return true;
            }
        }
        return false;
    }

    public void logout(String id) {
        System.out.println("로그아웃 되었습니다.");
    }
}
