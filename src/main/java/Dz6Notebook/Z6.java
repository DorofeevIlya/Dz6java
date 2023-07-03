package Dz6Notebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        NotebookTypes nb1 = new NotebookTypes();
        nb1.setHousing_type("Ультрабук");
        nb1.setColor("Черный");
        nb1.setMemory("1024");
        nb1.setProcessor("AMD");
        nb1.setHousing_material("Пластик");
        nb1.setScreen_diagonal("15.6");

        NotebookTypes nb2 = new NotebookTypes();
        nb2.setHousing_type("Ультрабук");
        nb2.setColor("Белый");
        nb2.setMemory("2048");
        nb2.setProcessor("Intel");
        nb2.setHousing_material("Аллюминий");
        nb2.setScreen_diagonal("17");

        NotebookTypes nb3 = new NotebookTypes();
        nb3.setHousing_type("Нанобук");
        nb3.setColor("Черный");
        nb3.setMemory("256");
        nb3.setProcessor("AMD");
        nb3.setHousing_material("Пластик");
        nb3.setScreen_diagonal("12.2");

        NotebookTypes nb4 = new NotebookTypes();
        nb4.setHousing_type("Игровой");
        nb4.setColor("Серебрянный");
        nb4.setMemory("512");
        nb4.setProcessor("AMD");
        nb4.setHousing_material("Пластик");
        nb4.setScreen_diagonal("12.2");

        NotebookTypes nb5 = new NotebookTypes();
        nb5.setHousing_type("Ультрабук");
        nb5.setColor("Черный");
        nb5.setMemory("2048");
        nb5.setProcessor("Apple");
        nb5.setHousing_material("Аллюминий");
        nb5.setScreen_diagonal("17");

        List<NotebookTypes> list = new ArrayList<>();

       Collections.addAll(list, nb1, nb2, nb3,nb4,nb5);
    Scanner scanner = new Scanner(System.in);
        System.out.println("Какой вам нужен процессор? ( AMD| Intel | Apple ) (если этот параметр не имеет значения, введите -1): ");
        String scannerProc = scanner.next();
        System.out.println("Какой вам необходим размер памяти в гигабайтах? ( 128 | 256 | 512 | 1024 | 2048 ) (если этот параметр не имеет значения, введите -1): ");
        String scannerMemory = scanner.next();
        System.out.println("Какая вам необходима диагональ? ( 12.2 | 15.6 | 17 ) (если этот параметр не имеет значения, введите -1): ");
        String scannerScreen = scanner.next();
        System.out.println("Введите, желаемый цвет корпуса (Черный | Белый | Серебристый ) (если этот параметр не имеет значения, введите -1): ");
        String scannerColor = scanner.next();
        System.out.println("Введите, желаемый материал корпуса ( Аллюминий | Пластик ) (если этот параметр не имеет значения, введите -1): ");
        String scannerHM = scanner.next();
        System.out.println("Введите, желаемый формфактор корпуса ( Ультрабук | Нанобук| Игровой ) (если этот параметр не имеет значения, введите -1): ");
        String scannerHT = scanner.next();


        boolean foundMatch = false;
        for (NotebookTypes elem : list) {
                if ((scannerHM.equals("-1") || elem.getHousing_material().equals(scannerHM)) &&
                        (scannerMemory.equals("-1")  || elem.getMemory().equals(scannerMemory))&&
                        (scannerProc.equals("-1")  || elem.getProcessor().equals(scannerProc))&&
                        (scannerColor.equals("-1")  || elem.getColor().equals(scannerColor))&&
                        (scannerHT.equals("-1")  || elem.getHousing_type().equals(scannerHT))&&
                        (scannerScreen.equals("-1")  || elem.getScreen_diagonal().equals(scannerScreen))){
                System.out.println( " => Материал корпуса :"+ elem.getHousing_material() + ", Память: " + elem.getMemory() + ", Диагональ экрана: " + elem.getScreen_diagonal() + ", Цвет: " + elem.getColor() + ", Процессор: " + elem.getProcessor() + ", Формфактор: " + elem.getHousing_type());
                foundMatch = true;
            }
        }
        if (!foundMatch) {
            System.out.println("По вашему запросу ничего не найдено.");
        }
    }
}
