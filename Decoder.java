import java.util.*;
public class homoputer {
    public static void main(String args[]){
        int p,r,l,k,m,nu,dec;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of secret word: ");
        l=sc.nextInt(); 
        //Creating an array to store binary numbers of different letters.
        int binary[]=new int[l];
        System.out.print("Enter the secret code: ");
        for(k=0;k<l;k++){
            binary[k]=sc.nextInt();
        }
        System.out.println();
        for(m=0;m<l;m++){
            char kh=' ';
            nu=binary[m];
            dec=0;
            p=0;
            while(nu>0){
                r=nu%10;
                dec=dec+r*(int)Math.pow(2,p);
                nu=nu/10;
                p++;
            }
            kh=(char)dec;
            System.out.print(kh);
	    }
        sc.close();
        //Demo Inputs
        //Input 1:
            //Length of Secret word = 56
            //Secret code = 1001000 1101001 100000 1001101 1100001 1111001 1100001 1101110 1101011 100001 100000 1010100 1100101 1101100 1101100 100000 1101101 1100101 100000 1101001 1101110 100000 1000010 1101001 1101110 1100001 1110010 1111001 100000 1100001 1101110 1100100 100000 1001001 100000 1110111 1101001 1101100 1101100 100000 1110100 1100001 1101100 1101011 100000 1101001 1101110 100000 1000101 1101110 1100111 1101100 1101001 1110011 1101000 101110
        //Input 2:
            //Length of Secret word = 17
            //Secret code = 1010111 1100101 1101100 1100011 1101111 1101101 1100101 100000 1110100 1101111 100000 1000111 1101111 1101111 1100111 1101100 1100101
    }

}

