package questao3;

import java.awt.Graphics;
import java.awt.Panel;

public class PanelQ3 extends Panel {
    
    protected int nodox = 300;
    protected int nodoy = 20;

    public PanelQ3() {
        addKeyListener(new EventoMovimentaNodo(this));
    }
    
    @Override
    public void paint(Graphics g) {
        this.desenhaNodo(g, 10, nodox, nodoy);
    }
    
    private void desenhaNodo(Graphics g, int key, int x, int y) {
        //substitua este metodo pelo metodo que voce criou na questao1
     g.drawOval(x,y, 30, 30);
     g.drawString(String.valueOf(key), x+8, y+20); 
    }
    
}
