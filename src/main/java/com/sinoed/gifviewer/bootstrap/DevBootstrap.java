package com.sinoed.gifviewer.bootstrap;

import com.sinoed.gifviewer.model.Gif;
import com.sinoed.gifviewer.model.User;
import com.sinoed.gifviewer.repository.GifRepository;
import com.sinoed.gifviewer.repository.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final GifRepository gifRepository;
    private final UserRepository userRepository;

    public DevBootstrap(GifRepository gifRepository, UserRepository userRepository) {
        this.gifRepository = gifRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        User user = new User("Amir");
        LocalDate localDate = LocalDate.of(1999,2,4);
        Gif gif = new Gif("gif",localDate,true, user);

        user.getGif().add(gif);


        userRepository.save(user);
        gifRepository.save(gif);

    }
}
