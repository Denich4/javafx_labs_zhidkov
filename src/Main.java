interface AnyEntity {
}
class Order implements AnyEntity {
}

class OrderType implements AnyEntity {
}

class OrderVeriety implements AnyEntity {
}

class Currency implements AnyEntity {
}

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order() {
            Integer id = 1;
            public OrderType orderType = new OrderType() {
                Integer id = 1;
                String type = "Брокерская";

                public String getType() {
                    return type;
                }
            };
            OrderVeriety orderVeriety = new OrderVeriety() {
                Integer id = 1;
                String veriety = "Рыночная";
            };
            Currency currency = new Currency() {
                Integer id = 1;
                String currencyShort = "USD";
                String currencyFull = "US Dollar";
            };
            String tiker = "AFKS";
            Integer count = 1000;
            Integer number = 234679;
            String data = "2018/11/26";
            String duration = "2019/11/26";
        };
    }
}