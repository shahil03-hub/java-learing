public class Methodexample {
    // no parrameter and no return type
          static void display(){
            System.out.println("Hello");
          }
    // no parrameter and return type
          static int add(){
            int a=10;
            int b=20;
            return a+b;
          }
    // parrameter and no return type
          static void display(int a,int b){
            System.out.println(a+b);
          }
    // parrameter and return type
          static int add1(int a,int b){
            return a+b; 
          }
          
     public static void main(String[] args) {
        display();
        System.out.println(add());
        display(10,20);
        System.out.println(add1(10,20));
        
    }
    
}
