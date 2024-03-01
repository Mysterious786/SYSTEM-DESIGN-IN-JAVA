package ProxyDesignPattern;

public class ProxyDesignPattern {
    public static void main(String[] args) {
        try{
            EmployeeDao emp = new EmployeeDaoProxy();
            emp.create("ADMIN",new EmployeeDo());
            System.out.println(("operation successful"));

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
