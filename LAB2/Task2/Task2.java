
class Task2 {
    public static void main(String[] args) {
        
        int x = 1, y = 2, z= 9;
        boolean result;
        
        result = (x > y) || (z > x);
        System.out.println(result);
                
        result = (x > y) && (z > y);
        System.out.println(result);
    }
}