package LinkedList;

public class LinkedList {
//    �������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Node  first =new Node(1,"���ǵ�һ��node");
          Node  sec =new Node(2,"���ǵڶ���node");
		LinkededList linkededList =new LinkededList();
		linkededList.addreal(first);
		linkededList.addreal(sec);
		linkededList.showLinkedList();
	}

}
//�����������ѽڵ����������ʹ��Ϊһ������
class LinkededList{
//������������ͷ���
//	ͷ����ǲ������ݵ�
	Node head = new  Node(0, "");
	
//	�����ӵ�β���ķ�ʽ
	
	public void addreal(Node i){

		
//		��һ���ǲ���Ҫ���������������ӽ�㵽β��������Ϊnull
		
//		��ô�����ǲ���Ҫ��һ�������Ľ�㣬���ܱ�����β��
		
//		���ǲ��ܽ�ͷ�����������������ʹhead����λ�÷����仯
		Node temp =head;
		while(true){
			if(temp.next == null){
				break;
			}
			temp=temp.next;
		}
	    temp.next=i;
	}
	
//	��ʾ����
	public void showLinkedList(){
		Node temp =head;
//		��Ҫ�ж� �����Ƿ�Ϊ�գ��յĻ�������ִ��
		 if(temp.next==null){
			 return;
		 }
				
//		Ҫ��ʾ�����϶�Ҫ����	
		while(true){
			if(temp.next == null){
				break;
			}
			temp=temp.next;
			System.out.println(temp.toString());
		}
	}
	
}

//���������Ľڵ�
class Node{
	Node next;
	int id;
	String name;
	public Node(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "Node [" + " id=" + id + ", name=" + name + "]";
	}
	
//	Ϊ����ʾ������дtoString ����
	
}