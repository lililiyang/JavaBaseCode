package ly.basetest.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 使用自定义注解
 */
public class UseAnnotation {

    @MyAnnotation(username = "小红",age = 18)
    public void add(String name,int age){
        System.out.println(name + age);
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //反射出该类得方法
        Class<UseAnnotation> userAnnotationClass = UseAnnotation.class;
        Method add = userAnnotationClass.getMethod("add", String.class, int.class);

        //通过方法得到注解上的具体信息
        MyAnnotation annotation = add.getAnnotation(MyAnnotation.class);
        String username = annotation.username();
        int age = annotation.age();

        //调用方法
        UseAnnotation o = userAnnotationClass.newInstance();
        add.invoke(o, username, age);

    }
}
