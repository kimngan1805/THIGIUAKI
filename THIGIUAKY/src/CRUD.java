import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CRUD implements Employee{
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    // tạo mảng cho danh sách nhân viên
    FileReader in= null;
    FileWriter out= null;
    public ArrayList<Experience> DSNV_KN= new ArrayList<>();
    public ArrayList<Fresher> DSNV_Fresher=new ArrayList<>();
    public ArrayList<Intern> DSNV_Intern= new ArrayList<>();
    int count=0;
    // function thêm nhân viên mới
    public  void AddEmployee(){
        boolean continueAdding=true;// đặt làm biến kiểm tra vòng lặp chạy
        Scanner scanner= new Scanner(System.in);
        while (continueAdding){
            System.out.println("Nhập vào ID nhân viên:");
            int id= scanner.nextInt();
            System.out.println("Nhập vào họ tên nhân viên:");
            String fullname= scanner.nextLine();
            System.out.println("Nhập vào ngày tháng năm sinh của nhân viên:");
            String dob= scanner.nextLine();
            System.out.println("Nhập vào số điện thoại của nhân viên:");
            int phone=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập vào email của nhân viên:");
            String mail= scanner.nextLine();
            System.out.println("Chọn nhân viên:");
            System.out.println("1- Nhân viên Experience ");
            System.out.println("2- Nhân viên Fresher");
            System.out.println("3- Nhân viên Intern");
            int choice= scanner.nextInt();
            scanner.nextLine();
            // đưa vào cấu trúc switch case để phân loại nhân viên dễ dàng
            switch (choice){
                case 1:
                    String employee_type= "Nhân viên Experience";
                    System.out.println("Nhập vào số năm kinh nghiệm mà bạn có:");
                    int year_Experience=scanner.nextInt();
                    System.out.println("Nhập vào các kỹ năng chuyên môn mà bạn có:");
                    String pro_skill=scanner.nextLine();
                    count++;
                    Experience e1= new Experience(id,fullname,dob,phone,mail,employee_type,count,year_Experience,pro_skill);
                    DSNV_KN.add(e1);
                    System.out.println("Thêm nhân viên Experience thành công!");
                    break;
                case 2:
                    String employee_type2= "Nhân viên Fresher";
                    System.out.println("Nhập vào thời gian tốt nghiệp:");
                    int year= scanner.nextInt();
                    System.out.println("Nhập vào xếp loại tốt nghiệp:");
                    String rank= scanner.nextLine();
                    System.out.println("Nhập vào trường bạn tốt nghiệp:");
                    String university=scanner.nextLine();
                    count++;
                    Fresher f1= new Fresher(id, fullname,dob,phone,mail,employee_type2,count,year,rank,university);
                    DSNV_Fresher.add(f1);
                    System.out.println("Thêm nhân viên Fresher thành công!");
                    break;
                case 3:
                    String employee_type3= "Nhân viên Intern";
                    System.out.println("Nhập vào chuyên ngành theo học:");
                    String major= scanner.nextLine();
                    System.out.println("Nhập vào kì học đang học:");
                    int hocki= scanner.nextInt();
                    System.out.println("Nhập vào trường đang theo học:");
                    String uni= scanner.nextLine();
                    count++;
                    Intern i1= new Intern(id, fullname, dob, phone,mail,employee_type3, count, major, hocki, uni);
                    DSNV_Intern.add(i1);
                    System.out.println("Thêm nhân viên Intern thành công!");
                    break;
            }
            System.out.println("Bạn có muốn thêm tiếp không? " +
                    "1. Có" +
                    "2. Không");
            int choose= scanner.nextInt();
            if(choose !=1){
                continueAdding=false; // nếu người dùng không muốn nhập thêm thì sẽ thoát khỏi vòng lặp.
            }
        }
    }
    public  void updateEmployee(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vào mã số id cần cập nhật:");
        int search= scanner.nextInt();
        // vòng chạy cập nhật nhân viên
        for( Experience e2: DSNV_KN){
            if(e2.getId()==search){
                System.out.println("Nhập vào tên nhân viên :");
                String newName=scanner.nextLine();
                e2.setFullname(newName);
                System.out.println("Nhập vào ngày sinh:");
                String newDob=scanner.nextLine();
                e2.setDob(newDob);
                System.out.println("Nhập vào số điện thoại ");
                int newPhone=scanner.nextInt();
                e2.setPhone(newPhone);
                System.out.println("Nhập vào email :");
                String newMail= scanner.nextLine();
                e2.setMail(newMail);
                System.out.println("Nhập vào số năm kinh nghiệm");
                int new_year_ex=scanner.nextInt();
                e2.setExperient_Year(new_year_ex);
                System.out.println("Nhập vào kỹ năng chuyên môn");
                String new_proskill=scanner.nextLine();
                e2.setProSkill(new_proskill);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        for(Fresher f2: DSNV_Fresher){
            if(f2.getID()==search){
                System.out.println("Nhập vào tên nhân viên :");
                String newName=scanner.nextLine();
                f2.setFullName(newName);
                System.out.println("Nhập vào ngày sinh:");
                String newDob=scanner.nextLine();
                f2.setBirthDay(newDob);
                System.out.println("Nhập vào số điện thoại ");
                int newPhone=scanner.nextInt();
                f2.setPhone(newPhone);
                System.out.println("Nhập vào email :");
                String newMail= scanner.nextLine();
                f2.setEmail(newMail);
                System.out.println("Nhập thời gian tốt nghiệp:");
                int year= scanner.nextInt();
                f2.setGraduation_date(year);
                System.out.println("Nhập loại tốt nghiệp:");
                String rank= scanner.nextLine();
                f2.setGraduation_rank(rank);
                System.out.println("Nhập trường tốt nghiệp");
                String univer= scanner.nextLine();
                f2.setEducation(univer);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        for(Intern i2: DSNV_Intern){
            if(i2.getID()==search){
                System.out.println("Nhập vào tên nhân viên :");
                String newName=scanner.nextLine();
                i2.setFull_name(newName);
                System.out.println("Nhập vào ngày sinh:");
                String newDob=scanner.nextLine();
                i2.setDob(newDob);
                System.out.println("Nhập vào số điện thoại ");
                int newPhone=scanner.nextInt();
                i2.setPhone(newPhone);
                System.out.println("Nhập vào email :");
                String newMail= scanner.nextLine();
                i2.setMail(newMail);
                System.out.println("Nhập chuyên ngành đang học: ");
                String chuyennganh = scanner.nextLine();
                i2.setMajor(chuyennganh);

                System.out.println("Nhập học kì đang học");
                int hocki = scanner.nextInt();
                scanner.nextLine();
                i2.setSemester(hocki);

                System.out.println("Nhập trường đang học: ");
                String name_school = scanner.nextLine();
                i2.setUniversity(name_school);

                System.out.println("Cập nhật thông tin thành công!");
                return;
            }
        }
        System.out.println("Not found the id.");
    }
    public  void delete() {
    System.out.println("Nhập ID nhân viên mà bạn muốn xoá:");
    Scanner sc= new Scanner(System.in);
    int ID= sc.nextInt();
    // vòng lặp thực hiện chức năng xoá nhân viên
        for (int i=0; i<DSNV_KN.size(); i++){
            Experience e3= DSNV_KN.get(i);
            if(e3.getId()==ID){
                DSNV_KN.remove(i);// xoá nhân viên sau khi người dùng nhập vào id muốn xoá
                count--;//giảm danh sách
                System.out.println("Đã xoá nhân viên Experience");
                return;
            }
        }
        for(int i=0; i<DSNV_Fresher.size(); i++){
            Fresher f3= DSNV_Fresher.get(i);
            if(f3.getID()==ID){
                DSNV_Fresher.remove(i);
                count --;
                System.out.println("Đã xoá nhân viên Fresher");
                return;
            }
        }
        for(int i=0; i<DSNV_Intern.size(); i++){
            Intern i3= DSNV_Intern.get(i);
            if(i3.getID()==ID){
                DSNV_Intern.remove(i);
                count --;
                System.out.println("Đã xoá nhân viên Intern");
                return;
            }
        }
        System.out.println("Not found your id input:");
    }
    // method để lưu dữ liệu vào file txt
    public  void saveFile( ){
        Collections.sort(DSNV_KN,Collections.reverseOrder());
        for(Experience e:DSNV_KN){
            System.out.println(e);
        }
        try(PrintWriter writer= new PrintWriter("/Users/kimngan/Documents/java/THIGIUAKY/src/in.txt")){
            for(Experience e:DSNV_KN){
                writer.println(e.showInfo());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        for(Fresher f: DSNV_Fresher){
            System.out.println(f);
        }try(PrintWriter writer= new PrintWriter("/Users/kimngan/Documents/java/THIGIUAKY/src/in.txt")){
            for(Fresher f:DSNV_Fresher){
                writer.println(f.showInfo());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        for(Intern i:DSNV_Intern){
            System.out.println(i);
        }try(PrintWriter writer= new PrintWriter("/Users/kimngan/Documents/java/THIGIUAKY/src/in.txt")){
            for(Intern i:DSNV_Intern){
                writer.println(i.showInfo());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    // method dùng để load dữ liệu
   public  void LoadFile(String filename){
        try{
            FileInputStream fileIn= new FileInputStream(filename);
            ObjectInputStream obin= new ObjectInputStream(fileIn);
            DSNV_KN=(ArrayList<Experience>) obin.readObject();
            DSNV_Fresher=(ArrayList<Fresher>) obin.readObject();
            DSNV_Intern=(ArrayList<Intern>) obin.readObject();
            count=(int)obin.readObject();
            obin.close();
            fileIn.close();
            System.out.println("Dữ liệu đã load");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
   }

    @Override
    public String showInfo() {
        System.out.println("Danh sach nhan vien Experience");
        for(Experience e4: DSNV_KN){
            System.out.println(e4);
        }
        System.out.println("Danh sach nhan vien Fresher");
        for(Fresher f4:DSNV_Fresher){
            System.out.println(f4);
        }
        System.out.println("Danh sach nhan vien Intern");
        for(Intern i4: DSNV_Intern){
            System.out.println(i4);
        }
        return String.valueOf(false);
    }
    // lưu vào database:
    public void connect(){
        DatabaseConnection connect= new DatabaseConnection();
        Connection connectDB= connect.getConnection();
        String check="select * from Experience where id=";
        try{
            prepare=connectDB.prepareStatement(check);
            result=prepare.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
