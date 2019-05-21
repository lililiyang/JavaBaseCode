package ly.basetest.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义注解
 * @Retention只能用于修饰其他的Annotation，用于指定被修饰的Annotation被保留多长时间。
 * @Retention默认是class，而反射是在运行时期来获取信息的。因此就获取不到Annotation的信息了。于是，就得在自定义注解上修改它的RetentionPolicy值
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    //定义了两个成员变量  语法类似声明方法
    String username();
    int age();
}
