import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int nums = sc.nextInt();

        String num = String.valueOf(nums);

        String sInvertida = new StringBuilder(num).reverse().toString();

        boolean result = num.equals(sInvertida);

        System.out.println(result);
        //Exemplo 1
        String[] strs = {"flowers","flow","fligth" };

        //Exemplo 2
        String[] strs2 = {"dog","racecer","car"};


        sc.close();
    }

    public String[] commonPrefix(String[] strs){
        for (int i = 0; i < strs.length; i++){
            var name = strs[i];
            for (int j = 0; i < name.length(); i++){

            }
        }
    }
}