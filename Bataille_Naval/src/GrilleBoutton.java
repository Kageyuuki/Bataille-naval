
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
//instruction a faire dans l ordre ligne 41 puis 188 et enfin 235
public class GrilleBoutton extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//////////////////// Label //////////////////////////////
	
	//Label Horizontal
	private JLabel h_a;
	private JLabel h_b;
	private JLabel h_c;
	private JLabel h_d;
	private JLabel h_e;
	private JLabel h_f;
	private JLabel h_g;
	private JLabel h_h;
	private JLabel h_i;
	private JLabel h_j;
	
	//Label vertical
	private JLabel v_0;
	private JLabel v_1;
	private JLabel v_2;
	private JLabel v_3;
	private JLabel v_4;
	private JLabel v_5;
	private JLabel v_6;
	private JLabel v_7;
	private JLabel v_8;
	private JLabel v_9;
	private JLabel v_10;
	
////////////////////Boutton////////////////////////////
	//Colonne a
	private CaseBoutton a_1; // Faire de meme pour tout les autres JButton en remplacant le type JButton par case
	private CaseBoutton a_2;
	private CaseBoutton a_3;
	private CaseBoutton a_4;
	private CaseBoutton a_5;
	private CaseBoutton a_6;
	private CaseBoutton a_7;
	private CaseBoutton a_8;
	private CaseBoutton a_9;
	private CaseBoutton a_10;
	
	//Colonne b
	private CaseBoutton b_1;
	private CaseBoutton b_2;
	private CaseBoutton b_3;
	private CaseBoutton b_4;
	private CaseBoutton b_5;
	private CaseBoutton b_6;
	private CaseBoutton b_7;
	private CaseBoutton b_8;
	private CaseBoutton b_9;
	private CaseBoutton b_10;
	
	//Colonne c
	private CaseBoutton c_1;
	private CaseBoutton c_2;
	private CaseBoutton c_3;
	private CaseBoutton c_4;
	private CaseBoutton c_5;
	private CaseBoutton c_6;
	private CaseBoutton c_7;
	private CaseBoutton c_8;
	private CaseBoutton c_9;
	private CaseBoutton c_10;
	
	//Colonne d
	private CaseBoutton d_1;
	private CaseBoutton d_2;
	private CaseBoutton d_3;
	private CaseBoutton d_4;
	private CaseBoutton d_5;
	private CaseBoutton d_6;
	private CaseBoutton d_7;
	private CaseBoutton d_8;
	private CaseBoutton d_9;
	private CaseBoutton d_10;
	
	//Colonne e
	private CaseBoutton e_1;
	private CaseBoutton e_2;
	private CaseBoutton e_3;
	private CaseBoutton e_4;
	private CaseBoutton e_5;
	private CaseBoutton e_6;
	private CaseBoutton e_7;
	private CaseBoutton e_8;
	private CaseBoutton e_9;
	private CaseBoutton e_10;
	
	//Colonne f
	private CaseBoutton f_1;
	private CaseBoutton f_2;
	private CaseBoutton f_3;
	private CaseBoutton f_4;
	private CaseBoutton f_5;
	private CaseBoutton f_6;
	private CaseBoutton f_7;
	private CaseBoutton f_8;
	private CaseBoutton f_9;
	private CaseBoutton f_10;
	
	//Colonne g
	private CaseBoutton g_1;
	private CaseBoutton g_2;
	private CaseBoutton g_3;
	private CaseBoutton g_4;
	private CaseBoutton g_5;
	private CaseBoutton g_6;
	private CaseBoutton g_7;
	private CaseBoutton g_8;
	private CaseBoutton g_9;
	private CaseBoutton g_10;
	
	//Colonne h
	private CaseBoutton h_1;
	private CaseBoutton h_2;
	private CaseBoutton h_3;
	private CaseBoutton h_4;
	private CaseBoutton h_5;
	private CaseBoutton h_6;
	private CaseBoutton h_7;
	private CaseBoutton h_8;
	private CaseBoutton h_9;
	private CaseBoutton h_10;
	
	//Colonne i
	private CaseBoutton i_1;
	private CaseBoutton i_2;
	private CaseBoutton i_3;
	private CaseBoutton i_4;
	private CaseBoutton i_5;
	private CaseBoutton i_6;
	private CaseBoutton i_7;
	private CaseBoutton i_8;
	private CaseBoutton i_9;
	private CaseBoutton i_10;
	
	//Colonne j
	private CaseBoutton j_1;
	private CaseBoutton j_2;
	private CaseBoutton j_3;
	private CaseBoutton j_4;
	private CaseBoutton j_5;
	private CaseBoutton j_6;
	private CaseBoutton j_7;
	private CaseBoutton j_8;
	private CaseBoutton j_9;
	private CaseBoutton j_10;
	
	
	//
	private ArrayList<CaseBoutton> listeBoutton;
	
//////////////////////////// Constructeur //////////////////////////////
	
	public GrilleBoutton() {
		
		//Instantiation de la premiere horizontale
		this.h_a = new JLabel("a");
		this.h_b = new JLabel("b");
		this.h_c = new JLabel("c");
		this.h_d = new JLabel("d");
		this.h_e = new JLabel("e");
		this.h_f = new JLabel("f");
		this.h_g = new JLabel("g");
		this.h_h = new JLabel("h");
		this.h_i = new JLabel("i");
		this.h_j = new JLabel("j");
		
		//Instantiation de la premiere Verticale
		this.v_0 = new JLabel("");
		this.v_1 = new JLabel("1");
		this.v_2 = new JLabel("2");
		this.v_3 = new JLabel("3");
		this.v_4 = new JLabel("4");
		this.v_5 = new JLabel("5");
		this.v_6 = new JLabel("6");
		this.v_7 = new JLabel("7");
		this.v_8 = new JLabel("8");
		this.v_9 = new JLabel("9");
		this.v_10 = new JLabel("10");
		
		//Instantiation Boutton colonne a
		this.a_1 = new CaseBoutton(1, 1);
		this.listeBoutton.add(a_1);
		this.a_2 = new CaseBoutton(1, 2);
		this.listeBoutton.add(a_2);
		this.a_3 = new CaseBoutton(1, 3);
		this.listeBoutton.add(a_3);
		this.a_4 = new CaseBoutton(1, 4);
		this.listeBoutton.add(a_4);
		this.a_5 = new CaseBoutton(1, 5);
		this.listeBoutton.add(a_5);
		this.a_6 = new CaseBoutton(1, 6);
		this.listeBoutton.add(a_6);
		this.a_7 = new CaseBoutton(1, 7);
		this.listeBoutton.add(a_7);
		this.a_8 = new CaseBoutton(1, 8);
		this.listeBoutton.add(a_8);
		this.a_9 = new CaseBoutton(1, 9);
		this.listeBoutton.add(a_9);
		this.a_10 = new CaseBoutton(1, 10);
		this.listeBoutton.add(a_10);
		
		//Instantiation Boutton colonne b
		this.b_1 = new CaseBoutton(2, 1);
		this.listeBoutton.add(b_1);
		this.b_2 = new CaseBoutton(2, 2);
		this.listeBoutton.add(b_2);
		this.b_3 = new CaseBoutton(2, 3);
		this.listeBoutton.add(b_3);
		this.b_4 = new CaseBoutton(2, 4);	
		this.listeBoutton.add(b_4);
		this.b_5 = new CaseBoutton(2, 5);
		this.listeBoutton.add(b_5);
		this.b_6 = new CaseBoutton(2, 6);
		this.listeBoutton.add(b_6);
		this.b_7 = new CaseBoutton(2, 7);
		this.listeBoutton.add(b_7);
		this.b_8 = new CaseBoutton(2, 8);
		this.listeBoutton.add(b_8);
		this.b_9 = new CaseBoutton(2, 9);
		this.listeBoutton.add(b_9);
		this.b_10 = new CaseBoutton(2, 10);
		this.listeBoutton.add(b_10);
		
		//Instantiation Boutton colonne c
		this.c_1 = new CaseBoutton(3, 1);
		this.listeBoutton.add(c_1);
		this.c_2 = new CaseBoutton(3, 2);
		this.listeBoutton.add(c_2);
		this.c_3 = new CaseBoutton(3, 3);
		this.listeBoutton.add(c_3);
		this.c_4 = new CaseBoutton(3, 4);
		this.listeBoutton.add(c_4);
		this.c_5 = new CaseBoutton(3, 5);
		this.listeBoutton.add(c_5);
		this.c_6 = new CaseBoutton(3, 6);
		this.listeBoutton.add(c_6);
		this.c_7 = new CaseBoutton(3, 7);
		this.listeBoutton.add(c_7);
		this.c_8 = new CaseBoutton(3, 8);
		this.listeBoutton.add(c_8);
		this.c_9 = new CaseBoutton(3, 9);
		this.listeBoutton.add(c_9);
		this.c_10 = new CaseBoutton(3, 10);
		this.listeBoutton.add(c_10);
		
		//Instantiation Boutton colonne d
		this.d_1 = new CaseBoutton(4, 1);
		this.listeBoutton.add(d_1);
		this.d_2 = new CaseBoutton(4, 2);
		this.listeBoutton.add(d_2);
		this.d_3 = new CaseBoutton(4, 3);
		this.listeBoutton.add(d_3);
		this.d_4 = new CaseBoutton(4, 4);
		this.listeBoutton.add(d_4);
		this.d_5 = new CaseBoutton(4, 5);
		this.listeBoutton.add(d_5);
		this.d_6 = new CaseBoutton(4, 6);
		this.listeBoutton.add(d_6);
		this.d_7 = new CaseBoutton(4, 7);
		this.listeBoutton.add(d_7);
		this.d_8 = new CaseBoutton(4, 8);
		this.listeBoutton.add(d_8);
		this.d_9 = new CaseBoutton(4, 9);
		this.listeBoutton.add(d_9);
		this.d_10 = new CaseBoutton(4, 10);
		this.listeBoutton.add(d_10);
		
		//Instantiation Boutton colonne e
		this.e_1 = new CaseBoutton(5, 1);
		this.listeBoutton.add(e_1);
		this.e_2 = new CaseBoutton(5, 2);
		this.listeBoutton.add(e_2);
		this.e_3 = new CaseBoutton(5, 3);
		this.listeBoutton.add(e_3);
		this.e_4 = new CaseBoutton(5, 4);
		this.listeBoutton.add(e_4);
		this.e_5 = new CaseBoutton(5, 5);
		this.listeBoutton.add(e_5);
		this.e_6 = new CaseBoutton(5, 6);
		this.listeBoutton.add(e_6);
		this.e_7 = new CaseBoutton(5, 7);
		this.listeBoutton.add(e_7);
		this.e_8 = new CaseBoutton(5, 8);
		this.listeBoutton.add(e_8);
		this.e_9 = new CaseBoutton(5, 9);
		this.listeBoutton.add(e_9);
		this.e_10 = new CaseBoutton(5, 10);
		this.listeBoutton.add(e_10);
		
		//Instantiation Boutton colonne f
		this.f_1 = new CaseBoutton(6, 1);
		this.f_2 = new CaseBoutton(6, 2);
		this.f_3 = new CaseBoutton(6, 3);
		this.f_4 = new CaseBoutton(6, 4);
		this.f_5 = new CaseBoutton(6, 5);
		this.f_6 = new CaseBoutton(6, 6);
		this.f_7 = new CaseBoutton(6, 7);
		this.f_8 = new CaseBoutton(6, 8);		
		this.f_9 = new CaseBoutton(6, 9);
		this.f_10 = new CaseBoutton(6, 10);
		
		//Instantiation Boutton colonne g
		this.g_1 = new CaseBoutton(7, 1);
		this.g_2 = new CaseBoutton(7, 2);
		this.g_3 = new CaseBoutton(7, 3);
		this.g_4 = new CaseBoutton(7, 4);
		this.g_5 = new CaseBoutton(7, 5);
		this.g_6 = new CaseBoutton(7, 6);
		this.g_7 = new CaseBoutton(7, 7);
		this.g_8 = new CaseBoutton(7, 8);
		this.g_9 = new CaseBoutton(7, 9);
		this.g_10 = new CaseBoutton(7, 10);
		
		//Instantiation Boutton colonne h
		this.h_1 = new CaseBoutton(8, 1);
		this.h_2 = new CaseBoutton(8, 2);
		this.h_3 = new CaseBoutton(8, 3);
		this.h_4 = new CaseBoutton(8, 4);
		this.h_5 = new CaseBoutton(8, 5);		
		this.h_6 = new CaseBoutton(8, 6);
		this.h_7 = new CaseBoutton(8, 7);
		this.h_8 = new CaseBoutton(8, 8);
		this.h_9 = new CaseBoutton(8, 9);
		this.h_10 = new CaseBoutton(8, 10);
		
		//Instantiation Boutton colonne i
		this.i_1 = new CaseBoutton(9, 1);
		this.i_2 = new CaseBoutton(9, 2);
		this.i_3 = new CaseBoutton(9, 3);
		this.i_4 = new CaseBoutton(9, 4);
		this.i_5 = new CaseBoutton(9, 5);
		this.i_6 = new CaseBoutton(9, 6);
		this.i_7 = new CaseBoutton(9, 7);
		this.i_8 = new CaseBoutton(9, 8);
		this.i_9 = new CaseBoutton(9, 9);
		this.i_10 = new CaseBoutton(9, 10);
		
		//Instantiation Boutton colonne j
		this.j_1 = new CaseBoutton(10, 1);
		this.j_2 = new CaseBoutton(10, 2);
		this.j_3 = new CaseBoutton(10, 3);
		this.j_4 = new CaseBoutton(10, 4);
		this.j_5 = new CaseBoutton(10, 5);
		this.j_6 = new CaseBoutton(10, 6);
		this.j_7 = new CaseBoutton(10, 7);
		this.j_8 = new CaseBoutton(10, 8);
		this.j_9 = new CaseBoutton(10, 9);
		this.j_10 = new CaseBoutton(10, 10);
		
		
		//Declaration du layout
		this.setLayout(new GridLayout(11,11));
		
		//Ligne 1
		this.add(v_0);
		this.add(h_a);
		this.add(h_b);
		this.add(h_c);
		this.add(h_d);
		this.add(h_e);
		this.add(h_f);
		this.add(h_g);
		this.add(h_h);
		this.add(h_i);
		this.add(h_j);
		
		//Ligne 2
		this.add(v_1);
		this.add(a_1.getBoutton()); //ajouter .getBoutton() pour les add des variables ne commencant pas par v_* 
		this.add(b_1.getBoutton());
		this.add(c_1.getBoutton());
		this.add(d_1.getBoutton());
		this.add(e_1.getBoutton());
		this.add(f_1.getBoutton());
		this.add(g_1.getBoutton());
		this.add(h_1.getBoutton());
		this.add(i_1.getBoutton());
		this.add(j_1.getBoutton());
		
		//Ligne 3
		this.add(v_2);
		this.add(a_2.getBoutton());
		this.add(b_2.getBoutton());
		this.add(c_2.getBoutton());
		this.add(d_2.getBoutton());
		this.add(e_2.getBoutton());
		this.add(f_2.getBoutton());
		this.add(g_2.getBoutton());
		this.add(h_2.getBoutton());
		this.add(i_2.getBoutton());
		this.add(j_2.getBoutton());
		
		//Ligne 4
		this.add(v_3);
		this.add(a_3.getBoutton());
		this.add(b_3.getBoutton());
		this.add(c_3.getBoutton());
		this.add(d_3.getBoutton());
		this.add(e_3.getBoutton());
		this.add(f_3.getBoutton());
		this.add(g_3.getBoutton());
		this.add(h_3.getBoutton());
		this.add(i_3.getBoutton());
		this.add(j_3.getBoutton());
		
		//Ligne 5
		this.add(v_4);
		this.add(a_4.getBoutton());
		this.add(b_4.getBoutton());
		this.add(c_4.getBoutton());
		this.add(d_4.getBoutton());
		this.add(e_4.getBoutton());
		this.add(f_4.getBoutton());
		this.add(g_4.getBoutton());
		this.add(h_4.getBoutton());
		this.add(i_4.getBoutton());
		this.add(j_4.getBoutton());
		
		//Ligne 6
		this.add(v_5);
		this.add(a_5.getBoutton());
		this.add(b_5.getBoutton());
		this.add(c_5.getBoutton());
		this.add(d_5.getBoutton());
		this.add(e_5.getBoutton());
		this.add(f_5.getBoutton());
		this.add(g_5.getBoutton());
		this.add(h_5.getBoutton());
		this.add(i_5.getBoutton());
		this.add(j_5.getBoutton());
		
		//Ligne 7
		this.add(v_6);
		this.add(a_6.getBoutton());
		this.add(b_6.getBoutton());
		this.add(c_6.getBoutton());
		this.add(d_6.getBoutton());
		this.add(e_6.getBoutton());
		this.add(f_6.getBoutton());
		this.add(g_6.getBoutton());
		this.add(h_6.getBoutton());
		this.add(i_6.getBoutton());
		this.add(j_6.getBoutton());
		
		//Ligne 8
		this.add(v_7);
		this.add(a_7.getBoutton());
		this.add(b_7.getBoutton());
		this.add(c_7.getBoutton());
		this.add(d_7.getBoutton());
		this.add(e_7.getBoutton());
		this.add(f_7.getBoutton());
		this.add(g_7.getBoutton());
		this.add(h_7.getBoutton());
		this.add(i_7.getBoutton());
		this.add(j_7.getBoutton());
		
		//Ligne 9
		this.add(v_8);
		this.add(a_8.getBoutton());
		this.add(b_8.getBoutton());
		this.add(c_8.getBoutton());
		this.add(d_8.getBoutton());
		this.add(e_8.getBoutton());
		this.add(f_8.getBoutton());
		this.add(g_8.getBoutton());
		this.add(h_8.getBoutton());
		this.add(i_8.getBoutton());
		this.add(j_8.getBoutton());
		
		//Ligne 10
		this.add(v_9);
		this.add(a_9.getBoutton());
		this.add(b_9.getBoutton());
		this.add(c_9.getBoutton());
		this.add(d_9.getBoutton());
		this.add(e_9.getBoutton());
		this.add(f_9.getBoutton());
		this.add(g_9.getBoutton());
		this.add(h_9.getBoutton());
		this.add(i_9.getBoutton());
		this.add(j_9.getBoutton());
		
		//Ligne 11
		this.add(v_10);
		this.add(a_10.getBoutton());		
		this.add(b_10.getBoutton());
		this.add(c_10.getBoutton());
		this.add(d_10.getBoutton());
		this.add(e_10.getBoutton());
		this.add(f_10.getBoutton());
		this.add(g_10.getBoutton());
		this.add(h_10.getBoutton());
		this.add(i_10.getBoutton());
		this.add(j_10.getBoutton());

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}	
}
