package teste;
public class Main{
    public static void main (String[] args){
        Employee me = new Employee();
        me.setAge(22);
        me.setName("ítalo");

        Employee you = new Employee();
        you.setAge(60);
        you.setName("Adilson");

        System.out.println(me.getName());
        System.out.println(me.getAge());
        System.out.println(you.getName());
        System.out.println(you.getAge());
    }
}