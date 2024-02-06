// https://www.codewars.com/kata/55be95786abade3c71000079/train/java
class Node {

  int data;
  Node next = null;

  Node(final int data) {
    this.data = data;
  }

  public static Node push(final Node head, final int data) {
    var node = new Node(data);
    node.next = head;

    return node;
  }

  public static Node buildOneTwoThree() {
    return Node.push(Node.push(Node.push(null, 3), 2), 1);
  }
}