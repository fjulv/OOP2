package homework2;

public class Market implements I_QueueBehaviour, I_MarketBehaviour {
    private String goods;
    private String namePersonal;
    private int idBuyer;

    public Market(String goods, String namePersonal, int idBuyer) {
        this.goods = goods;
        this.namePersonal = namePersonal;
        this.idBuyer = idBuyer;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getNamePersonal() {
        return namePersonal;
    }

    public void setNamePersonal(String namePersonal) {
        this.namePersonal = namePersonal;
    }

    public int getIdBuyer() {
        return idBuyer;
    }

    public void setIdBuyer(int idBuyer) {
        this.idBuyer = idBuyer;
    }

    @Override
    public void getInLine() {
        System.out.println("Встал в очередь...");
    }

    @Override
    public void leaveQueue() {
        System.out.println("Покинул очередь...");
    }

    @Override
    public void goAheade() {
        System.out.println("Продвинулся в очереди...");
    }

    @Override
    public void addPerson() {
        System.out.println("Очередь увеличена на 1 человека...");
    }

    @Override
    public void removePerson() {
        System.out.println("Очередб уменьшилась на 1 человека...");
    }

    public void update() {
        acceptOrder();
        giveOrder();
        System.out.println("Состояние магазина обновлено, все заказы получены, все заказы отданы.");
    }


    private void acceptOrder() {
        System.out.println("Заказ принят...");
    }

    private void giveOrder() {
        System.out.println("Заказ отдан");
    }
}
