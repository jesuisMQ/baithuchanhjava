public class use_throw {
        static void validate(int date){
            try {
                if ( date < 18)
                    throw new ArithmeticException("not valid");
                else 
                System.out.println("Welcome");
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        public static void main(String[] args) {
            validate(13);
            System.out.println("rest of the code......");
        }
    }

