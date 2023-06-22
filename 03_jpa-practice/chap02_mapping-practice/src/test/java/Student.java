import javax.persistence.*;

@Entity
@Table
public class Student {

    @Id
    @Column(name = "student_no", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentNo;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "major", nullable = false)
    private int major;

    @Column(name = "phone", nullable = false, columnDefinition = "varchar(200) default '010-0000-0000'")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    public Student() {
    }

    public Student(int studentNo, String name, int major, String phone, String email, String address) {
        this.studentNo = studentNo;
        this.name = name;
        this.major = major;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", major=" + major +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
