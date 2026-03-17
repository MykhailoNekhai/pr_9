package ua.uni;
import lombok.Data;

@Data
public class foutrh {
    private int id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "foutrh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        foutrh foutrh = new foutrh();
        foutrh.setId(3);
        foutrh.setName("name");
        foutrh.setEmail("example@gmail.com");

        System.out.println(foutrh.toString());
    }
}
