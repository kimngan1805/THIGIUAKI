import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        CRUD crud= new CRUD();
        while (true){
            System.out.println("1 -  Add nhân viên: ");
            System.out.println("2 - Update nhân viên: ");
            System.out.println("3 - Delete nhân viên");
            System.out.println("4 - Save vào file");
            System.out.println("5 - Read dữ liệu từ file");
            System.out.print("Please input your choose: ");
            int choice= scanner.nextInt();
            switch (choice){
                case 1:
                    crud.AddEmployee();
                    break;
                case 2:
                    crud.updateEmployee();
                    break;
                case 3:
                    crud.delete();
                    break;
                case 4:
                    crud.saveFile();
                    break;
                case  5:
                    crud.LoadFile("/Users/kimngan/Documents/java/THIGIUAKY/src/data");
                    break;
                default:
                    System.out.println("Không hợp lệ. Vui lòng chọn lại");
                    break;
            }
        }
    }
}