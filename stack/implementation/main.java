public class main{
  
  public static void main(String[] args) {
    Auto a1 = new Auto("a","b");
    Auto a2 = new Auto("c","d");
    Auto a3 = new Auto("e","f");
    Auto a4 = new Auto("g","h");
    
    Stack <Auto> stapel1 = new Stack<Auto>();
    
    System.out.println(stapel1.isEmpty());
    
    stapel1.push(a1);
    System.out.println(stapel1.top());
    stapel1.push(a2);
    
    System.out.println(stapel1.isEmpty());
    System.out.println(stapel1.top());
    stapel1.pop();
    System.out.println(stapel1.top());
  }




}