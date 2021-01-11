package cn.xiaojianbang.simple;

/**
 * Created by lf on 2021/1/11
 */
public class InstanceofDemo {

    public static void main(String[] args) {
        Object object = new String("hello world!");
        if (object instanceof String){
           String str = (String) object;
            System.out.println(str.contains("hello"));
        }else {
            System.out.println("非String类型");
        }

        java15Feature(object);
    }

    /**
     * java15 新特性
     * @param object
     */
    private static void java15Feature(Object object) {
        object = null;
        if (object instanceof String str){
            System.out.println(str.contains("hello"));
        }else {
            System.out.println("非String类型");
        }

    }
}
