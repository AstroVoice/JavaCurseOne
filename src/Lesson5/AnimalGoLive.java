package Lesson5;

import java.util.Random;

public class AnimalGoLive {
    private static Random random = new Random();

    public static void main(String[] args) {

        /*Разные виды кошек*/
        Cat[] catArray = new Cat[3];
        catArray[0] = new Cat(); // простая кошка без фантазии
        catArray[1] = new Cat("Барсик", 12000, 0, 4);
        catArray[2] = new Cat("Мурзик", 35000, 0, 6);
        for (int i=0;i<catArray.length;i++){
            int curDistance = random.nextInt(20);
            System.out.println("Прыгнул на!: "+ curDistance);
            catArray[i].jump(curDistance);
            curDistance = random.nextInt(50000);
            System.out.println("Побежал на: "+ curDistance);
            catArray[i].run(curDistance);
            curDistance = random.nextInt(200);
            System.out.println("Уплыл на!: "+ curDistance);
            catArray[i].swim(curDistance);
        }

        /*Разные виды собак*/
        Dog[] dogArray = new Dog[3];
        dogArray[0] = new Dog(); // простая собака без фантазии
        dogArray[1] = new Dog("Шарик", 17000, 150, 2);
        dogArray[2] = new Dog("Бобик", 3000, 15, 0.5f);
        for (int i=0;i<catArray.length;i++){
            int curDistance = random.nextInt(20);
            System.out.println("Прыгнул на!: "+ curDistance);
            dogArray[i].jump(curDistance);
            curDistance = random.nextInt(50000);
            System.out.println("Побежал на!: "+ curDistance);
            dogArray[i].run(curDistance);
            curDistance = random.nextInt(200);
            System.out.println("Уплыл на!: "+ curDistance);
            dogArray[i].swim(curDistance);
        }
    }
}