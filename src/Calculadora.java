
public class Calculadora {

	public Integer somar(Integer a, Integer b){
		return a + b;
	}

	public Integer multiplicar(Integer a, Integer b) {
		return a * b;
	}

	public Integer subtrair(Integer a, Integer b) {
		return b - a;
	}
	
	public Integer dividir(Integer a, Integer b){
		return a / b;
	}


//fazendo exponencial

Scanner ent = new Scanner(System.in);
       int base, pot;
       int res = 1;
              
        do{
            System.out.println("Digite a base");
            base = ent.nextInt();
            
            if(base != 0){
                System.out.println("Digite a potencia");
                pot = ent.nextInt();
        
                do{
                    res = res * base;
                    pot--;    
                }while(pot > 0);
        
                System.out.println(res);
                res = 1;
            }
        }while((base != 0));
        System.out.println("Você digitou base = 0. O programa foi finalizado.");
    }
	

}
