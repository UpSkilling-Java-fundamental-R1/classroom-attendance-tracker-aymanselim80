package main.java.org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        classAttendanceTrackerInit();

    }

    private static void classAttendanceTrackerInit() {

        ArrayList<String> signIns = new ArrayList<>();
        System.out.println("Enter Students names: ");
        String name = input.nextLine();
        int counter =0;
        while(!name.equalsIgnoreCase("done")) {

            if(!containsCaseInsensitive(name, signIns)) {
                signIns.add(name);
            }
            name = input.nextLine();
            counter++;
        }

        stringsBubbleSort(signIns);

        System.out.println("Total number of sign-ins :: " + counter);
        System.out.println("Unique Students :: " + signIns.size());
        System.out.println("Attendance List :: " + signIns);

    }

    private static void stringsBubbleSort(ArrayList<String> signIns) {
        boolean ordered = false;
        String temp = "";
        while(!ordered){
            ordered = true;
            for(int i = 0; i<signIns.size()-1; i++){

                if((signIns.get(i).compareTo(signIns.get(i+1))) > 1) {
                    temp = signIns.get(i);
                    signIns.set(i, signIns.get(i+1));
                    signIns.set(i+1, temp);
                    ordered = false;
                }

            }

        }

    }

    private static boolean containsCaseInsensitive(String str, ArrayList<String> arr) {

        for(String s: arr) {
            if(s.equalsIgnoreCase(str)) {
                return true;
            }
        }

        return false;
    }
}
