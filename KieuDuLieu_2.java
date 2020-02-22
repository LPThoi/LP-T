public class KieuDuLieu_2 {
    public static void main(String[] args) {
        System.out.println("----------Java : 8 kieu du lieu nguyen thuy----------");
        System.out.println("- 4 kieu nguyen: int , long, short , byte");
        System.out.println("- 2 kieu thuc: float , double");
        System.out.println("- 1 kieu char");
        System.out.println("- 1 kieu boolean");
        System.out.println("- 1 kieu do nguoi dung dinh nghia");
        System.out.println("-----------Kiem tra kieu + Kich thuoc + Gia tri Min , Max-----------");
        System.out.printf("Kieu: %-10s Size: %-5s Min: %-20s Max: %-10s\n",
                Integer.TYPE, Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Kieu: %-10s Size: %-5s Min: %-20s Max: %-10s\n",
                Long.TYPE, Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("Kieu: %-10s Size: %-5s Min: %-20s Max: %-10s\n",
                Short.TYPE, Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Kieu: %-10s Size: %-5s Min: %-20s Max: %-10s\n",
                Byte.TYPE, Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Kieu: %-10s Size: %-5s Min: %-20s Max: %-10s\n",
                Float.TYPE, Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Kieu: %-10s Size: %-5s Min: %-20s Max: %-10s\n",
                Double.TYPE, Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("Kieu: %-10s Size: %-5s Min: %-20s Max: %-10s\n",
                Character.TYPE, Character.BYTES, Character.MIN_VALUE, Character.MAX_VALUE);
        System.out.printf("Kieu Boolean : Chi tra ve gia tri True or False");
    }
}
