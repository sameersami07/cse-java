class C{
   public static void main(String args[]){
        Animal s = new Animal("am",10);
        s.display();
        Dog s1=new Dog("ams",20,"Woof!");
        s1.display();
        Puppy s2=new Puppy("amsd",30,"Yap!");
        s2.display();
   }      
}
class Animal{
    String name;
    int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
}
class Dog extends Animal{
    String sound;
     Dog(String name,int age,String sound){
        super(name,age);
        this.sound=sound;
    }
    void display(){
        super.display();
        System.out.println("sound:"+sound);
    }

}
class Puppy extends Animal{
    String lsound;
    Puppy(String name,int age,String lsound){
        super(name,age);
        this.lsound=lsound;
    }
    void display(){
        super.display();
        System.out.println("lsound:"+lsound);
    }

}
