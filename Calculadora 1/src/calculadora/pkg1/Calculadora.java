
package calculadora.pkg1;

public class Calculadora {

    int x;
    int y;
    int r;

    void sumar() {

        r = x + y;
    }

    void restar() {

        if (x < y) {
            int a;
            a = x;
            x = y;
            y = a;
        }
        if (x < 0) {
            x = -x;
            y = -y;
        }
        r = x - y;
    }
    
    void dividir (){
        
        if (y==0){
            
            System.out.println("ERROR. NO SE PUEDE DIVIDIR ENTRE CERO");
            
        }
        
        r = x / y;
        
    }
    
    void multiplicar (){
        
        r = x*y;
    }

}
