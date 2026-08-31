package com.example.OOPS;

public class ExplainAbstractClass2 extends ExplainAbstractClass{

    int x;
    int z;

    @Override
    public void say() {
        System.out.println("HII");
    }

    public int add(){
        return x + z  ;
    }

    public ExplainAbstractClass2(int x,int z){
        this.x=x;
        this.z=z;
    }


    public static void main(String[] args) {
        ExplainAbstractClass2 obj = new ExplainAbstractClass2(2,3);
        ExplainAbstractClass2 obj1 = new ExplainAbstractClass2(4,5);
        System.out.println(obj.add());
        obj.said();
        obj.said();

        System.out.println(obj1.add());
        obj1.said();
        obj1.said();
    }
}
