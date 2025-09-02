public class calculator {
    public int add (int a , int b ) {
        return a + b;
    }
        public int add (int a , int b , int c){
            return a+b+c;
    }
    public double add (double a , double b ){
        return a+b;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println( calc.add(1,3));
        System.out.println(calc.add(3.2,4.22));
    }
}
