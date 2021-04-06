package Demo2;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class test05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.1 构建属性集，用于保存读取到的文件的信息，保存为键值对的形式
        Properties prop = new Properties();
        // 1.2 从该类的class文件中获取ClassLoader
        ClassLoader classLoader = test05.class.getClassLoader();
        // 1.3 由ClassLoader获取目标文件的内容，并将其转换为流
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        // 1.4 将流内容保存到属性集中
        prop.load(is);

        // 2.通过属性集获取类的名称和方法
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        // 3.构建类的Class对象，并由class对象构建类Object、以及方法Method
        Class cls = Class.forName(className);
        Object o = cls.getConstructor().newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);
    }
}
