package ua.uni;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class fourth {
    private int id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "fourth{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        fourth fourth = new fourth();
        fourth.setId(3);
        fourth.setName("name");
        fourth.setEmail("example@gmail.com");

        System.out.println(fourth.toString());
    }
}
