package com.sd.turtle;
import java.util.Observer;
import java.util.Observable;
import java.util.ArrayList;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import ch.aplu.turtle.*;
//지난번엔 구현했지만 이번엔 자바꺼 가져다씀
import java.util.Observer;

//자바에서 extends두개이상.. 다중상속은 안됨.... 다중상속하려면
//하나는 인터페이스 하나는 클레스쓰는방법뿐. 
//인터페이스 두개는 가능....!
public class MomTurtle extends Turtle implements Observer{
Double babyCurpos;
    public MomTurtle() {
        //setColor(Color.red);
        //label("mom turtle");
    }
    public void update(Observable o, Object arg) {
        System.out.println("update() called, count is " + ((Integer)arg).intValue()); 
        babyCurpos=((BabyTurtle)o).myCurpos;
        System.out.println("current pos" + babyCurpos);
        moveTo(babyCurpos);
    }

}