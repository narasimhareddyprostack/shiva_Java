public class Employee {
    int a=100;//instance variable
    static int b=200;
    public static void main(String[] args) {
        int c = 300;//local variable

        Employee e1=new Employee();
        Employee e2=new Employee();

        System.out.println(e1.a + e1.b);
        e2.a = 1;
        System.out.println(e2.a+e2.b);
    }
    
}
