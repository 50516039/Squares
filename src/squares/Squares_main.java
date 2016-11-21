package squares;
import java.util.Scanner;
public class Squares_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x[] = {0.0,0.2,0.4,0.6,0.8};
		double y[] = {2.0,3.0,3.5,4.5,6.0};
		//Excelで求めた理論値：y = 4.75x + 1.9
		//実際に出た値:
		//99 : theta[0] = 1.9442279534137912
		//99 : theta[1] = 4.646979322923289
		double theta[] = new double[2];
		
		Squares_lib slib = new Squares_lib(x, y);
		
		for(int i = 0; i < 100; i++){
			theta = slib.getDx();
			System.out.println(i+" : theta[0] = "+theta[0]);
			System.out.println(i+" : theta[1] = "+theta[1]);
			System.out.println(i+" : Objective function = "+slib.getRx());
		}
		

	}

}
