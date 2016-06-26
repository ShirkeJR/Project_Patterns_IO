package chainofrensponsibiliteio;

public class ChainOfRensponsibiliteIO {

    public static void main(String[] args) {
      AbstractMath loggerChain = getChainOfSymbols();
      loggerChain.Action(AbstractMath.add, 2, 3);
      loggerChain.Action(AbstractMath.substract, 2, 3);
      loggerChain.Action(AbstractMath.multiply, 2, 3);
    }
    
    private static AbstractMath getChainOfSymbols(){
      AbstractMath substracting = new Substracting(AbstractMath.substract);
      AbstractMath multiplying = new Multiplying(AbstractMath.multiply);
      AbstractMath adding = new Adding(AbstractMath.add);

      substracting.setNextSymbol(multiplying);
      multiplying.setNextSymbol(adding);

      return substracting;	
   }

}

abstract class AbstractMath {
   public static int add = 1;
   public static int substract = 2;
   public static int multiply = 3;

   protected int level;

   protected AbstractMath nextLogger;

   public void setNextSymbol(AbstractMath nextLogger){
      this.nextLogger = nextLogger;
   }

   public void Action(int level, int a, int b){
      if(this.level == level){
          System.out.println(count(a,b));
      }
      if(nextLogger !=null){
         nextLogger.Action(level, a, b);
      }
   }

   abstract protected int count(int a, int b);	
}

class Adding extends AbstractMath {

   public Adding(int level){
      this.level = level;
   }

   @Override
   protected int count(int a, int b) {		
      return a+b;
   }
}

class Substracting extends AbstractMath {

   public Substracting(int level){
      this.level = level;
   }

   @Override
   protected int count(int a, int b) {		
      return a-b;
   }
}

class Multiplying extends AbstractMath {

   public Multiplying(int level){
      this.level = level;
   }

   @Override
   protected int count(int a, int b) {		
      return a*b;
   }
}

