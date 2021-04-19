//package HomeworkOne.homework;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class ArrayMas {
//    //метод, где мы меняем два элемента массива ссылочного типа местами
//    // 1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
//    public static void main(String[] args) {
//        Car car [] = new Car[5];
//        car [0] = new Car(4, "white", 200);
//        car [1] = new Car(4, "black", 100);
//        car [2] = new Car(2, "orange", 250);
//        car [3] = new Car(4, "red", 400);
//        car [4] = new Car(6, "white", 10);
//
//        for (int i = 0; i < car.length; i++) {
//            System.out.println(car[i].wheel + " " + car[i].color + " " + car[i].speed);
//        }
//
//        Car n = car[2];
//        car[2] = car[4];
//        car[4] = n;
//        System.out.println("а теперь мы поменяли местами");
//        for (int i = 0; i < car.length; i++) {
//            System.out.println(car[i].wheel + " " + car[i].color + " " + car[i].speed);
//        }
//
//
//        //преоброзование массива в лист ArrayList
//        //2. Написать метод, который преобразует массив в ArrayList;
//        List<Car> list1 = new ArrayList<>();
//
//        list1 = Arrays.asList(car);
//        for (Car c: list1) {
//            System.out.println(c.wheel + " " + c.color + " " + c.speed);
//        }
//    }
//}
