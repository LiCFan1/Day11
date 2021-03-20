package day12;

public class test06 {
    public static void main(String[] args) {
        PersonImp2<String> per2 = new PersonImp2<>();
        per2.func1("Li");
//        per2.func1(2);  报错
        PersonInterface.func2(3);

    }
}
