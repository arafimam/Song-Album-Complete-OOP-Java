import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        anthem Barbados=new anthem("In plenty and In time of need",4,"Irving Burgie");
        anthem Bangladesh=new anthem("Amar Shonar Bangla",6,"Rabindranath Tagore");



        rock SFF=new rock("Strawberry Fields Forever",4,"The Beatles");
        rock STH=new rock("Stairway to Heaven",3.6,"Led zeppelin");

        lullabies Blackbird=new lullabies("Blackbird",2.4,"The beatles");
        lullabies Baby=new lullabies("Baby Sleep",2.6,"Baby sleep Music");

        List<anthem>anthemList=new ArrayList<>();
        List<rock>rockList=new ArrayList<>();
        List<lullabies>lullabiesList=new ArrayList<>();

        anthemList.add(Bangladesh);
        anthemList.add(Barbados);

        rockList.add(SFF);
        rockList.add(STH);

        lullabiesList.add(Blackbird);
        lullabiesList.add(Baby);

        System.out.println("Hello! User here is your album.");
        album a=new album(anthemList,rockList,lullabiesList);
        a.displayAlbum();

        /**
         * prompt user for adding anthem type song as much as he wishes to do so
         */
        System.out.println("Do you want to add any song to your album?");
        System.out.println("Enter y to do so");
        String i;
        i=(s.nextLine()).toLowerCase();
        if(i.equals("y")){
            Scanner k=new Scanner(System.in);
            String u;
            System.out.println("which type of song do you want to enter?");
            u=(k.nextLine()).toLowerCase();
            if(u.equals("anthem")){
                String check="n";

                do{
                    String j,l;
                    double p;


                    System.out.println("type the name of the anthem song:");
                    Scanner rty=new Scanner(System.in);
                    j=rty.nextLine();

                    System.out.println("type duration(in minutes):");
                    p=k.nextDouble();

                    System.out.println("type author name: ");
                    Scanner asd=new Scanner(System.in);
                    l=asd.nextLine();

                    a.addAnthem(a.MakeAnthem(j,p,l));
                    System.out.println("do you wish to add another anthem song? Press y to do so or any other button for no");
                    Scanner foo=new Scanner(System.in);
                    check=(foo.nextLine()).toLowerCase();


                }while(check.equals("y"));


            }
            else if(u.equals("rock")){
                String check="n";

                do{
                    String j,l;
                    double p;


                    System.out.println("type the name of the anthem song:");
                    Scanner rty=new Scanner(System.in);
                    j=rty.nextLine();

                    System.out.println("type duration(in minutes):");
                    p=k.nextDouble();

                    System.out.println("type author name: ");
                    Scanner asd=new Scanner(System.in);
                    l=asd.nextLine();

                    a.addAnthem(a.MakeAnthem(j,p,l));
                    System.out.println("do you wish to add another anthem song? Press y to do so or any other button for no");
                    Scanner foo=new Scanner(System.in);
                    check=(foo.nextLine()).toLowerCase();


                }while(check.equals("y"));

            }
            else if(u.equals("lullabies")){
                String check="n";

                do{
                    String j,l;
                    double p;


                    System.out.println("type the name of the anthem song:");
                    Scanner rty=new Scanner(System.in);
                    j=rty.nextLine();

                    System.out.println("type duration(in minutes):");
                    p=k.nextDouble();

                    System.out.println("type author name: ");
                    Scanner asd=new Scanner(System.in);
                    l=asd.nextLine();

                    a.addAnthem(a.MakeAnthem(j,p,l));
                    System.out.println("do you wish to add another anthem song? Press y to do so or any other button for no");
                    Scanner foo=new Scanner(System.in);
                    check=(foo.nextLine()).toLowerCase();


                }while(check.equals("y"));

            }





        }
        else{
            System.out.println("Songs are currently playing. Sit back and relax");

        }
        System.out.println("Here is the updated album:");
        a.displayAlbum();
    }
}
