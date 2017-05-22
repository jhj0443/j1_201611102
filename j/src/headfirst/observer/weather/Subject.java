package headfirst.observer.weather;

//�������α׷��� ���� interface �� �����.
public interface Subject{
  //�޼ҵ� ���Ǿ��ϰ� �ڹٶ��̺귯�� �ᵵ�˴ϴ�
  //��ü �����մϴ� java Observabal�� ����.. 
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}