package com.smm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class UniqueWords {


            public static void main(String[] args) throws IOException {


                Set<String> uniq = new HashSet<>();

                File file = new File("C:\\Ajaysmm\\trial.txt");

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String line;
                while ((line = br.readLine()) != null) {
                    line = line.toLowerCase().replaceAll("[^a-zA-Z ]", "");


                    StringTokenizer token = new StringTokenizer(line);


                    while (token.hasMoreTokens()) {
                        String word = token.nextToken();
                        uniq.add(word);
                    }
                }



                for(String s : uniq) {
                    System.out.println(s);
                }



            }



        }

