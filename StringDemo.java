import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringDemo {
    public static void main(String[] args) {
        String s = "vimal shah";
        int totalcount = s.length();
        int totalcount_afterRemove=s.replace("v","").length();
        int count= totalcount-totalcount_afterRemove;
        System.out.println("Number occurances of v is :"+count);


    }
}
