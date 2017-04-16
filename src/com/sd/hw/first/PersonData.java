package com.sd.hw.first;
import java.util.*;

public class PersonData implements Subject {
 private ArrayList observers;
 private String name;
 private int phone;
 
 public PersonData() {
  observers = new ArrayList();
 }
 
 public void registerObserver(Observer o) {
  observers.add(o);
 }
 
 public void removeObserver(Observer o) { 
  Scanner dd=new Scanner(System.in);
  int i = dd.nextInt();
  i = observers.indexOf(o);
  if (i >= 0) {
   observers.remove(i);
  }
 }
 
 public void notifyObservers() {
  for (int i = 0; i < observers.size(); i++) {
   Observer observer = (Observer)observers.get(i);
   observer.update(name, phone);
  }
 }
 
 public void measurementsChanged() {
  notifyObservers();
 }
 
 public void setMeasurements(String name, int phone) {
  this.name =name;
  this.phone = phone;
  measurementsChanged();
 }
 
 public String getName() {
  return name;
 }
 
 public int getphone() {
  return phone;
 }

}