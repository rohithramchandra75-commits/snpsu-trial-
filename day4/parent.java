package day4;

public interface parent {
    void eat();
}
class child implements parent{
    @Override
    public void eat() {
        System.out.println("child eat");
    }
}
class child1  implements parent{
    @Override
    public void eat() {
        System.out.println("child1 eat");
    }
}
class driver3{
    public static void main(String[] args) {
        parent p=new child();
        p.eat();
        parent p1=new child1();
        p1.eat();
    }
}
