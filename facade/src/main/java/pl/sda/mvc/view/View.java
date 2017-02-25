package pl.sda.mvc.view;

import pl.sda.mvc.controler.Controler;

import java.util.Scanner;

/**
 * Created by k.czechowski83@gmail.com on 2017-02-25.
 */
public class View {
    public static void main(String[] args) {
      
        while (true){
            Scanner scanner=new Scanner(System.in);
            Integer choise=scanner.nextInt();
            Controler controler=new Controler();
            if(choise!=null&&choise>0){
                int result = controler.getFibonnaci(choise);
                System.out.println("FIB = "+result);
            }else{
                System.out.println("AVG = "+controler.average());
            }

        }
    }


}
