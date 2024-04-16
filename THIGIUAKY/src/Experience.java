import java.util.ArrayList;

public class Experience implements Employee{
    private int id;
    private String fullname;
    private String dob;
    private int phone;
    private String mail;
    private String employee_type;
    private int employee_count;
    private int Experient_Year;
    private String ProSkill;
    private ArrayList<Experience> DSNV_KN;
    public Experience(int id, String fullname, String dob, int phone, String mail, String employee_type, int employee_count, int Experient_Year, String ProSkill){
        this.id=id;
        this.fullname=fullname;
        this.dob=dob;
        this.phone=phone;
        this.mail=mail;
        this.employee_count=employee_count;
        this.employee_type=employee_type;
        this.ProSkill=ProSkill;

    }

    public int getId() {
        return id;
    }

    public int getEmployee_count() {
        return employee_count;
    }

    public int getPhone() {
        return phone;
    }

    public String getDob() {
        return dob;
    }

    public int getExperient_Year() {
        return Experient_Year;
    }

    public String getFullname() {
        return fullname;
    }

    public String getMail() {
        return mail;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_type() {
        return employee_type;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setEmployee_count(int employee_count) {
        this.employee_count = employee_count;
    }

    public void setEmployee_type(String employee_type) {
        this.employee_type = employee_type;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setExperient_Year(int experient_Year) {
        Experient_Year = experient_Year;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
//    public Experience(int id, String fullname, String dob,
//    int phone, String mail, String employee_type, int employee_count,
//    int Experient_Year, String ProSkill){
    @Override
    public String showInfo() {
        return("Id"+id +"Fullname"+fullname+"DOB"+dob+"Phone"+phone+"Mail"+mail+"Employee_Type"+employee_type+"Experience Year"+Experient_Year+"Skill"+ProSkill);



    }
}
