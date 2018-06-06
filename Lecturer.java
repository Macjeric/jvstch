class Lecturer{

String subject;
int age;

public static void main(String [] args){

Lecturer Kilima = new Lecturer();
Lecturer Wambura = new Lecturer();

Kilima.subject = "ICT 121";
Kilima.age = 30;

System.out.println("Kilima is teaching "+Kilima.subject);
System.out.println("Kilima's age is "+Kilima.age);

Wambura.subject = "ICT 123";
Wambura.age = 35;

System.out.println("Wambura is teaching "+Wambura.subject);
System.out.println("Wambura's age is "+Wambura.subject);

}
}