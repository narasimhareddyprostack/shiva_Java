public class Employee {
    int a=100;//instance variable
    static int b=200;
    public static void main(String[] args) {
        int c = 300;//local variable
        
        System.out.println(new Employee().b);//using object
        System.out.println(Employee.b);  //Class Name 
        System.out.println(b); //directory
    }
    
}
