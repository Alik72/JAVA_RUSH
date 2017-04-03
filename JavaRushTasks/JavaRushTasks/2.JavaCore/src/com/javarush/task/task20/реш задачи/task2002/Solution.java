package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.javarush.task.task20.task2002.User.Country.RUSSIA;

/* 
Читаем и пишем в файл: JavaRush
Реализуйте логику записи в файл и чтения из файла для класса JavaRush.
В файле your_file_name.tmp может быть несколько объектов JavaRush.
Метод main реализован только для вас и не участвует в тестировании.
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            //File your_file_name = File.createTempFile("C:\\Users\\DDS_TS_2\\Desktop\\d.txt", null);
            OutputStream outputStream = new FileOutputStream("C:\\Users\\DDS_TS_2\\Desktop\\d.txt");
            InputStream inputStream = new FileInputStream("C:\\Users\\DDS_TS_2\\Desktop\\d.txt");

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setFirstName("Алик");
            user.setLastName("Сарсенов");
            user.setBirthDate(new Date());
            user.setMale(true);
            user.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //check here that javaRush object equals to loadedObject object - проверьте тут, что javaRush и loadedObject равны
            boolean equality = javaRush.equals(loadedObject);
            System.out.println(equality);
            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter printWriter = new PrintWriter(outputStream);
            String usersIsAvailable = users != null ? "yes" : "no";
            printWriter.println(usersIsAvailable);
            if (users != null){
                Integer count = users.size();
                printWriter.println(count);
                for (int i = 0; i < count; i++) {
                    printWriter.println(users.get(i).getFirstName());
                    printWriter.println(users.get(i).getLastName());
                    printWriter.println(users.get(i).getBirthDate().getTime());
                    printWriter.println(users.get(i).isMale() ? "true" : "false");
                    printWriter.println(users.get(i).getCountry().getDisplayedName());
                }
            }
            printWriter.flush();
        }
        public void load(InputStream inputStream) throws Exception {

            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String usersIsAvailable = reader.readLine();
            if (usersIsAvailable.equals("yes")){
                Integer count = Integer.parseInt(reader.readLine());
                for (int i = 0; i < count; i++) {
                    User user = new User();
                    String firstName = reader.readLine();
                    user.setFirstName(firstName);
                    String lastName = reader.readLine();
                    user.setLastName(lastName);
                    user.setBirthDate(new Date(Long.parseLong(reader.readLine())));
                    boolean isMale = Boolean.parseBoolean(reader.readLine());
                    user.setMale(isMale);
                    String country = reader.readLine();
                    User.Country country1;
                    if (country.equals("Ukraine")) {
                        country1 = User.Country.UKRAINE;
                    } else if (country.equals("Russia")) {
                        country1 = User.Country.RUSSIA;
                    } else {
                        country1 = User.Country.OTHER;
                    }
                    user.setCountry(country1);
                    users.add(user);
                }}
            }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }}

