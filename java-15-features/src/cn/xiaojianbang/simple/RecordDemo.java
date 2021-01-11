package cn.xiaojianbang.simple;

/**
 * Created by lf on 2021/1/11
 */
public class RecordDemo {
    public static void main(String[] args) {
        User user = new User("lf","123456",25);
        System.out.println(user);
        System.out.println(user.username()); // 实例变量的get()
        System.out.println(user.password()); // 实例变量的get()
        System.out.println(user.age());
    }
}
