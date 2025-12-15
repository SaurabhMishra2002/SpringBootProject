package com.example.Services;

import com.example.interfaces.Speaker;
import com.example.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    public Speaker getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speaker speakers) {
        this.speakers = speakers;
    }

    public Tyre getTyres() {
        return tyres;
    }

    @Autowired
    public void setTyres(Tyre tyres) {
        this.tyres = tyres;
    }

    @Autowired
        private Speaker speakers;
        private Tyre tyres;

        public void MoveVehicle(){
            String status = speakers.makesound();
            System.out.println(status);
        }

        public void playMusic(){
            String status1 = tyres.rotate();
            System.out.println(status1);

        }
}
