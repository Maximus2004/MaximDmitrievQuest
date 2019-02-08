import java.util.Scanner;

public class Situations {
    public static int v;
    public static int TheFirst(){
        System.out.println("Тебе предстоит выбрать дорогу жизни по которой ты пойдёшь!");
        System.out.println("Введи (1), если ты выбираешь дорогу бизнесмена");
        System.out.println("Введи (2), если ты хочешь работать на дядю и получать немалую зарплату");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер: ");
        v = in.nextInt();
        return v;
    }
    public static int TheSecond(){
        if (v==1){
            System.out.println("Я вижу, что твои дела не очень хороши, дорогой бизнесмен. Если хочешь поменять свой жизненный путь и устроиться на работу, то введи 3"+"\n"+"А если ты хочешь оставаться предпринимателем, то нажми 4");
        }
        if (v==2){
            System.out.println("У тебя прекрасно получается и ты стал востребаванным сотрудником!"+"\n"+"У тебя есть возможность занятся саморазвитием. Если ты хочешь начать, то нажми 5"+"\n"+"А если хочешь оставить всё, как есть, то нажми 6");
        }
        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер: ");
        v = in.nextInt();
        return v;
    }

}
