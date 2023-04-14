package another;

public class AnotherDep {
    public static void printMeh(String param){
        System.out.println("Just meh: " + param == null ? "" : param);
    }
}
