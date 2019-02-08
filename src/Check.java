public class Check {
    public static int money = 200000;
    public static int status = 0;
    public static int exp = 0;
    public static void TheFirstCheck(){
        Situations sit = new Situations();
        Character chare = new Character();
        if (sit.v == 1){
            money -= 100000;
            exp += 5;
            status += 4;
            System.out.println("Кол-во денег: "+money+"\n"+"Кол-во опыта: "+exp+"\n"+"Кол-во статуса: "+status);
            money = money;
            status = status;
            exp = exp;
        }
        else {
            money += 100000;
            exp += 2;
            status += 2;
            System.out.println("Кол-во денег: "+money+"\n"+"Кол-во опыта: "+exp+"\n"+"Кол-во статуса: "+status);
            money = money;
            status = status;
            exp = exp;
        }
    }
    public  static void TheSecondCheck(){
        Situations sit = new Situations();
        Character chare = new Character();
        if (sit.v == 4){
            money += 200000;
            exp += 3;
            status += 3;
            System.out.println("Кол-во денег: "+money+"\n"+"Кол-во опыта: "+exp+"\n"+"Кол-во статуса: "+status);
            System.out.println("Молодец! Ты выбрал лучший по всем параметрам путь!");
        }
        if (sit.v == 3){
            money += 100000;
            exp -= 2;
            status += 1;
            System.out.println("Кол-во денег: "+money+"\n"+"Кол-во опыта: "+exp+"\n"+"Кол-во статуса: "+status);
        }
        if (sit.v == 5){
            money += 100000;
            exp += 4;
            status += 1;
            System.out.println("Кол-во денег: "+money+"\n"+"Кол-во опыта: "+exp+"\n"+"Кол-во статуса: "+status);
        }
        if (sit.v == 6){
            money += 100000;
            exp += 1;
            status += 1;
            System.out.println("Кол-во денег: "+money+"\n"+"Кол-во опыта: "+exp+"\n"+"Кол-во статуса: "+status);
        }
    }
}
