package teste;

public class Employee{
    private String name = "unknown";
    private int age = 0;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age= age;
    }
}