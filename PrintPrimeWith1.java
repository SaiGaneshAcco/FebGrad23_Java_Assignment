

import java.math.BigInteger;
import java.util.*;

public class PrintPrimeWith1 {
    public static void main(String args[]){


        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        s = scanner.nextLine();

        BigInteger n = new BigInteger(s);
        List<BigInteger> list = new ArrayList<>();

        for(var i=n; i.compareTo(new BigInteger("0"))!=0; ){
            if(checkPrime(i)){
                list.add(i);
                i = n.subtract(i);
                n= i;
            }
            else i= i.subtract(new BigInteger("1"));
        }
       printList(list);
        scanner.close();
    }

    private static boolean checkPrime(BigInteger num){

        if(num.compareTo(new BigInteger("1"))==0)
        {
            return false;
        }
        for(BigInteger i= BigInteger.valueOf(2);  i.compareTo(num.divide(new BigInteger("2")))<0; i=i.add(new BigInteger("1")))
        {
            if((num.mod(i)).compareTo(new BigInteger("0")) == 0)
                return  false;
        }
        return true;
    }
    static void printList(List<BigInteger> list){
        StringBuilder str=new StringBuilder("");
        for(BigInteger b:list){
            str.append(b.toString()+"+");
        }
        String s=str.substring(0, str.length()-1);
        System.out.println(s);
    }
}