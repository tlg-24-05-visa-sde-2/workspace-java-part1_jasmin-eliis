import org.w3c.dom.ls.LSOutput;

class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setVolume(0);
        System.out.println(tv);

        tv.setVolume(100);
        System.out.println(tv);

        tv.setVolume(-1);
        tv.setVolume(101);
        System.out.println(tv);
    }
}