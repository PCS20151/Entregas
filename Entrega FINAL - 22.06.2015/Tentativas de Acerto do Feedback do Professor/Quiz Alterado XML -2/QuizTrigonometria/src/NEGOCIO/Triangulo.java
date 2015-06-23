package NEGOCIO;
/*
 * @author Cesar Luis
 */
public class Triangulo {

    public int lado1 = 0;
    public int lado2 = 0;
    public int lado3 = 0;
    public double angulo1 = 0;
    public double angulo2 = 0;
    public double angulo3 = 0;
    int[] lados = new int[3];
    double[] angulos = new double[3];
    
    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public int getLado3() {
        return lado3;
    }
    
    public double getAngulo1() {
        return angulo1;
    }

    public double getAngulo2() {
        return angulo2;
    }
    
    public double getAngulo3() {
        return angulo3;
    }
    
    public void setLado1(int lado1) {
        this.lado1 = lado1;
        lados[0] = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
        lados[1] = lado2;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
        lados[2] = lado3;
    }


    public void setAngulo1(double angulo1) {
        this.angulo1 = angulo1;
        angulos[0] = angulo1;
    }

    public void setAngulo2(double angulo2) {
        this.angulo2 = angulo2;
        angulos[1] = angulo2;
    }

    public void setAngulo3(double angulo3) {
        this.angulo3 = angulo3;
        angulos[2] = angulo3;
    }

    public Triangulo() {
        boolean verificadorAngulos = true;
        boolean verificadorArea = true;
        while ((verificadorAngulos == true) || (verificadorArea == true)) {
            gerarTriangulo();
            gerarAngulos();
            getPerimetro();
            getArea();
            getLado3();
            verificadorAngulos = verificaAngulosNulos();
            verificadorArea = verificarAreaZerada();
        }
    }

    public int getLado(int lado) {
        return lados[lado-1];
    }

    public double getAngulo(int angulo) {
        return angulos[angulo-1];
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

    public boolean existriangulo(int lad1,int lad2, int lad3) {
        if (lad1 < lad2 + lad3 && lad2 < lad1 + lad3 && lad3 < lad1 + lad2) {
            return true;
        } else {
            return false;
        }
    }

    public int geraNrRandomico() {
        return (int) (Math.round(Math.random() * 10));
    }

    public int geraLado(int Ponto1, int Ponto2, int Ponto3, int Ponto4) {
        return (int) (Math.sqrt((Math.pow(Ponto1 - Ponto2, 2)) + (Math.pow(Ponto3 - Ponto4, 2))));
    }

    public void gerarTriangulo() {
        boolean existe = false;
        boolean EhTriangulo = false;
        while (existe == false) {
            int Ax = geraNrRandomico();
            int Ay = geraNrRandomico();
            int Bx = geraNrRandomico();
            int By = geraNrRandomico();
            int Cx = geraNrRandomico();
            int Cy = geraNrRandomico();
            int lado1x = geraLado(Bx, Ax, By, Ay);
            int lado2x = geraLado(Cx, Bx, Cy, By);
            int lado3x = geraLado(Cx, Ax, Cy, Ay);
            
            existe = existriangulo(lado1x, lado2x, lado3x);
            if (existe) {
                this.setLado1(lado1x);
                this.setLado2(lado2x);
                this.setLado3(lado3x);
            }
        }

    }

    public double RadianosparaGraus(double anguloRadiano) {
        return (Math.toDegrees(Math.acos(anguloRadiano)));
    }

    public double CalculadorAngulos(int lad1, int lad2, int lad3) {
        return ((Math.toRadians((Math.pow(lad1, 2)) / (((Math.pow(lad2, 2)) + (Math.pow(lad3, 2))) - (2 * (lad2 * lad3))))));
    }

    public void gerarAngulos() {
        double ang1 = CalculadorAngulos(lado1, lado2, lado3);
        double ang2 = CalculadorAngulos(lado2, lado1, lado3);
        setAngulo1(RadianosparaGraus(ang1));
        setAngulo2(RadianosparaGraus(ang2));
        angulo3 = (180 - (RadianosparaGraus(ang1) + RadianosparaGraus(ang2)));
        setAngulo3(angulo3);
    }

    public boolean verificaAngulosNulos() {
        boolean a = Double.isNaN(angulo1);
        boolean b = Double.isNaN(angulo2);
        boolean c = Double.isNaN(angulo3);
        return ((a || b) || c);
    }

    public boolean verificarAreaZerada() {
        if (this.getArea() >= 1) {
            return false;
        } else {
            return true;
        }
    }
}
