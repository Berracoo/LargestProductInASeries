public class Main {

    public static void main(String[] args) {

        String numberStr = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

       //specifies how many digits you want to consider in each set
       int adjacentDigit = 13;
       long maxProduct = 0;
         // If you didn't subtract adjacentDigits, the inner loop could potentially go beyond the end of the string,resulting in an IndexOutOfBoundsException.
        // By subtracting adjacentDigits,you guarantee that the inner loop processes sets of digits within the valid range of the string length.
         for(int i = 0; i < numberStr.length() - adjacentDigit; i++){
             long product = 1;
             for(int j = 0; j < adjacentDigit; j ++){
                 // first we get the numbers indices(it starts from 0 and goes to 12 the indices change accordingly)
                 char digitChar = numberStr.charAt(i + j);
                 // and then we get their numeric value
                 int digit = Character.getNumericValue(digitChar);
                 // after we get their value we multiply it with the product
                 product *= digit;

             }
             if(product > maxProduct){
                 maxProduct = product;
             }

         }
        System.out.println(maxProduct);

    }
    // you can also do it like this but previous one is more convenient
//    // Store the digits in an array
//    int[] digits = new int[numberStr.length()];
//        for (int i = 0; i < numberStr.length(); i++) {
//        char digitChar = numberStr.charAt(i);
//        digits[i] = Character.getNumericValue(digitChar);
//    }
//    // Calculate products of adjacent digits
//    long maxProduct = 0;
//    // we are trying to find the 13 digit adjacent number's biggest product so the length should be like this
//    long[] products = new long[numberStr.length() - 12];
//        for(int i = 0; i < numberStr.length() - 12; i++){
//        products[i] = (long)digits[i] * digits[i + 1] * digits[i + 2] * digits[i + 3] * digits[i + 4]
//                * digits[i + 5] * digits[i + 6] * digits[i + 7] * digits[i + 8] * digits[i + 9] * digits[i + 10]
//                * digits[i + 11] * digits[i + 12];
//        // this conditional will let us know what the largest product is
//        if(products[i] > maxProduct){
//            maxProduct = products[i];
//        }
//    }
//        System.out.println(maxProduct);
}
