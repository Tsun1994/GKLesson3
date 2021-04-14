package HomeworkOne.simple_01;

public class SimpleBox {
    private Object object;

    public void put (Object o){
        System.out.println("Открываем ящик");
        System.out.println("предмет " + o + " помещен в ящик");
        this.object = o;
        System.out.println("закрываем ящик\n ===================");
    }

    public Object get (){
        System.out.println("Открываем ящик");
        if (object != null){
            System.out.println("предмет " + object + " доступен");
            System.out.println("забираем его и закрываем ящик\n ===================");
        } else {
            System.out.println("ящик пуст");
        }
        return object;
    }
}
