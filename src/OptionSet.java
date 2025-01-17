public class OptionSet {
    private String name;
    private Option[] choices;

    protected void setName(String name) {
        this.name = name;
    }
    protected String getName(){
        return name;
    }
    protected void setChoices(Option[] c){
        this.choices=choices;
    }
    public OptionSet(String n, int choiceSize){
        this.name=n;
        this.choices = new Option[choiceSize];
    }
    private class Option{
        private String name;
        private double price;

        public void setName(String n){
            this.name= n;
        }
        public String getName(){
            return name;
        }
        public void setPrice(double p){
            this.price=p;
        }
        public double getPrice(){
            return price;
        }
        protected Option(String n, double p){
            this.name=n;
            this.price=p;
        }
    }
}
