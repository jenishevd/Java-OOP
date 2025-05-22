package This;

public class GettersSetters {
    String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        GettersSetters gs = new GettersSetters();
        gs.setName("John");
        System.out.println(gs.getName());
    }
}
