package sample;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ادخل طول وعرض المستطيل");
        int width;
        int height;
        width=input.nextInt();
        height=input.nextInt();
        System.out.println( "محيط المستطيل="+2*(height+width));

    }
}
