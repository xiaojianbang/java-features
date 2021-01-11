package cn.xiaojianbang.simple;

/**
 * 类与接口的密封性
 * @see sealed
 * @see permits
 * @since jdk15
 * Created by lf on 2021/1/11
 */
public sealed class Person permits Man,Woman,Worker{
    // sealed 表示对Person进行密封
    // permits 表示仅对xxx 类开放继承
}

/**
 * 加final 表示不能再被继承
 */
final class Woman extends Person{

}

final class Man extends Person{

}

/**
 * non-sealed 解除密封，该类可不被限制继承
 */
non-sealed class Worker extends Person{

}
