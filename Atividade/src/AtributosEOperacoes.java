

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class AtributosEOperacoes {

    private float a;
    private float b;
    private float c;
    private float X1;
    private float X2;
    private  float Delta;
    private int numeroRaizes;


    public int getNumeroRaizes() {
        return numeroRaizes;
    }

    public void setNumeroRaizes(int numeroRaizes) {
        this.numeroRaizes = numeroRaizes;
    }

    public float getDelta() {
        return Delta;
    }

    public void setDelta(float delta) {
        Delta = delta;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getX1() {
        return X1;
    }

    public void setX1(float x1) {
        X1 = x1;
    }

    public float getX2() {
        return X2;
    }

    public void setX2(float x2) {
        X2 = x2;
    }

    //método para achar o delta
    public void AchandoDiscriminante(){

        setDelta((float) ((pow(getB(),2))-((4*getA())*getC())));

    }

    //método para calcular fórmula de bhaskara
    public void FormulaBhaskara(){

        setX1((float) ((-getB()+sqrt(getDelta()))/2*getA()));
        setX2((float) ((-getB()-sqrt(getDelta()))/2*getA()));
    }

    //método para achar as raízes da equação de segundo grau
    public void EstudoRaizes() throws  NaoAdmiteSolucaoRealException{

        try {
            if(getDelta()==0)
            {
                setNumeroRaizes(1);
                System.out.println("Possui "+getNumeroRaizes()+" raíz real!");
            }
            else if(getDelta()>0)
            {
                setNumeroRaizes(2);
                System.out.println("Possui "+getNumeroRaizes()+" raízes reais!");

            }else if (getDelta()<0){
                throw new NaoAdmiteSolucaoRealException();
            }

        }catch (NaoAdmiteSolucaoRealException e){
            setNumeroRaizes(0);
            System.out.println(e.getMessage());

        }
    }

    //inner class que irá criar um novo tipo de Exception
    public static class NaoAdmiteSolucaoRealException extends RuntimeException{

        private static final long serialVersionUID = 1149241039409861914L;
        public NaoAdmiteSolucaoRealException(){
                super("[Erro de Exceção!NÃO admite solução real, pois NÃO existem raízes reais!]");
        }
    }
}
