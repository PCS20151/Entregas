package NEGOCIO;

//criado por Cesar Luis Barbosa
public class Triangulo {

    public static int lado1 = 0;
    public static int lado2 = 0;
    public static int lado3 = 0;
    public static double angulo1 = 0;
    public static double angulo2 = 0;
    public static double angulo3 = 0;
    public static int perimetro = 0;
    public static double area = 0;

    public Triangulo() {
        boolean a = true;

        while (a == true) {
            gerarTriangulo();
            gerarAngulos();
            a = verificaGabErr();
        }
    }

    public int getLado(int lado) {
        switch (lado) {
            case 2:
                return lado2;
            case 3:
                return lado3;
        }
        return lado1;
    }

    public double getAngulo(int angulo) {
        switch (angulo) {
            case 2:
                return angulo2;
            case 3:
                return angulo3;
        }
        return angulo1;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public boolean existriangulo() {
        return (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2);

    }

    public void perimetro() {
        perimetro = lado1 + lado2 + lado3;

    }

    public void Area() {

        int p = perimetro / 2;
        double Aes = Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
        area = Aes;
    }

    public void gerarTriangulo() {
        boolean existe = false;
        while (existe == false) {
            int Ax = (int) (Math.round(Math.random() * 10));
            int Ay = (int) (Math.round(Math.random() * 10));
            int Bx = (int) (Math.round(Math.random() * 10));
            int By = (int) (Math.round(Math.random() * 10));
            int Cx = (int) (Math.round(Math.random() * 10));
            int Cy = (int) (Math.round(Math.random() * 10));

            double lado1a = Math.sqrt((Math.pow(Bx - Ax, 2)) + (Math.pow(By - Ay, 2)));
            double lado2a = Math.sqrt((Math.pow(Cx - Bx, 2)) + (Math.pow(Cy - By, 2)));
            double lado3a = Math.sqrt((Math.pow(Cx - Ax, 2)) + (Math.pow(Cy - Ay, 2)));

            int lado1x = (int) lado1a;
            int lado2x = (int) lado2a;
            int lado3x = (int) lado3a;

            boolean k = existriangulo();
            existe = k;

            if (existe) {
                lado1 = lado1x;
                lado2 = lado2x;
                lado3 = lado3x;
            }
        }

    }

    public void gerarAngulos() {
        double ang1 = (Math.toRadians((Math.pow(lado1, 2)) / (((Math.pow(lado2, 2)) + (Math.pow(lado3, 2))) - (2 * (lado2 * lado3)))));
        double ang2 = (Math.toRadians((Math.pow(lado2, 2)) / (((Math.pow(lado1, 2)) + (Math.pow(lado3, 2))) - (2 * (lado1 * lado3)))));
        angulo1 = Math.toDegrees(Math.acos(ang1));
        angulo2 = Math.toDegrees(Math.acos(ang2));
        angulo3 = (180 - (angulo1 + angulo2));
    }

    public boolean verificaGabErr() {
        boolean a = Double.isNaN(angulo1);
        boolean b = Double.isNaN(angulo2);
        boolean c = Double.isNaN(angulo3);
        return ((a || b) || c);
    }

}
