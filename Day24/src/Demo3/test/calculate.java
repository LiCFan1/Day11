package Demo3.test;

public class calculate {
    @Check
    public void add() {
        System.out.println("1 + 0 = " + (1 + 0));
    }

    @Check
    public void div() {
        System.out.println("1 / 0 =" + (1 / 0));
    }

    @Check
    public void mul() {
        System.out.println("1 * 0 =" + (1 * 0));
    }

    @Check
    public void sub() {
//        String str = null;
//        str.toString();
        System.out.println("1 - 0 =" + (1 - 0));
    }
}
