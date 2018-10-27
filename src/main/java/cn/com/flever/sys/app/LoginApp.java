package cn.com.flever.sys.app;

import cn.com.flever.common.app.BaseApp;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

public class LoginApp  extends BaseApp{

  public static void main(String[] args){
    SpringApplication.run(LoginApp.class,args);
  }


}
