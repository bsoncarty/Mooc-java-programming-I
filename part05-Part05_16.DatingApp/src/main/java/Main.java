
public class Main {

    public static void main(String[] args) {
        // test your program here!
        
        SimpleDate date = new SimpleDate(1, 2, 100);
        SimpleDate date1 = new SimpleDate(30, 2, 100);
        SimpleDate date2 = new SimpleDate(30, 12, 100);
        
        date.advance();
        System.out.println(date);
        
        date1.advance();
        System.out.println(date1);
        
        date2.advance();
        System.out.println(date2);
        
        date.advance(5);
        System.out.println(date);
    }
    
    
}
