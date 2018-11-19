package com.pgy.ups.biz.business;



import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine =  scanner.nextLine();
        String[] arg =  nextLine.split(" ");
        Integer[] arg1 = new Integer[arg.length];
        for(int i = 0 ; i<arg.length ; i++){
          arg1[i] = Integer.valueOf(arg[i]);
        }
       Arrays.sort(arg1);
        for(int i = 0;i<arg1.length;i++){
            if(arg1[0] == 0 && arg1[i] > 0){
                arg1[0] = arg1[i];
                arg1[i] = 0;
                break;
           }
        }
        for(int in : arg1){
           System.out.print(in);
          }
      }
}
