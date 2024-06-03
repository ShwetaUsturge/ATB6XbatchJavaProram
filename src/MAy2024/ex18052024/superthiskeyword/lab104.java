package MAy2024.ex18052024.superthiskeyword;

public class lab104 {
    public static void main(String[] args) {
        DOG d1= new DOG();
        DOG d2= new DOG("Lab");
        d2.display();
        DOG d3 = new DOG("Golden retriver", "Dog TTtt");
        d3.display();
    }
}
class Animal{
    String type;
     Animal() {

        System.out.println("Animal DC");
    }
    Animal(String type){
         this.type=type;
        System.out.println("Animal PC");
    }
}
class DOG extends Animal{
    String breed;
    DOG(){
        super();
        System.out.println("Dog DC");
    }

     DOG( String breed) {
        super("dog type.");
        this.breed = breed;
    }
     DOG( String breed , String type) {
        this("Breed set by dog only");
        //super("dog type.");
        this.breed = breed;
        System.out.println("Parameterised constructor with two arguments");
    }
 void display(){
     //System.out.println("Type:"+ super.type + " Breed :"+ this.breed);
    // System.out.println("Type", + type "Breed", + breed);
 }
}

