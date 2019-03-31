package com.itgo.highConcurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用来标记线程安全的类或者写法
 */
@Target(ElementType.TYPE)  //注解作用目标： 类(TYPE)上
@Retention(RetentionPolicy.SOURCE)  //在编译时会被忽略掉
public @interface ThreadSafe {
    String value() default "";
}
