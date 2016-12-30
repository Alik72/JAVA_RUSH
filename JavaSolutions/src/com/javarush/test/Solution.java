package com.javarush.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Homosapiens on 19.10.2016.
 */
public class Solution
{
  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();


      String s1 = s.replace("мама", "Мама");
      String s2 = s.replace("мыла", "Мыла");
      String s3 = s.replace("раму", "Раму");

      System.out.println(s1+s2+s3);
    }
  }




