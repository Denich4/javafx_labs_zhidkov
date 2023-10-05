interface AnyEntity {
    void do_anything(Order order);
}

class Order {
    Integer id;
    OrderType orderType;
    OrderVeriety orderVeriety;
    Currency currency;
    String tiker;
    Integer number;
    Integer count;
    String data;
    String duration;

    @Override
    public String toString() {
        return "Order {" +
                "\n    id = " + id +
                ", \n    orderType = " + orderType.type +
                ", \n    orderVeriety = " + orderVeriety.veriety +
                ", \n    currency full = " + currency.currencyFull +
                ", \n    currency short = " + currency.currencyShort +
                ", \n    tiker = '" + tiker + '\'' +
                ", \n    number = " + number +
                ", \n    count = " + count +
                ", \n    data = '" + data + '\'' +
                ", \n    duration = '" + duration + '\'' +
                "\n}";
    }
}

class OrderType {
    Integer id;
    String type;
}

class OrderVeriety {
    Integer id;
    String veriety;
}

class Currency {
    Integer id;
    String currencyFull;
    String currencyShort;

    @Override
    public String toString() {
        return "Currency {" +
                "\n    id = " + id +
                ", \n    currencyFull = '" + currencyFull + '\'' +
                ", \n    currencyShort = '" + currencyShort + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();

        OrderType orderType1 = new OrderType();
        orderType1.id = 1;
        orderType1.type = "Брокерская";

        OrderVeriety orderVeriety1 = new OrderVeriety();
        orderVeriety1.id = 1;
        orderVeriety1.veriety = "Рыночная";

        Currency currency1 = new Currency();
        currency1.id = 1;
        currency1.currencyFull = "US Dollar";
        currency1.currencyShort = "USD";

        order1.id = 1;
        order1.orderType = orderType1;
        order1.orderVeriety = orderVeriety1;
        order1.currency = currency1;
        order1.tiker = "AFKS";
        order1.number = 234679;
        order1.count = 1000;
        order1.data = "2018/11/26";
        order1.duration = "2019/11/26";

        AnyEntity orderPrintAll = (order) -> {
            System.out.println(order.toString());
        };

        AnyEntity orderPrintCurrency = (order) -> {
            System.out.println(order.currency.toString());
        };

        orderPrintAll.do_anything(order1);
        orderPrintCurrency.do_anything(order1);
    }
}