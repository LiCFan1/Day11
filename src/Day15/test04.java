package Day15;

import javax.security.auth.login.LoginException;

public class test04 {

    private static String[] names = {"Li","Chao","fan"};
    public static void main(String[] args) {
        try {
            checkUname("Li");
        } catch (RegisterException e) {
            e.printStackTrace();
        }

    }

    public static boolean checkUname(String uname) throws RegisterException{
        for (String name : names) {
            if(uname.equals(name)){
                throw new RegisterException("该名字已被注册！");
            }
        }
        return true;
    }

}
