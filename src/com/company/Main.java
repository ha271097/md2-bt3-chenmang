package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so chen");
        int x = sc.nextInt();
        int array[] = {1, 3, 5, 7, 9};
        int index;
        do {
            System.out.println("Nhap vi tri can chen");
            index = sc.nextInt();
            if (index > array.length - 1 || index <= 0) {
                System.out.println("vi tri k co trong mang");
            }
        }while(index > array.length - 1 ||  index <= 0);
        int newArray[] = new int[array.length+1];
        for (int i = 0; i < index ; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = x;
        for (int j = index +1; j < array.length+1 ; j++) {
            newArray[j] = array[j-1];
        }
        for(int a : newArray){
            System.out.println(a);
        }
    }
}
