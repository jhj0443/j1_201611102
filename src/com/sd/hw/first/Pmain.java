package com.sd.hw.first;

import java.util.*;
import java.util.Scanner;

public class Pmain {

 public static void main(String[] args) {
  PersonData person = new PersonData();
 
  DisplayNameNum currentDisplay = 
   new DisplayNameNum(person);
  person.setMeasurements("���1", 39284722);
  person.setMeasurements("���2", 70997241);
   person.setMeasurements("���3", 90382003);
  System.out.println("1�� �߰�\n2�� ����");
  Scanner a = new Scanner(System.in);
  int num =a.nextInt();
  if(num==1){
    System.out.println("�̸��Է����ּ���");
    Scanner b = new Scanner(System.in);
    String n = b.next();
  System.out.println("010 �� 8���� �Է����ּ���");
    Scanner c= new Scanner(System.in);
    int p = c.nextInt();
    System.out.println("�߰� : ");
    person.setMeasurements(n, p);
    //person.measurementsChanged();
    
  }
  else if(num==2){
  System.out.println("���° ��� �����ϽǷ���? : ");
  person.removeObserver(currentDisplay);
  System.out.println("�����Ǿ����ϴ�.");
  
  }
 }
}