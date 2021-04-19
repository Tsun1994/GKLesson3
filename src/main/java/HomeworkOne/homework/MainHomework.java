package HomeworkOne.homework;

import java.util.ArrayList;

public class MainHomework {
    public static void main(String[] args) {
        Box <Orange> box1 = new Box();
        Box <Apple> box2 = new Box();
        Box <Orange> box3 = new Box<>();

        Orange orange = new Orange(10);
        Apple apple = new Apple(15);

        //c. Для хранения фруктов внутри коробки можете использовать ArrayList;
        ArrayList<Apple> appleArrayList = new ArrayList<>();
        ArrayList<Orange> orangeArrayList = new ArrayList<>();
        ArrayList<Apple> apples = new ArrayList<>();

        appleArrayList.add(apple);
        appleArrayList.add(apple);
        appleArrayList.add(apple);
        appleArrayList.add(apple);
        //d. Сделать метод getWeight() который высчитывает вес коробки,
        // зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
        box1.getWeight((appleArrayList.size() * apple.weight), apple.toString());

        orangeArrayList.add(orange);
        orangeArrayList.add(orange);
        orangeArrayList.add(orange);
        orangeArrayList.add(orange);
        box2.getWeight((orangeArrayList.size() * orange.weight), orange.toString());

        apples.add(apple);
        box3.getWeight(apples.size() * apple.weight, apple.toString());

        // e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той,
        // которую подадут в compare в качестве параметра, true - если их веса равны,
        // false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        if (box1.compare(appleArrayList.size() * apple.weight, orangeArrayList.size() * orange.weight)){
            System.out.println("Коробки равны между собой");
        } else {
            System.out.println("Коробки не равны между собой");
        }

        //f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в
        // другую коробку (помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
        // соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
        // почему-то не удалось
//        box3.pour(apples, appleArrayList);
//        System.out.println(apples.size());
    }
}

