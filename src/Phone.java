import java.util.Arrays;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String d, String e, double f) {
        this(d, e);
        weight = f;
    }
    Phone(String b, String e) {
        number = b;
        model = e;

    }
    Phone(){

    }
    public void reciveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void reciveCall(String name,String number) {
        System.out.println("Звонит " + name + " с номером " + number);
        System.out.println("Мой телефон " + this.number);
    }

    String getNumber(){
        return number;
    }

    public void sendMassege(String massege, String... numbers) {
        System.out.println("Сообщение " +massege + " было отправленно:");
        System.out.println(Arrays.toString(numbers));

    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("89111111111", "Apple", 3.2);
        Phone phone2 = new Phone("89112111112", "Samsung");
        Phone phone3 = new Phone();


        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);
        System.out.println();

        phone1.reciveCall("Кирилл");
        phone2.reciveCall("Полина");
        phone2.reciveCall("Илья", "+79042345131342");
        phone3.reciveCall("димасик");

        phone1.sendMassege("Привет", "+79012345483");
        phone2.sendMassege("?", "+79031234235");
    }
}
