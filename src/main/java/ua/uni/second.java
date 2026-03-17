package ua.uni;

public class second {

    public String buildTicketId(String base) {
        int id = 100;
        String name = "TICKET";

        class IdBuilder {
            public String build() {
                return name + "-" + base + "-" + id;
            }
        }

        IdBuilder builder = new IdBuilder();
        return builder.build();
    }

    public Runnable runOnce() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable made once");
            }
        };
    }

    public static void main(String[] args) {
        second service = new second();

        String ticketId = service.buildTicketId("example");
        System.out.println(ticketId);

        Runnable task = service.runOnce();
        task.run();
    }
}