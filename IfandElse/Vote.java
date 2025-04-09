package IfandElse;

public class Vote {
    private String name;
    private int age; 

    public Vote(String name, int age){
        this.name = name;
        this.age = age;
    }

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
        this.age = age;
    }

    public int showAge(){
        if (age <= 16){
            System.out.println("Sr(a) " + name + ", you do not have the property age to vote.");
        } else if(age < 18 || age >= 75){
            System.out.println("Sr(a) " + name + ", you are not obligated to vote, but if you want you can vote.");
        } else{
            System.out.println("Sr(a) " + name + ", you are obligated to vote.");
        }
        return age;
}

}
