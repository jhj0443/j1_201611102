package com.sd.hw.first;

public class DisplayNameNum implements Observer, DisplayElement {
 private String name;
 private int phone;
 private Subject person;
 
 public DisplayNameNum(Subject person) {
  this.person = person;
  person.registerObserver(this);
  //person.removeObserver(this);
 }
 
 public void update(String name, int phone) {
  this.name = name;
  this.phone = phone;
  display();
 }
 
 public void display() {
  System.out.println(name+ "은 번호가 010" + phone + "입니다.");
 }
}
