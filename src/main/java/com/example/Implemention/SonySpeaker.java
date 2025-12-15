package com.example.Implemention;

import com.example.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeaker implements Speaker {


    public String makesound(){
        return "Playing music with Sony speakers";
    }
}
