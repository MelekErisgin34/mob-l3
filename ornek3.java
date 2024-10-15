import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int puan;

        System.out.println("Aldıgı puan ");
        puan=oku.nextInt();
        if(puan<50){
            System.out.println("1 ile kaldı");
        }
        else if (puan>=50 && puan<60){
            System.out.println("2 ıle gectı");
        }
        else if (puan>=60 && puan<70){
            System.out.println("3 ile gecti");
        }
        else if (puan>=70&& puan<85){
            System.out.println("4 ile gecti");
        }
        else{
            System.out.println("5 ile gectı");
        }





    }
}
