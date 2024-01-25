
package strategyornek2;


public class StrategyOrnek2 {

  
    public static void main(String[] args) {
        
        MuzikCalar sarkilistesi = new MuzikCalar();
        sarkilistesi.setStrateji(new TekrarlıCalma());
        sarkilistesi.oynat();
        
        
    }
    
}