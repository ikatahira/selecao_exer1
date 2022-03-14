import java.util.Scanner;

import javafx.beans.binding.StringBinding;
public class SelecaoExer1{
    public static void main(String[]args){
        float x;
        Scanner resultadoX=new Scanner(System.in);
        System.out.println("Digite um valor para x:");
        x=resultadoX.nextFloat();
      while(x!=1){
        if(x%2==0){
            x = x / 2;
        }
        else{
            x = 3 * x + 1;
        }
    System.out.printf("%.0f -> ",x);    
    resultadoX.close();
}}}
    //%d    %s   %f