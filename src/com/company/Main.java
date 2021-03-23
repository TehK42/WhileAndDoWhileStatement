package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // 3 types of While statements
        int count = 1;
        while (count != 6) {
            System.out.println("Count is equal to " + count);
            count++;
        }

        System.out.println();

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count is equal to " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count is equal to " + count);
            count++;

            if(count > 100) {
                break;
            }
        } while (count != 6);

        int number = 0;
        int finishedNumber = 20;
        int counter = 0;
        int sum = 0;
        while(number <= finishedNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number = " + number);
            counter++;
            if (counter >= finishedNumber) {
                break;
            } else {
                counter++;
                sum += number;
                if(counter == finishedNumber) {
                    break;
                }
            }
        }
//        System.out.println("Number of even numbers = " + counter);
        System.out.println(sum);

        int numba = 0;
        while(numba < 15) {
            numba++;

            if(numba <= 5) {
                System.out.println("Skipping numba " + numba);
                continue;
            }

            System.out.println("Numbas = " + numba);

            if(numba >= 10) {
                System.out.println("Breaking at " + numba);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {

        if((number % 2) == 0) {
            return true;
        }else {
            return false;
        }
    }
}
