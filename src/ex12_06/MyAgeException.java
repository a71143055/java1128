package ex12_06;

public class MyAgeException extends Exception {

    public MyAgeException() {
        super("내가 만든 예외 발생");
    }

    public MyAgeException(String msg) {
        super(msg);
    }
}
