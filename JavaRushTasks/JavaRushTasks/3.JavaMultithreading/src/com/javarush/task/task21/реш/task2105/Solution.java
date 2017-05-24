package com.javarush.task.task21.task2105;

import java.util.HashSet;
import java.util.Set;

/* 
Исправить ошибку. Сравнение объектов
Сравнение объектов Solution не работает должным образом. Найти ошибку и исправить.
Метод main не участвует в тестировании.


Требования:
1. Хешкоды одинаковых объектов должны быть равны.
2. Метод equals должен проверять равен ли переданный объект равен текущему(сравнение через ==).
3. Метод equals должен проверять является ли переданный объект объектом класса Solution.
4. Метод equals должен возвращать true в случае, если поля first и last равны у переданного объекта и текущего(не забудь что они могут быть равны null).
5. Должно быть обеспечено корректное поведение HashSet с типом элементов Solution.
6. В классе Solution должен быть реализован метод hashCode.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Solution))
            return false;
        Solution n = (Solution) o;
        return n.first == first && n.last == last;
    }
    public int hashCode(){
        int res = first != null ? first.hashCode() : 0;
        res = 31*res + (last != null ? last.hashCode() : 0);
        return res;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        s.add(new Solution("Mickey", "Mouse"));
        //System.out.println(s.contains(new Solution("Mickey", "Mouse")));
        Solution s1 = new Solution("Mickey", "Mouse");
        Solution s2 = new Solution("Mickey", "Mouse");
        System.out.println(s1.equals(s2));
        for (Solution n : s){
            System.out.println(n.toString());
        }
    }
}
