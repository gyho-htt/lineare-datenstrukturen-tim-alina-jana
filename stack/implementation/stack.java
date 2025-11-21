public class Stack<ContentType> {
  
  
  public class StackNode {

    private ContentType content = null;
    private StackNode unterliegender = null;

    
    public StackNode(ContentType pContent) {
      content = pContent;
      unterliegender = null;
    }

  
    public void setUnterliegender(StackNode pNext) {
      unterliegender = pNext;
    }
    
 
    public StackNode getUnterliegender() {
      return unterliegender;
    }

  
    public ContentType getContent() {
      return content;
    }
    
  }
  

  
  private StackNode oberster;

 
  public Stack() {

    oberster = null;
  }


  public boolean isEmpty() {
    return oberster == null;
  }

  
   
  public void push(ContentType pContent) {
    if (pContent != null) {
      StackNode newNode = new StackNode(pContent);
      if (this.isEmpty()) {
        oberster = newNode;
      } else {
        newNode.setUnterliegender(oberster);
        oberster = newNode;
        } 
    }
  }

 
  public void pop() {
    if (!this.isEmpty()) {
      oberster = oberster.getUnterliegender();
    }
  }

  
  public ContentType top() {
    if (this.isEmpty()) {
      return null;
    } else {
      return oberster.getContent();
    }
  }
}
