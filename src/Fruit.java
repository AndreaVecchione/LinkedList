public class Fruit {
    private String nome;

    public Fruit (String nome) {
        this.nome = nome;


    }
    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }



    @Override
    public String toString() {
        return "Frutta: {" +
                "nome = " + nome +
                '}';
    }
}
