import java.util.Scanner;

public class ornek1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        float y1,y2,ortalama;
        System.out.print(("1.yazılı"));
        y1=oku.nextFloat();
        System.out.print(("2.yazılı"));
        y2=oku.nextFloat();
        ortalama=(y1+y2)/2;
        System.out.print("ortalamanız");

        if(ortalama>=50){
            System.out.print("gectınız");
        }
        else{
            System.out.print("kaldınız cunku hoca zor yapmıs");
    }
}
}