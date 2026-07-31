public class ConstructorOverloading {

    public ConstructorOverloading(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ConstructorOverloading(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public ConstructorOverloading() {

    }

    public ConstructorOverloading(float age, String name){
        this.age = (int) age;
    }

    public int age;
    public String name;

    void display(){
        System.out.println("name: "+name+ " age: "+age);
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading(22, "sujit");
        ConstructorOverloading c2 = new ConstructorOverloading("sourav", 22);
        ConstructorOverloading c3 = new ConstructorOverloading(22,"subham");


        c1.display();
        c2.display();
        c3.display();
    }

}
