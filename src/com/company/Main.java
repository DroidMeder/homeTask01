package com.company;

import java.util.*;

import static com.company.TypeOfConnection.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        CellPhone cellPhone = new CellPhone("+996", true,
                Arrays.asList("MegaCom", "Beeline", "O", "Неизвестный оператор"), true,
                new Description(Arrays.asList("Кнопка", "Touch Screen"), true, "Smartfons"),
                new TypeOfConnection[]{INTERNET, SATELITE, BLUE_TOOTH});

        CellPhone apple = new SmartPhone("+996", false,
                Arrays.asList("MegaCom", "Beeline", "O", "Неизвестный оператор"), true,
                new Description(Arrays.asList("Колесо", "Кнопка", "Touch Screen", "Голосовой ассистент", "Заказ звонка"),
                        true, ""),
                new TypeOfConnection[]{INTERNET, WIFI, BLUE_TOOTH, SATELITE, RADIO, OTHERS},
                Map.of("Viber", "АудиоЗвонок"));
        CellPhone Samsung = new SmartPhone("+996", false,
                Arrays.asList("MegaCom", "Beeline", "O", "Неизвестный оператор"), true,
                new Description(Arrays.asList("Колесо", "Кнопка", "Touch Screen", "Голосовой ассистент", "Заказ звонка"),
                        true, ""),
                new TypeOfConnection[]{INTERNET, WIFI, BLUE_TOOTH, SATELITE, RADIO, OTHERS},
                Map.of("WhatsApp", "Видео вызов"));

        System.out.println(main.printInfo(cellPhone));
        System.out.println();
        System.out.println(cellPhone.makeCall());
        System.out.println(cellPhone.makeCall("Нурик"));
        System.out.println(cellPhone.makeCall("Братишка", new Date()));
        System.out.println("--------------------------");
        System.out.println();

        System.out.println(main.printInfo(apple));
        System.out.println();
        System.out.println(apple.makeCall());
        System.out.println(apple.makeCall("Карина"));
        System.out.println(apple.makeCall("Мама", new Date()));
        System.out.println("--------------------------");
        System.out.println();

        System.out.println(main.printInfo(Samsung));
        System.out.println();
        System.out.println(Samsung.makeCall());
        System.out.println(Samsung.makeCall("Неизвестный обонент"));
        System.out.println(Samsung.makeCall("Тор", new Date()));
    }

    public String printInfo(Phone p){
        if (p instanceof SmartPhone p1){
            return p1.getOurCountryCode()+"\n"+p1.isCityCodeInsideDifferent()+"\n"+p1.getOperators()+
                    "\n"+ p1.isHasCodsOfOperators()+"\n"+p1.getDescription().getDialingMethods()+
                    "\n"+p1.getDescription().isInternationalCallCheap()+
                    "\n"+p1.getDescription().getBaseFor()+
                    "\n"+ Arrays.toString(p1.getTypeOfConnection())+"\n"+p1.getMessagers();
        }
        return p.getOurCountryCode() +"\n"+p.isCityCodeInsideDifferent()+"\n"+p.getOperators()+
                "\n"+ p.isHasCodsOfOperators()+"\n"+p.getDescription().getDialingMethods()+
                "\n"+p.getDescription().isInternationalCallCheap()+
                "\n"+p.getDescription().getBaseFor()+
                "\n"+ Arrays.toString(p.getTypeOfConnection());

    }
}
