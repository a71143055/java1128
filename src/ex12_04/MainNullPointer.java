package ex12_04;

public class MainNullPointer {
    public static void main(String[] args) {
        NullPointerExceptionTest nulltest = new NullPointerExceptionTest();
        nulltest.addName("김건우");
        nulltest.addName("오형민");
        nulltest.printAllNames();
    }
}
