package assignments;
import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;

public class queueusingstack {
	static Node top;
	static Node top1;
	static class Node {
		int data;
		Node next;
		Node(int d) {
			data=d;
			next=null;
		}
	}
	public queueusingstack() {
		top=null;
		top1=null;
	}
	public void push(int d) {
		Node newNode=new Node(d);
		top=newNode;
	}
	public void push1(int d) {
		Node newNode=new Node(d);
		top1=newNode;
	}
	public void pop() {
		Node temp=top;
		while(temp!=null) {
			push1(temp.data);
			temp=temp.next;
		}
	}
	public void display() {
		Node temp=top;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String arg[]) {
		queueusingstack qe = new queueusingstack();
		Scanner sc=new Scanner(System.in);
		qe.push(10);
		qe.push(20);
		qe.push(30);
		qe.push(40);
		qe.push(50);
		qe.pop();
		qe.display();

	}
}
