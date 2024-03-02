// Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
// Реализовать класс Market и все методы, которые он обязан реализовывать.
// Методы из интерфейса QueueBehaviour, имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет состояние магазина (принимает и отдаёт заказы)


public class Main {
  public static void main(String[] args) {

    Market market = new Market();

    market.addPerson();
    market.update();
    market.delPerson();
    market.update();
  }
}
