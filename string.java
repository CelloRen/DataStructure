package pac;

public class string {
	public static void main(String[] args) {
		/**
         * �龰һ���ַ�����
         * JAVA�����(JVM)�д�����һ���ַ��������أ����б����źܶ�String����;
         * ���ҿ��Ա�����ʹ�ã�����������Ч�ʡ�
         * ����String����final�ģ�����ֵһ�������Ͳ��ɸı䡣
         * �ַ�������String��ά�������ǿ��Ե���intern()�����������ַ����ء� 
         */ 
	        System.out.println("---------------");
	        String s1 = "abc";    
	        //�� ���ַ����ش�����һ������ 
	        String s2 = "abc";    
	        //�� �ַ������������Ѿ����ڶ���abc��(����),���Դ���0�������ۼƴ���һ������ 
	        System.out.println("s1== s2 : "+(s1==s2));   
	        //�� true ָ��ͬһ������ 
	        System.out.println("s1.equals(s2): " + (s1.equals(s2)));   
	        //�� true ֵ���
	        
	        /**
	         * �龰��������new String("")
	         * 
	         */     
	        System.out.println("---------------");
	        String s3 = new String("abc"); 
	        //�� ��������������һ��������ַ������У�һ�����ڶ����У� //֮ǰs1����"abc"
	        //�� ����һ����������s3�����ջ�� 
	        String s4 = new String("abc"); 
	        //�� �ַ��������Ѿ����ڡ�abc����������ֻ�ڶ��д�����һ������ 
	        System.out.println("s3== s4 : "+(s3==s4)); 
	        //��false   s3��s4ջ�����õĵ�ַ��ͬ����������ĵ�ַ��ͬ�� 
	        System.out.println("s3.equals(s4): "+(s3.equals(s4))); 
	        //��true  s3��s4��ֵ��ͬ 
	        System.out.println("s1== s3 : "+(s1==s3)); 
	        //��false ��ŵĵ�����ͬ��һ���������У�һ������ 
	        System.out.println("s1.equals(s3): "+(s1.equals(s3))); 
	        //��true  ֵ��ͬ 
	        
	        /**
	         * �龰���� 
	         * ���ڳ�����ֵ�ڱ����ʱ��ͱ�ȷ��(�Ż�)�ˡ�
	         * �����"ab"��"cd"���ǳ�������˱���str1��ֵ�ڱ���ʱ�Ϳ���ȷ����
	         * ���д��������Ч����ͬ�ڣ� String str1 = "abcd";
	         */ 
	        System.out.println("---------------");
	        String str1 = "ab"+ "cd";  //1������ 
	        String str2 = "abcd"; 
	        System.out.println("str1= str2 : "+ (str1 == str2)); 
	        //�����õĳ�������ͬһ������ 
	        
	        
	        /**
	         * �龰�ģ�
	         *  �漰��str2�Ǳ�������ȫ�ǳ���������ӣ����Ի������µĶ������ڲ�ʵ
	         *  ������newһ��StringBuilder��Ȼ�� append(str2),append("c");Ȼ����
	         *  str3����toString()���صĶ���        
	         */  
	         System.out.println("---------------");
	         String str11 = "abc";        
	         String str22 = "ab";
	         String str33 = str22+"c";
	         System.out.println(str11==str33);  // false         

	         String str111 = "abc";        
	         final String str222 = "ab";
	         String str333 = str222+"c";
	         System.out.println(str111==str333);  // true
	         
	        /**
	         * �龰�壺
	         *  intern()�������Է��ظ��ַ����ڳ������еĶ��������
	         *   һ����ʼΪ�յ��ַ����أ������� String˽�е�ά���� ������ intern ����
	         *  ʱ��������Ѿ�����һ�����ڴ� String������ַ������� equals(Object) ��
	         *  ��ȷ�������򷵻س��е��ַ��������򣬽��� String������ӵ����У�������
	         *  �� String ��������á�    
	         */
	         System.out.println("---------------");
	         String str1111 = "abc";        
	         String str2222 = new String("abc").intern();        
	         System.out.println(str1111==str2222);   //true
	         
	         /**�龰����
	          * �����ǽ�str1��ֵ��Ϊ"bcd"ʱ��JVM�����ڳ�������û�д�Ÿ�ֵ�ĵ�ַ��
	          * �㿪���������ַ����������һ���µĶ������ַ�����ֵָ�������ַ��
	          * ��ʵ��String�౻��Ƴ�Ϊ���ɸı�(immutable)���ࡣ�����Ҫ�ı���ֵ��
	          * ���ԣ���JVM������ʱ������ֵ���Ĵ�����һ���¶���Ȼ����������
	          * ��ַ���ظ�ԭ��������á��������������˵����ȫ�Զ����еģ������Ͼ�
	          * ռ���˸����ʱ�䡣�ڶ�ʱ��Ҫ��Ƚ����еĻ����У������һ���Ĳ���Ӱ
	          * �졣
	          **/
	               System.out.println("---------------");
	               String str11111 = "abc";
	               String str22222 = "abc";
	               str11111 = "bcd";
	               System.out.println(str11111 + "," + str22222);  //bcd, abc     
	               System.out.println(str11111==str22222);  //false
	}
}
