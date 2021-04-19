import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class D07_HashMap {
	
	/*
	 	 # Map
	 	   - Key�� Value�� �� ���� �̷�� �ڷᱸ��
	 	   - Key���� ���� Value�� ������ �� �ִ�
	 	   - Key�� �ߺ��� ������� �ʴ´� 
	 */
	
	public static void main(String[] args) {
		HashMap<String, Integer> record = new HashMap<>();
		
		// ������ key ������ value
		// ������ ����ִ� ���� ������ �� ���� ����, ������ null�� ����
		record.put("ȫ�浿", 50000);
		record.put("��浿", 35000);
		record.put("�ڱ浿", 90000);
		Integer prvious_value = record.put("ȫ�浿", 3000); // �̹� �����ϴ� Ű���� put�ϸ� ���� ����
		
		System.out.println("������ ����ִ� �� : " + prvious_value);
		System.out.println("���� ����ִ� �� : " + record.get("ȫ�浿"));
		
		record.put("ȫ�浿", record.get("ȫ�浿") + 3000);
		
		System.out.println(record);
		
		// get(key) : key�� �̿��� value�� ����
		System.out.println(record.get("ȫ�浿"));
		
		HashMap<String, Object> person = new HashMap<>();
		
		person.put("�̸�", "ȫ�浿");
		person.put("����", 35);
		person.put("�����ϴ� �� ", new String[]{"���" , "���ڱ�", "�Ա�"});
		person.put("�Ⱦ��ϴ� ��", new HashSet<>());
		
		HashSet<String> dislike = ((HashSet)person.get("�Ⱦ��ϴ� ��"));
		
		dislike.add("�߱�");
		dislike.add("�ٸ鼺��");
		
		
	//	System.out.println(person.get("����"));
	//	System.out.println(((String[])person.get("�����ϴ� ��"))[0]);
		
	//	System.out.println(person.get("�Ⱦ��ϴ� ��"));
		
		/* 
		 	# �ݺ������� map�� Ȱ���ϱ�
			  - ketSet() : Ű��θ� �̷���� ���� ��ȯ�Ѵ�
			  - values() : value��θ� �̷���� ���� ��ȯ�Ѵ�
			  - entrySet() : Entry<key, value> �� �̷���� ���� ��ȯ�Ѵ�
		*/
		
		
		for(String key : person.keySet()) {
			Object value = person.get(key);
			
			// A instanceof B : A�� B�� �ν��Ͻ������� �Ǻ��Ѵ� ��ĳ���� ���¿����� �Ǻ��ȴ�
			if(value instanceof String[]) {
				System.out.print(": [");
				String[] arr = (String[]) value;
				for(int i = 0 ; i < arr.length; i++) {
					System.out.print(arr[i] + ", ");
				}
				System.out.println("]");
			} else {
			System.out.println(key+ " : " + value);
			}
		}
		
		// values()
		System.out.println("values : " + person.values());
		
		// entrySet()
		for(Entry<String, Object> entry : person.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println(key + "=" + value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}