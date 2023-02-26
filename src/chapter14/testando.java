package chapter14;
import javax.swing.JOptionPane;

public class testando {

    public static String inversorString(String r) {
      /*
        String s = "Matheus";
        char[] charS = new char[s.length()];
        s.getChars(0, s.length(),charS, 0);
        for(int i = 0; i < (charS.length - 1) / 2; i++){
            char troca = charS[i];
            charS[i] = charS[(charS.length- 1 )- i];
            charS[(charS.length- 1 )- i] = troca;
        }
        String sInvertida = "";
        for(char i : charS){
            sInvertida += i;
        }
        System.out.printf("%s invertido fica: %s%n", s, sInvertida);
        */
        char[] charR = new char[r.length()];
        r.getChars(0, r.length(),charR, 0);
        String rInvertida = "";
        for(int i = (r.length() - 1); i >= 0; i--){
            rInvertida += charR[i];
        }
        return String.format("%s invertido fica: %s", r, rInvertida);
    };

}
