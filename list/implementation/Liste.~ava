public class Liste <ContentType>{
  
  public class Node{
  
    private ContentType content = null;
    private Node nachfolger = null;
    private Node vorgänger = null;
    
    public Node(ContentType pContent){
      this.content = pContent;
    }
          
          
    public void setNachfolger(Node pNext) {
      this.nachfolger = pNext;
    }
    
 
    public Node getNachfolger() {
      return nachfolger;
    }

  
    public void setVorgänger(Node pNext) {
      this.vorgänger = pNext;
    }
    
 
    public Node getVorgänger() {
      return vorgänger;
    }
    
    
    public ContentType getContent() {
      return content;
    }
  
    public void setContent(ContentType pContent) {
      this.content = pContent;
    }
  }
  
  private Node erstes;
  private Node letztes;
  private Node aktuelles;
  
  public Liste() {
    
  }
  
   public boolean isEmpty() {
    return erstes == null;
  }
  
  public boolean hasAccess(){
    return aktuelles != null;
  }

  public void next (){
    if(!isEmpty() && hasAccess() && aktuelles != letztes){
      
      aktuelles = aktuelles.getNachfolger();
        
    }
    else{
      aktuelles = null;
    }
  }
    
    public void toFirst(){
    if(!isEmpty()){
      aktuelles = erstes;
    }
  }

  public void toLast(){
    if(!isEmpty()){
      aktuelles = letztes;
    }
  }

  public ContentType getContent (){
     if(hasAccess()){
      return aktuelles.getContent(); 
     }
    else {
      return null;
    } 
  }

  public void setContent(ContentType pContent){
    if(hasAccess() && pContent != null){
      aktuelles.setContent(pContent);
      }
    }  

  public void append(ContentType pContent){
    if(pContent != null){
      Node newNode = new Node(pContent);
      if(isEmpty()){
         erstes = newNode;
      }
      else {
        newNode.setVorgänger(letztes);
      } 
      
      letztes.setNachfolger(newNode);
      letztes = newNode;
      }
    }
  
  public void insert(ContentType pContent){
    if(hasAccess() && !isEmpty()){  
      Node newNode = new Node(pContent);
      aktuelles.getVorgänger().setNachfolger(newNode);
      newNode.setVorgänger(aktuelles.getVorgänger());
      newNode.setNachfolger(aktuelles);
      aktuelles.setVorgänger(newNode);
      }
    else{
      append(pContent);
      }  
    }  
}