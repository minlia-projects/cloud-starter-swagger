package com.minlia.cloud.swagger.annotation;

import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import org.springframework.stereotype.Component;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface ApiSpecification {

  /**
   * 分组名称
   * @return
   */
  public  String name();

  /**
   * 路径配置
   * @return
   */
  public  String path();

}
