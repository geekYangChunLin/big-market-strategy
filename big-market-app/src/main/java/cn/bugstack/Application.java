package cn.bugstack;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 晴雨
 */
@SpringBootApplication
@Configurable
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

}
