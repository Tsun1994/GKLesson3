package HomeworkOne.simple_01;

public class Main01 {
    public static void main(String[] args) {
        SimpleBox box = new SimpleBox();
        Melon melon = new Melon();
        box.put(melon);

        Melon newMelon = (Melon) box.get();
        System.out.println("Достали " + newMelon + "\n");
    }
}
