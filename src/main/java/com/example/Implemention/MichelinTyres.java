package com.example.Implemention;

import com.example.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyres implements Tyre {
    public String rotate(){
        return "Vehicle moving with Michelin Tyre";
    }
}
