package ss4_class_opject.exercises.StopWatch;

import java.util.Scanner;
import java.util.Random;

public class MainStopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();

        boolean check = true;
        while (check) {
            System.out.println("---StopWatch---" +
                    "\n1.Start" +
                    "\n2.Run" +
                    "\n3.Stop" +
                    "\n4.Check time" +
                    "\n0.end");
            System.out.println("---End---");
            System.out.println("Lua Chon Cua Ban:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("==Bat Dau Dem==");
                    stopWatch.start();
                    break;
                case 2:
                    System.out.println("==Khoi Tao Thoi Gian Hien Tai==");
                    stopWatch.start();
                    int[] array = new int[100000];
                    Random random = new Random();
                    for (int i = 0; i < array.length; i++) {
                        array[i] = random.nextInt(1000000);
                    }
                    selectionSort(array);
                    stopWatch.stop();
                    System.out.println("Da sap xep xong 100.000 so");
                    System.out.println("Thoi gian chay: " + stopWatch.getElapsedTime() + " milliseconds");
                    break;
                case 3:
                    System.out.println("==Dung Lai==");
                    stopWatch.stop();
                    break;
                case 4:
                    System.out.println("==Kiem Tra Thoi Gian Hien Tai==");
                    System.out.println("Thoi gian da troi qua: "+stopWatch.getElapsedTime()+" milliseconds");
                    break;
                case 0:
                    check = false;
            }
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}

