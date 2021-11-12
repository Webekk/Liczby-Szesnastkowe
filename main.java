package com.loops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int dec_num;
	int rem;
	String hexdec_num = "";
	//Liczby w systemie szesnastkowym

        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbe z systemu dziesiatkowego");
        dec_num=in.nextInt();

        while(dec_num>0){
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;

        }
        System.out.println("Liczba szesnastkowa to : " + hexdec_num+"\n");
        }
    }

