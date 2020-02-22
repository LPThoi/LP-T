import com.sun.corba.se.spi.servicecontext.ServiceContextData;

public class HangSo_4 {
    // Tao hang so co dinh tren ham main , vi du
    public static final int FN = 100; // Tao gia tri co dinh cho so thu nhat la 100
    public static final float SN = 4.6f; // Tao gia tri co dinh cho so thu hai la 4.6

    // Ham main
    public static void main(String[] args) {
        System.out.println("\t----------Keyword tao ra 1 hang so: Public static Final + kieu du lieu + Gia tri----------");
        System.out.println("Gia tri hang so thu nhat: ");
        Show_Value_Frist();
        System.out.println("Gia tri hang so thu hai: ");
        Show_Value_Second();
        System.out.println("Gia tri sau khi cong 2 so: ");
        System.out.print(FN+SN);
    }
    // Ham hien thi hang so FristNumber
    public static void Show_Value_Frist() {
        System.out.println(FN);
    }
    // Ham hien thi hang so SecondNumber
    public static void Show_Value_Second() {
        System.out.println(SN);
    }
}
