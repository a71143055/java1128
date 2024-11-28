package ex12_07;

public class MainThrows {
    public static void main(String[] args) throws MyAgeException {
        ThrowsTest tt = new ThrowsTest();
        try {
            tt.test1();
        } catch (MyAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
