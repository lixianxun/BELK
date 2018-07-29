import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@SpringBootApplication
public class SpringBootLog4j2Application implements ApplicationRunner {
 
    public static void main(String[] args) {
        SpringApplication.run(SpringBootLog4j2Application.class, args);
    }
 
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.debug("Debugging log");
        log.info("Info log");
        log.warn("Hey, This is a warning!");
        log.error("jack! We have an Error. OK");
        log.fatal("xishuai! Fatal error. Please fix me.");
    }
 
@RequestMapping("/log")
    public String log() {
 
        log.error("{\"msg\":\"出现一个异常错误：请求连接失败\",\"level\":\"ERROR\",\"createTime\":\"2018-7-28 20:22:22\",\"provider\":\"xishuai\",\"ip\":\"192.168.1.11\",\"stackTrace\":\"java.lang.Exception\\n\\tat com.example.log_demo.LogDemoTests.logCustomField(LogDemoTests.java:33)\\n\\tat org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:191)\\n\\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\\n\\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\\n\\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\\n\\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\\n\\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\\n\",\"tag\":\"\",\"url\":\"\"}");
 
        return "Hello World ----spring-boot-log4j2";
    }
}
