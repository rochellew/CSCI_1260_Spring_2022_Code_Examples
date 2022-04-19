public class Pokemon {
    private int number;
    private String name;
    private String type;

    public Pokemon(int number, String name, String type)
    {
        this.number = number;
        this.name = name;
        this.type = type;
    }

    public int getNumber(){
        return this.number;
    }

    public String toString()
    {
        return name + "--" + type;
    }
}
