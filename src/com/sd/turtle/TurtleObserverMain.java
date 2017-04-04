package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import ch.aplu.turtle.*;
  
public class TurtleObserverMain{
    public static void main(String[] args) {
        System.out.println("--Observer pattern demo");
        //turtle subject
        BabyTurtle baby=new BabyTurtle();
        //turtle observer
        MomTurtle mom=new MomTurtle();
        baby.addObserver(mom);
        //웨더할때는 디스플레이스에서 여기서는 메인에서해줌.
        mom.moveTo(100,100);
        baby.move(100,-100);
        baby.setChanged();
        baby.notifyObservers();
    }
  }