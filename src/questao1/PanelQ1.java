package questao1;

import java.awt.Graphics;
import java.awt.Panel;

public class PanelQ1 extends Panel {

    @Override
    public void paint(Graphics g) {
        this.desenhaNodo(g, 10, 300, 20);
    }
    
    /**
     * Metodo privado para desenho de nodo;
     * utilize este metodo para desenhar um nodo dado um valor e suas coordenadas
     * x e y.
     * @param g contexto grafico
     * @param key valor que ficara no centro do nodo
     * @param x coordenada x da localizacao do nodo
     * @param y coordenada y da localizacao do nodo
     */
    private void desenhaNodo(Graphics g, int key, int x, int y) {
     g.drawOval(305,20, 30, 30);
     g.drawString(String.valueOf(key), x+14, y+22);
    }
    
}
