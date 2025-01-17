public class PizzaConfig {
    private String name;
    private int basePrice;
    private OptionSet[] options;

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setPrice(int p){
        this.basePrice = p;
    }
    public int getPrice(){
        return basePrice;
    }
    public void setOptions(OptionSet[] op){
        this.options=op;
    }

    public PizzaConfig(String n, int maxOptionSets) {
        this.name=n;
        basePrice = 4000;
        this.options  = new OptionSet[maxOptionSets];
    }
    public PizzaConfig(String n, int basePrice, OptionSet[] op){
        this.name= n;
        this.basePrice= basePrice;
        this.options= op;
    }
    public PizzaConfig(){
        this.name = "";
        this.basePrice=4000;
        this.options = new OptionSet[10];
    }
}

