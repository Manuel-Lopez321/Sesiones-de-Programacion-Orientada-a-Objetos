package mx.utng.sesion4;
public class ContadorCaracteres {
    public boolean isVocal(char caracter){
        //Josué Alejandro Esparza Padilla
        return caracter == 'a' 
                        || caracter == 'e'
                        || caracter == 'i'
                        || caracter == 'o'
                        || caracter == 'u';
    }
    public boolean isConsonante(char caracter){
        short codigoAscii = (short) caracter;
        return (codigoAscii >=97 && codigoAscii<=122) && !isVocal(caracter);
    }
    public boolean isNumero(char caracter){
        short codigoAscii = (short) caracter;
        return (codigoAscii >= 48 && codigoAscii <= 57);
    }
    public boolean isSimbolo(char caracter){
        return !(isVocal(caracter)  || isNumero(caracter)
        || isConsonante(caracter));
    }
    public int cuentVocales(String palabra){
        int vocales = 0;
        for (char caracter : palabra.toLowerCase().toCharArray()){
            if(isVocal(caracter)){
                vocales++;
            }
        }
        return vocales;
    }
    public int cuentaConsonantes(String palabra){
        int consonante = 0;
        for(char caracter : palabra.toLowerCase().toCharArray()){
            if(isConsonante(caracter)){
                consonante++;
            }
        }
        return consonante;
    }
    public int cuentNumeros(String palabra){
        int numero = 0;
        for(char caracter : palabra.toLowerCase().toCharArray()){
            if(isNumero(caracter)){
                numero++;
            }
        }
        return numero;
    }
    public int cuentSimbolos(String palabra){
        int simbolo = 0;
        for(char caracter : palabra.toLowerCase().toCharArray()){
            if(isSimbolo(caracter)){
                simbolo++;
            }
        }
        return simbolo;
    }
}
