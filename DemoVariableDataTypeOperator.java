import java.util.Locale;

public class DemoVariableDataTypeOperator {
    public static void main(String[] args) {
        String firstName = "Le ", lastName = "Huu Nhan";
        int phoneNumber = 90553021,namHienTai = 2022,namSinh = 1996;
        String diaChi = "So 10 Su Hy Nhan";
        System.out.println("Ten: " + (firstName.toUpperCase()+ lastName.toUpperCase()));
        System.out.println("Dia Chi: " + diaChi);
        System.out.println("SDT: " + phoneNumber);
        System.out.print("Tuoi: " + (namHienTai - namSinh));
    }

}

