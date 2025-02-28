package Hozo;

public class _1_Binary_to_another_numbers {
    public static void main(String[] args) {
        String sbn = "1111111101";
        int dbn = 1111111101;
        int bn = 0b1111111101;


//        binaryToDecimal(sbn,dbn,bn);
//        binaryToHexa(sbn,dbn,bn);
        binaryToOctal(sbn,dbn,bn);

    }

    public static void binaryToOctal(String sbn,int dbn,int bn){
//        String Binary to octal
        StringBuilder strAns = new StringBuilder();
        for (int i=sbn.length()-1;i>=0;){
            int threeBit = 0;
            for(int j=0;j<3&&i>=0;j++){
                if(sbn.charAt(i) == '1'){
                    threeBit |= 1 << j;
                }
                --i;
            }
            strAns.insert(0, threeBit);
        }
        System.out.println("String Binary to HexaDecimal : " + strAns);

        //        Decimal Binary to octal
        StringBuilder decAns = new StringBuilder();
        while(dbn>0){
            int threeBit = 0;
            for(int j=0;j<3&&dbn>0;j++){
                if(dbn%10 == 1){
                    threeBit |= 1 << j;
                }
                dbn /=10;
            }
            decAns.insert(0, threeBit);
        }
        System.out.println("Decimal Binary to HexaDecimal : " + decAns);

        //        Decimal Binary to octal
        StringBuilder binAns = new StringBuilder();
        while(bn>0){
            int threeBit = 0;
            for(int j=0;j<3&&bn>0;j++){
                if(bn%2 == 1){
                    threeBit |= 1 << j;
                }
                bn /=2;
            }
            binAns.insert(0, threeBit);
        }
        System.out.println("Binary to HexaDecimal : " + binAns);
    }

    public static void binaryToHexa(String sbn,int dbn,int bn){
        // String Binary to Hexadecimal
        String strAns = "";
        for(int i = sbn.length()-1,k=0;i>=0;){
            int fourBitVal = 0;
            for(int j=0;j<4&&i>=0;j++,i--){
//                if(sbn.charAt(i) == '1'){
//                    fourBitVal += (int) Math.pow(2,j);
//                }
                if(sbn.charAt(i)=='1'){
                    fourBitVal |= 1 << j;
                }
            }
            strAns =  (fourBitVal >=10) ? (char) ('A'+fourBitVal%10) + strAns : (fourBitVal) + strAns;
        }
        System.out.println("String Binary to HexaDecimal : " + strAns);

        // Decimal to Binary to Decimal
//        int i=0;
        String decAns = "";
        while (dbn>0){
            int fourBitVal = 0;
            for(int j=0;j<4 && dbn >0;j++){
                if(dbn % 10 == 1){
                    fourBitVal |= 1 << j;
                }
                dbn /= 10;
            }
            decAns =  (fourBitVal >=10) ? (char) ('A'+fourBitVal%10) + decAns : (fourBitVal) + decAns;
        }

        System.out.println("Decimal Binary to HexaDecimal : " + decAns);

        // Binary Number to Binary to Decimal
        String binAns = "";
        while (bn>0){
            int fourBitVal = 0;
            for(int j=0;j<4 && bn >0;j++){
                if(bn % 2 == 1){
                    fourBitVal |= 1 << j;
                }
                bn /= 2;
            }
            binAns =  (fourBitVal >=10) ? (char) ('A'+fourBitVal%10) + binAns : (fourBitVal) + binAns;
        }

        System.out.println("Binary to HexaDecimal : " + binAns);


    }

    public static void binaryToDecimal(String sbn,int dbn,int bn){
        // String to Binary to Decimal
        int strAns = 0;
        for(int i=sbn.length()-1,j=0;i>=0;i--,j++){
            if(sbn.charAt(i) == '1'){
                strAns += (int) Math.pow(2,j);
            }
        }
        System.out.println("String Binary to Decimal : " + strAns);

        // Decimal to Binary to Decimal
        int decAns = 0;
        int i=0;
        while (dbn>0){
            decAns += (int) (dbn%10 * Math.pow(2,i++));
            dbn /=10;
        }
        System.out.println("Decimal Binary to Decimal : " + decAns);

        // Binary Number to Binary to Decimal
        int binAns = 0;
        i=0;
        while (bn>0){
            binAns += (int) (bn%2 * Math.pow(2,i++));
            bn /=2;
        }
        System.out.println("Binary Binary to Decimal : " + binAns);
    }
}
