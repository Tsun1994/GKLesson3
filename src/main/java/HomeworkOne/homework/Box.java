package HomeworkOne.homework;

import java.util.ArrayList;

public class Box <T> {
    //b. Класс Box в который можно складывать фрукты, коробки условно
    // сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    private T object;
    int boxWeight = 0;

    public void put (Apple o, int weight){
        boxWeight += weight;
        System.out.println("В коробоку положили " + o + " и теперь она весит " + weight);
    }

    //d. Сделать метод getWeight() который высчитывает вес коробки,
    // зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
    public void getWeight (int weight, String o){
        System.out.println("Вес коробки " + o +  " равен = " + weight);
    }

    public boolean compare (int weightApple, int weightOrange){
        if (weightApple == weightOrange) {
            return true;
        }
        return false;
    }

//    public ArrayList pour (ArrayList<?> al1, ArrayList <?> al2){
//        if (al1.addAll(al2)){
//            al2.clear();
//        }
//        System.out.println("Пересыпали фрукты из одной коробки в другую");
//        return al1;
//    }
}
