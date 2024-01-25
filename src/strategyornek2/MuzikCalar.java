
package strategyornek2;


public class MuzikCalar {
    private OynatmaStratejileri oynatmastratejisi;
    
    public void setStrateji(OynatmaStratejileri strateji)      
    {
       oynatmastratejisi = strateji; 
    }
    
    public void oynat()
    {
        oynatmastratejisi.oynat();
    }
    
}
