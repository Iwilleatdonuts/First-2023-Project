import java.util.Timer;
import java.util.TimerTask;

public class TheHumbler {
    public static void main(String[] args) {
        Timer timer = new Timer();
        String one = "a";   String two = "b";    String three = "c";    String four = "d";
        String five = "e";    String six = "f";     String seven = "g";    String eight = "h";
        String nine = "i";    String ten = "j";    String eleven = "k";    String twelve = "l";
        String thirteen = "m";    String fourten = "n";    String fiveten = "o";    String sex = "p";
        String sevente = "q";    String adult = "r";    String twenty1 = "s";    String twozero = "t";
        String twentyone = "u";    String deuxdeux = "v";    String twntytree = "w";    String two4 = "x";
        String two5 = "y";    String twothirten = "z";    String space = " ";

        String alphabet = one+two+three+four+five+six+seven+eight+nine+ten+eleven+twelve+thirteen+fourten+fiveten+sex+sevente+adult+twenty1+twozero+twentyone+deuxdeux+twntytree+two4+two5+twothirten+space;
        System.out.println(alphabet);
        
        String idk[] = {
            six+twentyone+three+eleven+space+two5+fiveten+twentyone+space, 
            twentyone+adult+space+adult+five+twozero+one+adult+four+five+four+space, 
            two+adult+one+nine+fourten+four+five+one+four+space, 
            twentyone+adult+space+twozero+adult+one+twenty1+eight+space, 
            twelve+space+two+fiveten+twothirten+fiveten+space, 
            nine+space+six+twentyone+three+eleven+five+four+space+twentyone+adult+space+thirteen+fiveten+thirteen+space,
            twenty1+eight+nine+twozero+eight+five+one+four+space,
            eleven+nine+twelve+twelve+space+twentyone+adult+twenty1+five+twelve+six+space
        };
        TimerTask whatever = new TimerTask() {
            public void run() {
                System.out.print(idk[(int)(Math.random()*idk.length)]);
            }
        };
        timer.schedule(whatever, 5000,10);
    }
}