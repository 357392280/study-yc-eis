package com.du.study.log;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface LogInfo {
    /**
     *
     * 描述
     */
   String descri();
   String direction();
   int type();
   int systemType();
}
