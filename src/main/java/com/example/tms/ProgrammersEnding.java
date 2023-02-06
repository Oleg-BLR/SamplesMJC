/* В переменную записываете количество программистов. В зависимости
от количества программистов необходимо вывести правильно окончание:
0 программистов
1 программист
2,3,4 программиста
5..10 программистов
11..14 программистов
*/

package com.example.tms;

import java.util.Scanner;

public class ProgrammersEnding {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество программистов: ");
        String numberOfProgrammers = in.next();
        System.out.println(numberOfProgrammers + " программис" + getEnding(numberOfProgrammers));
    }

    public static String getEnding(String numberOfProgrammers) {
        String ending = "т";
        if (numberOfProgrammers.length() > 1) {
            numberOfProgrammers = numberOfProgrammers.substring(numberOfProgrammers.length() - 2);
        }
        if (Integer.parseInt(numberOfProgrammers) >= 11 && Integer.parseInt(numberOfProgrammers) <= 14) {
            ending = "тов";
        } else {
            if (Integer.parseInt(numberOfProgrammers) > 1) ending = "та";
            if (Integer.parseInt(numberOfProgrammers) > 4) ending = "тов";
            if (Integer.parseInt(numberOfProgrammers) == 0) ending = "тов";
        }
        return ending;
    }


}
