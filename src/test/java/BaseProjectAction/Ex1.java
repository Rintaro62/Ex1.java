package BaseProjectAction;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex1 {

    private static int z;


    public static void main(String[] args) {
        Ex2 company = new Ex2("Yellow", 18,"audi",84);
        //company.displayColor();                     ошибка, т.к. метод private
        company.displayNumber();
        company.displayCar();
        company.displayAge();


        System.out.println(company.color);
        System.out.println(company.number);
        System.out.println(company.car);
        //System.out.println(company.age);
        
        getz();
        z=5;

        if (z>10) {
            System.out.println("Переменная а больше 10");
        } else if (z<10) {
            System.out.println("Переменная а меньше 10");
        } else {
            System.out.println("Переменная а равна 10");
        }

        int n = 3;
        while (n>0) {
            System.out.println("Осталось " + n--);
        }

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Lada");
        cars.add("Dodge");
        cars.add("BMW");
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        for (String b: cars){
            System.out.println(b);
        }
        HashMap<String,Integer> lab = new HashMap();
        lab.put("Maths",1);
        lab.put("Cult",2);
        lab.put("Germ",15);
        for (String v: lab.keySet()) {
            System.out.println(lab.get(v));
        }


    }

    public static int getz() {
        
        return z;
    }

}