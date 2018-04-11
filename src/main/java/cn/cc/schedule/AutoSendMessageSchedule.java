package cn.cc.schedule;

import cn.cc.service.UserService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AutoSendMessageSchedule {

    @Resource
    private UserService userService;

    @Scheduled(cron = "0/5 * * * * ?")
    public void autoSendMessage(){
        System.out.println("ok");
    }
}
