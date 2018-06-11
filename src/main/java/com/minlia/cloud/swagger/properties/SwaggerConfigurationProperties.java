package com.minlia.cloud.swagger.properties;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("swagger")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SwaggerConfigurationProperties {

  String title = "APPLICATION.NAME";

  String version = "APPLICATION.VERSION";

  String path = "/api/.*";
  String description = "Minlia Cloud Api Documentations";
  String contact = "cloud@minlia.com";

//  List<ApiSpecification> specs;

  String keyName="X-Auth-Token";
  String passAs="header";


  boolean redirect = false;

}
