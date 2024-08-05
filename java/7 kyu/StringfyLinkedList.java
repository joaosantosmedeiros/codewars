// https://www.codewars.com/kata/582c297e56373f0426000098
public class StringfyLinkedList {

    public static String stringify(Node list) {
      StringBuilder sb = new StringBuilder();
      while(list != null){
        sb.append(list.getData() + " -> ");
        list = list.getNext();
      } 
      return sb.append("null").toString();
    }
  }