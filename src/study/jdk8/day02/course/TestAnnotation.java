package study.jdk8.day02.course;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author tuyp
 * @create 2019-02-24 13:05
 */
public class TestAnnotation {



    @Test
    public void test1() throws NoSuchMethodException {
        Class<TestAnnotation> clazz = TestAnnotation.class;

        Method method = clazz.getMethod("show");
        MyAnnotation[] list = method.getAnnotationsByType(MyAnnotation.class);

        Arrays.stream(list).forEach((e)-> System.out.println(e));

    }


    @MyAnnotation("hello")
    @MyAnnotation("world")
    public void show(){

    }
}
