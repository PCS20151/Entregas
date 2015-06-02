//criado por Cesar Luis Barbosa
public class Triangulo{
	static int lado1 = 0;
	static int lado2 = 0;
	static int lado3 = 0;
	static double angulo1 = 0;
	static double angulo2 = 0;
	static double angulo3 = 0;
    
    
	public static boolean existriangulo (int iDab, int iDbc, int iDac)
	{
		if(iDab<iDbc+iDac && iDbc<iDab+iDac && iDac<iDab+iDbc)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int perimetro(int Dab, int Dbc, int Dac)
	{
		int soma;
		soma=Dab+Dbc+Dac;
		return soma;
	}
	
	public static double Area(double Dab, double Dbc, double Dac)
	{
		double p = ((Dab+Dbc+Dac)/2);
		double Aes = Math.sqrt(p*(p-Dab)*(p-Dbc)*(p-Dac));
		
		return Aes;
	}
	
	
	public static void gerarTriangulo(int lado1,int lado2, int lado3) {
		
		double Dab=0;
		double Dbc=0;
		double Dac=0;
		boolean existe = false;
		
		while(existe == false)
			{
				int Ax = (int)(Math.round(Math.random()* 10));
				int Ay = (int)(Math.round(Math.random()* 10));
				int Bx = (int)(Math.round(Math.random()* 10));
				int By = (int)(Math.round(Math.random()* 10));
				int Cx = (int)(Math.round(Math.random()* 10));
				int Cy = (int)(Math.round(Math.random()* 10));
				
				Dab = Math.sqrt((Math.pow(Bx-Ax, 2))+(Math.pow(By-Ay, 2)));
				Dbc = Math.sqrt((Math.pow(Cx-Bx, 2))+(Math.pow(Cy-By, 2)));
				Dac = Math.sqrt((Math.pow(Cx-Ax, 2))+(Math.pow(Cy-Ay, 2)));
			
				int iDab = (int) Dab;
				int iDbc = (int) Dbc;
				int iDac = (int) Dac;
				
				boolean k = Triangulo.existriangulo(iDab, iDbc, iDac);
				existe = k;
				
				if (existe){
					Triangulo.lado1 = iDab;
					Triangulo.lado2= iDbc;
					Triangulo.lado3=iDac;
				}	
			}
		
	}	

	public static void gerarAngulos(){
		double ang1 = (Math.toRadians((Math.pow(Triangulo.lado1,2))/(((Math.pow(Triangulo.lado2,2))+(Math.pow(Triangulo.lado3,2)))-(2 *(Triangulo.lado2 * Triangulo.lado3)))));
		double ang2 = (Math.toRadians((Math.pow(Triangulo.lado2,2))/(((Math.pow(Triangulo.lado1,2))+(Math.pow(Triangulo.lado3,2)))-(2 *(Triangulo.lado1 * Triangulo.lado3)))));
		Triangulo.angulo1 = Math.toDegrees(Math.acos(ang1));
		Triangulo.angulo2 = Math.toDegrees(Math.acos(ang2));
		Triangulo.angulo3 = (180 - (Triangulo.angulo1 + Triangulo.angulo2));
	} 
	
	public static boolean verificaGabErr(){
		boolean a = Double.isNaN(Triangulo.angulo1);
		boolean b = Double.isNaN(Triangulo.angulo2);
		boolean c = Double.isNaN(Triangulo.angulo3);
		if ((a || b) || c) {
			return true;
		}
		else return false;
		
	}

}