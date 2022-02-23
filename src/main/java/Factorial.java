public class Factorial {
    private Object number;

    public Factorial(Object number) {
        this.number = number;
    }

    public int generateFactorial(){
        if ( !(this.number instanceof Integer ) ) {
            throw new IllegalArgumentException("Input should be of type integer.");
        }
        if(!( this.number instanceof Integer ) ) {
            throw new IllegalArgumentException("Input should be of type integer.");
        }

        int number = (Integer) this.number;

        if( number < 0 ){
            throw new IllegalArgumentException("Input value should not be negative.");
        }

        if( number == 0 || number == 1 ){
            return 1;
        }
        int factorialOfTheNumber = 1;
        for ( int range = 2; range <= number; range++ ){
            factorialOfTheNumber *= range;
        }
        return factorialOfTheNumber;
    }
}
