
        public class ShowListPrimeNumber {
            public static void main(String[] args) {
                int n;
                for (n = 2; n <= 100; n++) {
                    int i = 2;
                    boolean check = true;
                    while ( i <= Math.sqrt(n) ) {
                        if (n % i == 0){
                            check = false;
                            break;
                        }
                        i++;
                    }
                    if (check)
                        System.out.println(n);
                }
            }
        }


