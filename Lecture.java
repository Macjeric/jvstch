class Lecture{

String subject;
int age;

Lecture(String asubject,int lage){

subject = asubject;
age = lage;
}

public static void main(String [] args){

Lecture kilima = new Lecture("ICT 121", 30);
Lecture Wambura = new Lecture("ICT 123", 35);

System.out.println("Kilima is teaching "+kilima.subject);
System.out.println("Kilima's age is "+kilima.age);

System.out.println("Wambura is teaching "+Wambura.subject);
System.out.println("Wambura's age is "+Wambura.age);

}
}