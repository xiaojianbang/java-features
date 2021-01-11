package cn.xiaojianbang.simple;

/**
 * 文本块feature
 * Created by lf on 2021/1/11
 */
public class TextBlocksDemo {
    public static void main(String[] args) {
        beforeJava15TextWriter();
        afterJava15TextWriter();
        afterJava15JsonTextWriter();
    }


    private static void beforeJava15TextWriter() {
        String text = "hello \n" +
                "world \n" +
                "java";

        System.out.println("java15之前文本的书写方式: \n" + text);
        System.out.println("---------------------------------");
    }

    private static void afterJava15TextWriter() {
        String text = """
                      hello
                      world
                      java
                      """;
        System.out.println("java15之后文本的书写方式: \n" + text);
        System.out.println("---------------------------------");
    }

    private static void afterJava15JsonTextWriter() {
        String jsonText = """
                          {
                          "name" : "lf",
                          "age"  : "25",
                          }
                          """;
        System.out.println("java15之后JSON文本的书写方式: \n" + jsonText);
        System.out.println("---------------------------------");
    }
}
