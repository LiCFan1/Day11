package Demo3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

@PropAnno(className = "domain.Student",method = "learn")
public class test02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.获取本类的Class对象
        Class<test02> test02Class = test02.class;
        // 2.通过class对象获取在该类之上加的注解，解析注解，获取注解对象
        PropAnno an = test02Class.getAnnotation(PropAnno.class);
        // 3，通过注解对象获取相应的属性：类名、方法名
        String name = an.className();
        String method = an.method();
        System.out.println(name);
        System.out.println(method);
        //通过类名和方法名创建对象和调用方法，利用了反射的机制
        Class cls = Class.forName(name);
        Object o = cls.getConstructor().newInstance();
        Method m1 = cls.getMethod(method);
        m1.invoke(o);
    }
}
