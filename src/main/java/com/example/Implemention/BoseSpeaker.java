package com.example.Implemention;

import com.example.interfaces.Speaker;
import org.springframework.stereotype.Component;


@Component
public class BoseSpeaker implements Speaker {

    public String makesound(){
        return "Playing music with bose speakers";
    }
}
