package questao2;

import eventos.FecharJanela;
import java.awt.Frame;

public class JanelaQ2 extends Frame {

    public JanelaQ2() {
        setVisible(true);
        setSize(600, 400);
        setTitle("Desenho arvore binaria: Questão 02");
        addWindowListener(new FecharJanela());
        add(new PanelQ2());
    }
    
    public static void main(String[] args) {
        new JanelaQ2();
    }
    
}
