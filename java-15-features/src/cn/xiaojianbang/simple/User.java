package cn.xiaojianbang.simple;

/**
 * Created by lf on 2021/1/11
 */
public record User(String username,String password,Integer age) {
    public User(){
        this(null,null,null);
    }
}
