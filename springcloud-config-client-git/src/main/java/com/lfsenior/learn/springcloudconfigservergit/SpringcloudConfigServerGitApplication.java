package com.lfsenior.learn.springcloudconfigservergit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringcloudConfigServerGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServerGitApplication.class, args);
    }

}
