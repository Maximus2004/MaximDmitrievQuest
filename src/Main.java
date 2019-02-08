public class Main {
    public static void main(String[] args) {
        Situations situ = new Situations();
        Character chare = new Character();
        System.out.println("Кол-во денег: "+chare.money+"\n"+"Кол-во опыта: "+chare.exp+"\n"+"Кол-во статуса: "+chare.status);
        situ.TheFirst();
        Check chek = new Check();
        chek.TheFirstCheck();
        situ.TheSecond();
        chek.TheSecondCheck();
    }
}
