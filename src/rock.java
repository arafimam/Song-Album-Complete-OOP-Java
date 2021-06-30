public class rock extends song{
    rock(String name,double duration,String author){
        super(name,duration,author);
    }
    public String toString(){
        return "--------------------\nName: "+name+"\nduration: "+ duration+"\nauthor: "+author+"\n--------------------\n";
    }
}
