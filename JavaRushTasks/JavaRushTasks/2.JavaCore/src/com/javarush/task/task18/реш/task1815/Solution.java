package com.javarush.task.task18.task1815;

import java.util.List;
import java.util.Objects;

/* 
Таблица
Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для ATableInterface.
Метод setModel должен вывести в консоль количество элементов в новом листе перед обновлением модели.
Метод getHeaderText должен возвращать текст в верхнем регистре — используйте метод toUpperCase().
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {

        private ATableInterface original;

        public TableInterfaceWrapper(ATableInterface tableInterface){
            this.original = tableInterface;
        }

        public void setModel(List rows){
            System.out.println(rows.size());
            original.setModel(rows);
            }


        public String getHeaderText(){

        return original.getHeaderText().toUpperCase();
        }

        public void setHeaderText(String newHeaderText){
            original.setHeaderText(newHeaderText);
        }

    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}