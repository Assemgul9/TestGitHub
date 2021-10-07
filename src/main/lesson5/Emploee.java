package lesson5;

public class Emploee{
    public String name;
    public String position;
    public String email;
    public int phone;
    public int salary;
    public int age;



    public  Emploee(String name,String position, String email,int phone, int salary, int age){
        this.name=name;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;




    } public void info(){
        System.out.println(name+" "+position+" "+email+" "+phone+" "+" "+salary+" "+age);
    }



}
