package service;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author localuser
 * @version
 * MainService class for JAVA basics
 * 
 */

public class MainService {

	private static String name;
	private static int age;
	private static float height;
	private static boolean hasExperienceInJAVA;
	private static char sex;
	

	public static void main(String[] args) {
		//vienas rindas komentārs
		
		/*
		 vairāku rindu kometārs
		 */
		// ------------------------- Mainīgo piemēri-----------------------//
		System.out.println("Sveiciens JAVA pasaulē!");
		name = "Karina";
		// name = new String("Karina");
		age = 18;
		height = 1.76f;
		hasExperienceInJAVA = true;
		sex = 'F'; //var arī sex = 70;, jo pēc ASCII paņems
		
		var surname = "Šķirmante";//nav ieteicams izmantot var apmācibu procesā
		
		System.out.println(name + " " + surname + " (" + age + ") " 
				+ height + " m, ir pieredze JAVA: " + hasExperienceInJAVA
				+ ", dzimums: " + sex);
		

		// ------------------------- Masīvu piemēri-----------------------//
		
		int [] grades = {3, 5, 8, 1, 7, 9, 10}; //ja veidošanas brīdī ir zināmas šūnu vērtības
		System.out.println(grades[3]);//grades[100] <-izmetīs kļūdu
		System.out.println(grades);//izprintēs tikai adresi
		
		//izprintēs visus elementus
		for(int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		System.out.println();
		System.out.println("hei");
		
		//izmantojot arrays  klasi
		System.out.println(Arrays.toString(grades));
		
		//foreach cikls
		for(int temp : grades) {
			System.out.print(temp + " ");
		}
		System.out.println();
		
		// ---------------------------------------------------STRING PIEMERI------------------------------------------
		
		String courseTitle = "Programmesana timekli JAVA";
		String facultyTitle = "ITF";
		String studyProgram = "Datorzinatnes";
		String email = "karina.krinkele@venta.lv";
		String accountNo = "LV03HABA0551002144730";
		String accountNo2 = "LVHABA003490583904345";

		System.out.println("Kursa nosaukuma garums: " + courseTitle.length());
		System.out.println(facultyTitle.charAt(0) + " " + facultyTitle.charAt(1) + " " + facultyTitle.charAt(2));
		System.out.println("Sākās ar D: " + studyProgram.startsWith("D"));
		
		System.out.println("Programma atbilst formatējumam: " + studyProgram.matches("[A-Z]{1}[a-z ]{4,30}"));
		
		System.out.println("Konta numurs atbilst formatējumam: " + accountNo.matches("[LV]{2}[0-9]{2}[A-Z]{4}[0-9]{13}"));
		System.out.println("Konta numurs atbilst formatējumam: " + accountNo2.matches("[LV]{2}[0-9]{2}[A-Z]{4}[0-9]{13}"));
		System.out.println("Epasts atbilst formatējumam: " + email.matches("[a-zA-Z0-9.]*[@][a-zA-Z]*[.][a-z]*"));
		
		
		
		// ---------------------------------------------- Datu tipu mainas piemeri -------------------------------------------
		System.out.println("-----------------------------------------------");
		double EX = 3000.14765782658;
		System.out.println(EX);
		
		float EXf = (float) EX;
		System.out.println(EXf);
		long EXl = (long) EXf;
		System.out.println(EXl);
		byte EXb = (byte) EXl;
		System.out.println(EXb);
		
		
		String price = "2.34";
		
		float pricef = Float.parseFloat(price);
		System.out.println("Cena ir " + pricef + " eur");
		int agei = Integer.parseInt("18");
		System.out.println("Vecums ir: " + agei);
		

		
		
	}

}