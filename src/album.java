import java.util.List;

public class album {
     List<anthem> a;
     List<rock> r;
     List<lullabies> l;
     album(List<anthem> a,List<rock> r,List<lullabies> l){
         this.a=a;
         this.r=r;
         this.l=l;
     }

     void displayAlbum(){

         System.out.println("\n\n");
         System.out.println("Here are the existing songs in your album: ");
         System.out.println("-----------------------------");
         for (anthem a:a){
             System.out.println(a);
         }
         for (rock r:r){
             System.out.println(r);
         }
         for(lullabies l:l){
             System.out.println(l);
         }
         System.out.println("-----------------------------");
     }

    /**
     *methods to allow new songs type in the album.
     */
            anthem MakeAnthem(String n,double du,String au){
                anthem a=new anthem(n,du,au);
                return a;
            }
            rock MakeRock(String n,double du,String au){
                rock r=new rock(n,du,au);
                return r;

            }
            lullabies MakeLullabies(String n,double du,String au){
                lullabies l=new lullabies(n,du,au);
                return l;
            }
                         void addAnthem(anthem newAnthem){
                             a.add(newAnthem);
                         }
                         void addRock(rock newRock){
                             r.add(newRock);
                         }
                         void addLullabies(lullabies newLullabies){
                             l.add(newLullabies);
                         }
}
