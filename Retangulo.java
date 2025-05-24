package juliaericalista;

public class Retangulo {
    
    double largura;
    double altura;
    
    Retangulo ( double altura, double largura){
        
        this.altura = altura;
        this.largura = largura;
    }
    
    double calcularArea (){
        
        return largura * altura; 
    }
    
    double calcularPerimetro (){
        
        return 2 * largura + 2 * altura;
    }
}
