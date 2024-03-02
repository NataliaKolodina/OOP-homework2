public class Market implements QueueBehaviour, MarketBehaviour {

  @Override
  public void addPerson() {
    System.out.println("Добавлен человек в очередь");
  }

  @Override
  public void delPerson() {
    System.out.println("Удален человек из очереди");
  }

  @Override
  public void update() {
    System.out.println("Очередь обновлена");
  }

}