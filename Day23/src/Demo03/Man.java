package Demo03;

public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("Man");
    }

    public void method(Greetable g){
        g.greet();
    }

    public void show(){
        method(super::sayHello);
    }
}
