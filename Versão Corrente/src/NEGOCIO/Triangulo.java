package NEGOCIO;
/**
 *
 * @author Bernardo Gouvêa e Cesar Luis
 */
public class Triangulo {

    public static int lado1 = 0;
    public static int lado2 = 0;
    public static int lado3 = 0;

    public int getLado3() {
        return lado3;
    }
    public static double angulo1 = 0;
    public static double angulo2 = 0;
    public static double angulo3 = 0;

    public double getAngulo3() {
        return angulo3;
    }
//    public static int perimetro = 0;
//    public static double area = 0;

    public Triangulo() {
        boolean a = true;
        boolean b = true;
        while ((a == true) || (b == true)) {
            gerarTriangulo();
            gerarAngulos();
            getPerimetro();
            getArea();
            getLado3();
            a = verificaGabErr();
            b = verificaArea();
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
        int perimetro = (lado1 + lado2 + lado3);
        return perimetro;
    }

    public int getArea() {
        int p = getPerimetro();
        p = p / 2;
        double Aes = Math.sqrt((p * (p - this.getLado(1)) * (p - this.getLado(2)) * (p - this.getLado(3))));
        return (int) Aes;
    }

    public boolean existriangulo() {
        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            return true;
        } else {
            return false;
        }
    }

    public void gerarTriangulo() {
        boolean existe = false;
        boolean k = false;
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
            if (lado1x < lado2x + lado3x && lado2x < lado1x + lado3x && lado3x < lado1x + lado2x) {
                k = true;
            } else {
                k = false;
            }
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

    public boolean verificaArea() {
        if (this.getArea() >= 1) {
            return false;
        } else {
            return true;
        }
    }
}
