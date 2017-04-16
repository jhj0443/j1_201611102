package com.sd.hw.first;

import java.util.*;
import java.util.Scanner;

public class Pmain {

 public static void main(String[] args) {
  PersonData person = new PersonData();
 
  DisplayNameNum currentDisplay = 
   new DisplayNameNum(person);
  person.setMeasurements("사람1", 39284722);
  person.setMeasurements("사람2", 70997241);
   person.setMeasurements("사람3", 90382003);
  System.out.println("1번 추가\n2번 삭제");
  Scanner a = new Scanner(System.in);
  int num =a.nextInt();
  if(num==1){
    System.out.println("이름입력해주세요");
    Scanner b = new Scanner(System.in);
    String n = b.next();
  System.out.println("010 뒤 8숫자 입력해주세요");
    Scanner c= new Scanner(System.in);
    int p = c.nextInt();
    System.out.println("추가 : ");
    person.setMeasurements(n, p);
    //person.measurementsChanged();
    
  }
  else if(num==2){
  System.out.println("몇번째 사람 삭제하실래요? : ");
  person.removeObserver(currentDisplay);
  System.out.println("삭제되었습니다.");
  
  }
 }
}