import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;


public class teste_backpropagation extends javax.swing.JFrame{

static double [] pesos = new double[600];
static double [] backp = new double[600];

public static void main(String args[]){

grafico g = new grafico();
grafico gf;

backpropagation bck = new backpropagation();

bck.iteracao_III();
back = bck.teste_backpropagation(bck.v0, bck.v, bck.w0, bck.w);

JFrame.aplicacao = new JFrame();
aplicacao.getContentPane().setBackground (new Color (255, 255, 255));
aplicacao.setTitle("Redes neurais Artificiais");
aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
aplicacao.add(g);
aplicacao.setSize(500, 480);
aplicacao.setVisable(true);
}
   public double [] get_backp(){
    return backp;
  }
}

public class grafico extends JPanel{

static String mx, mn;
static double maximo, minimo, a, b, c, d, e, f, l, h, i, j, m;

double evidencia;
double []t = new double [300];
double []w = new double [300];
private double [] ff = new double [600];
private double [] fg = new double [600];

teste_backpropagation aa = new teste_backpropagation;

grafico () {} 

grafico (double [] shapes) {
ff = shapes;

}

public void paintComponent (Graphics g){
	super.paintComponent(g);

	minimo = 0;
	maximo = 1;
	passo = (maximo-minimo)/10;

	a = minimo;
	b = minimo + passo;
	c = minimo + 2passo;
	d = minimo + 3*passo;
	e = minimo + 4*passo;
	f = minimo + 5*passo;
	g = minimo + 6*passo;
	h = minimo + 7*passo;
	i = minimo + 8*passo;
	j = minimo + 9*passo;
	m = minimo + 10*passo;

	g.setColor(Color.lightGray);

	//linhas horizontais
	int p = 70; //p=80
	do{
		for (int i=0; i<320; i=i+20)
			g.drawLine(0,p,i,p);
		p=p+22;//20
		while(p<=340);
	//linhas verticais
	int q = 0;
	do{
	for(int i = 0; i<200; i=i+20)
	g.draLine(q,70,q,332);
	q = q+20;
}
	while (q<320);
		g.setColor(Color.red);
		g.drawString("*sinal 2 ", 60, 50);

		g.setColor(Color.blue);
		g.drawString("*sinal 2 ", 130, 50);


}
}
