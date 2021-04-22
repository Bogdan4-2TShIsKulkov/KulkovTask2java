package com.company
import java.io.PrintSteram;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int id;
        String surname;
        try(PrintStream printStream = new PrintStream(System.out)){
            printStream.print("Введите количество студентов");}
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        for(int i = 1; i < num; i++){
            System.out.println("Введите номер добавляемого студента: ");
            id = in.nextInt();
            String strId = Integer.toString(id);

                System.out.println("Введите фамилию данного студента (до 15 символов): ");
                surname = in.next();

                    Student student = new Student(surname, id);
                    System.out.println(student.toString());


            }

        }
    }
