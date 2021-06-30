public class anthem extends song{

    anthem(String name,double duration,String author){
        super(name,duration,author);
    }
    public String toString(){
        return "--------------------\nName: "+name+"\nduration: "+ duration+"\nauthor: "+author+"\n--------------------\n";
    }


}
