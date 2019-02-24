package study.jdk8.day02.course;

import java.lang.annotation.*;

/**
 * @author tuyp
 * @create 2019-02-24 13:03
 */

@Repeatable(MyAnnotations.class)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER,ElementType.CONSTRUCTOR,ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String value() default  "tuyp";
}
