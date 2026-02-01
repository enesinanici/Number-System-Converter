public class Converter {

    // Convert Decimal to Binary (Algorithmic approach)
    public String decimalToBinary(int decimal) {
        if (decimal == 0) return "0";
        StringBuilder binary = new StringBuilder();
        int num = decimal;

        while (num > 0) {
            int remainder = num % 2;
          binary.insert(0, remainder);
            num = num / 2;
        }
        return binary.toString();
    }
    public int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        // Calculate from the last digit to the first
        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(binary.charAt(i));
            decimal += digit * Math.pow(2, power);
            power++;
        }
        return decimal;
    }

    // Convert Decimal to Hexadecimal
    public String decimalToHex(int decimal) {
        if (decimal == 0) return "0";
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuilder hex = new StringBuilder();
        int num = decimal;

        while (num > 0) {
            int remainder = num % 16;
            hex.insert(0, hexChars[remainder]);
            num = num / 16;
        }
        return hex.toString();
    }
}
