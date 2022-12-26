public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Task 1");
        int age = 16; //years old
        if (age >= 18) {
            System.out.println("If a person is " + age + ", he/she is an adult\n");
        } else {
            System.out.println("If a person is " + age + ", he/she needs to wait a bit to reach an adulthood\n");
        }
    }
    public static void task2 () {
        System.out.println("Task 2");
        int temp = 7; // degrees Celsius
        if ( temp < 5) {
            System.out.println("It's " + temp + " degrees Celsius outside, wear a hat\n");
        } else {
            System.out.println("It's " + temp + " degrees Celsius outside, a hat is not necessary\n");
        }
    }
    public static void task3 () {
        System.out.println("Task 3");
        int speed = 60; //kmph
        if (speed > 60) {
            System.out.println("If your speed is " + speed + " k/h, you'll have to pay fine\n");
        } else {
            System.out.println("If your speed is " + speed + " k/h, you won't be fined\n");
        }
    }
    public static void task4 () {
        System.out.println("Task 4");
        int age = 75; //age years old
        boolean kindergarten = 6 > age && age > 2;
        boolean school = 18 > age && age >= 6;
        boolean uni = 24 > age && age >= 18;
        boolean work = 65 > age && age >= 24;
        if (kindergarten) {
            System.out.println("If a person is " + age + " years old, he/she should go to a kindergarten\n");
        } else if (school) {
            System.out.println("If a person is " + age + " years old, he/she should attend school\n");
        } else if (uni) {
            System.out.println("If a person is " + age + " years old, he/she should attend university\n");
        } else if (work) {
            System.out.println("If a person is " + age + " years old, he/she should work\n");
        } else {
            System.out.println("If a person is " + age + " years old, he/she should either prepare for a kindergarten or retire\n");
        }
    }
    public static void task5 () {
        System.out.println("Task 5");
        int age = 76; //years old
        boolean noFun = age < 5;
        boolean withAdult = 14 > age && age > 5;
        boolean funTime = age > 14;
        if (noFun) {
            System.out.println("If a kid is " + age + ", he/she is too young to enjoy the attractions\n");
        } else if (withAdult) {
            System.out.println("If a kid is " + age + ", he/she can enjoy the attractions with an adult\n");
        } else if (funTime) {
            System.out.println("If a kid is " + age + ", he/she is welcome to enjoy the attractions alone, without an adult\n");
        }
    }
    public static void task6 () {
        System.out.println("Task 6");
        int capacity = 102; //people
        int seats = 60; //seating spots
        int people = 61;
        boolean full = people > capacity;
        boolean standing = people > seats && people < capacity;
        boolean seating = people < seats;
        int standSpots = capacity - people;
        int standSpotsMax = capacity - seats;
        int seatSpots = capacity - standSpotsMax - people;
        if (full) {
            System.out.println("The carriage is overcrowded, no seats available\n");
        }
        if (standing) {
            System.out.println("There are " + standSpots + " standing spots available in the carriage\n");
        }
        if (seating) {
            System.out.println("There are " + seatSpots + " seating spots and " + standSpotsMax +" standing spots available in the carriage\n");
        }
    }
    public static void task7 () {
        System.out.println("Task 7");
        int a = 0;
        int b = 3;
        int c = 4;
        boolean A = a > b && a > c;
        boolean B = b > a && b > c;
        boolean C = c > b && c > a;
        if (A) {
            System.out.println("Out of the numbers " + a +", " + b +" and " + c + ", the number " + a + " is the largest\n");
        } else if (B) {
            System.out.println("Out of the numbers " + a +", " + b +" and " + c + ", the number " + b + " is the largest\n");
        } else if (C) {
            System.out.println("Out of the numbers " + a +", " + b +" and " + c + ", the number " + c + " is the largest\n");
        } else {
            System.out.println("Either all numbers are equal or two of the inputs are largest and equal to each other\n");
        }
    }

}