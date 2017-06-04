package ru.stqa.pft.sandbox;

import org.testng.util.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Irina on 6/2/17.
 */
public class Collections {

  public static void main(String[] args) {

    String[] langs = {"Java","C#","Python","PHP"};
//    langs[0] = "Java";
//    langs[1] = "C#";
//    langs[2] = "Python";
//    langs[3] = "PHP";

   // for(int i  = 0; i < langs.length; i++) {

//    List<String> languages = new ArrayList<>();
//    languages.add("Java");
//    languages.add("C#");
//    languages.add("Python");
//    languages.add("PHP");

List<String> languages = Arrays.asList("Java","C#","Python","PHP");


   // for(String l : languages) {


    //for(int i = 0; i < languages.size(); i++) {

    for(String l : languages) {
      System.out.println("I want to learn " + l);

    }
  }
}
