package questao2;

import java.awt.Graphics;
import java.awt.Panel;

public class PanelQ2 extends Panel {

    /**
     * Esta classe deve ser modificada para realizar o desenho da arvore binaria
     * solicitada na questao 01
     * @param g - contexto grafico
     */
    @Override
    public void paint(Graphics g) {
        // desenhe a arvore aqui
        g.drawOval(305,20, 30, 30);
     g.drawString(String.valueOf(5), 313, 42);
    g.drawLine(320, 50, 267, 80);
    g.drawLine(320, 50, 367, 80);
     
     g.drawOval(360,80, 30, 30);
     g.drawString(String.valueOf(18), 368, 96);
     
     g.drawOval(250,80, 30, 30);
     g.drawString(String.valueOf(2), 258, 96);
     g.drawLine(263,110,210 ,150 );
     g.drawLine(263,110,310 ,150 );
     
     g.drawOval(190,152, 30, 30);
     g.drawString(String.valueOf(-4), 198, 170);
    
      g.drawOval(305,152, 30, 30);
     g.drawString(String.valueOf(3), 313, 170);
    }
    
}
