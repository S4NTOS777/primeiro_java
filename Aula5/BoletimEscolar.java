package Aula5;
import javax.swing.JOptionPane;
public class BoletimEscolar {
    public static void main(String[] args) {
       double [][] boletim = new double [3][4];
        for (int l=0;l<3;l++){
            for (int c=0;c<4;c++){
                String nota = JOptionPane.showInputDialog("Digite a nota " + (c+1)+ "ª" + " do Aluno " + (l+1));
              boletim [l][c] = Double.parseDouble(nota);
                JOptionPane.showMessageDialog(null, "A nota " + (c+1) + " do Aluno " + (l+1) + " é: " + boletim[l][c]);
            }
        }
    }
}
