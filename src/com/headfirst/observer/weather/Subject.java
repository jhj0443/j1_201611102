package headfirst.observer.weather;

//좋은프로그래밍 습관 interface 좀 빼줘라.
public interface Subject{
  //메소드 정의안하고 자바라이브러리 써도됩니다
  //대체 가능합니다 java Observabal로 가능.. 
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}