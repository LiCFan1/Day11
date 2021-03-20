package day12;

public class PersonImp implements PersonInterface<String> {
    @Override
    public void func1(String s) {
        System.out.println("My name is "+ s);
    }
}
