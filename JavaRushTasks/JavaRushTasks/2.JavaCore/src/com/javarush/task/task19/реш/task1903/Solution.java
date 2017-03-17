package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
Адаптируй IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости (смотри примеры).
Обратите внимание на формат вывода фамилии и имени человека.
        */

import java.util.HashMap;
import java.util.Map;

import static com.javarush.task.task19.task1903.Solution.countries;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }
    public static void main(String[] args) {

    }


    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data;
        public IncomeDataAdapter(IncomeData data){
            this.data = data;
        }
        public String getCompanyName() {return data.getCompany();}
        public String getCountryName() {
            String strana = null;
            for (Map.Entry<String,String>entry : countries.entrySet()){
             if (entry.getKey().equals(data.getCountryCode())){strana = entry.getValue();   }}
            return strana;
        }
        public String getName() {return data.getContactLastName() + ", " + data.getContactFirstName();}
        public String getPhoneNumber() {
            String phone = String.valueOf(data.getPhoneNumber());
            while (phone.length()<10){ phone = 0 + phone; }
            return String.format("+%d(%s)%s-%s-%s",data.getCountryPhoneCode(),phone.substring(0,3),
                    phone.substring(3,6),phone.substring(6,8),phone.substring(8,10));
            }}
    public static interface IncomeData {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        int getCountryPhoneCode();      //example 38
        int getPhoneNumber();           //example 501234567
    }
    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}