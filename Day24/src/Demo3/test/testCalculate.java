package Demo3.test;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;

public class testCalculate {
    public static void main(String[] args) throws IOException {
        calculate c= new calculate();
        Class cls  = c.getClass();
        Method[] methods = cls.getMethods();

        int num = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("bug.txt",true)));
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        bw.newLine();
        bw.write("本次测试时间为："+ time.toString());
        bw.newLine();
//        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(c);
                }catch (Exception e){
                    num++;
                    bw.write("****************************************");
                    bw.newLine();
                    bw.write(method.getName() + "方法出现异常了");
                    bw.newLine();
                    bw.write("异常的名称: "+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因: "+ e.getCause().getMessage());
                    bw.newLine();
                    bw.write("****************************************");
                }
            }
        }
        bw.newLine();
        bw.write("本次测试一共出现"+num+"次异常");
        bw.newLine();
        bw.write("-----------------------------------------------------------------------------");
        bw.close();

    }
}
