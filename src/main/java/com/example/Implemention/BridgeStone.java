package com.example.Implemention;

import com.example.interfaces.Tyre;

public class BridgeStone implements Tyre {
    @Override
    public String rotate() {
        return "Vehicle moving with BridgeStone tyres";
    }
}
