package pac;

public class string {
	public static void main(String[] args) {
		/**
         * 情景一：字符串池
         * JAVA虚拟机(JVM)中存在着一个字符串常量池，其中保存着很多String对象;
         * 并且可以被共享使用，因此它提高了效率。
         * 由于String类是final的，它的值一经创建就不可改变。
         * 字符串池由String类维护，我们可以调用intern()方法来访问字符串池。 
         */ 
	        System.out.println("---------------");
	        String s1 = "abc";    
	        //↑ 在字符串池创建了一个对象 
	        String s2 = "abc";    
	        //↑ 字符串常量池中已经存在对象“abc”(共享),所以创建0个对象，累计创建一个对象 
	        System.out.println("s1== s2 : "+(s1==s2));   
	        //↑ true 指向同一个对象， 
	        System.out.println("s1.equals(s2): " + (s1.equals(s2)));   
	        //↑ true 值相等
	        
	        /**
	         * 情景二：关于new String("")
	         * 
	         */     
	        System.out.println("---------------");
	        String s3 = new String("abc"); 
	        //↑ 创建了两个对象，一个存放在字符串池中，一个存在堆区中； //之前s1创建"abc"
	        //↑ 还有一个对象引用s3存放在栈中 
	        String s4 = new String("abc"); 
	        //↑ 字符串池中已经存在“abc”对象，所以只在堆中创建了一个对象 
	        System.out.println("s3== s4 : "+(s3==s4)); 
	        //↑false   s3和s4栈区引用的地址不同，堆区对象的地址不同； 
	        System.out.println("s3.equals(s4): "+(s3.equals(s4))); 
	        //↑true  s3和s4的值相同 
	        System.out.println("s1== s3 : "+(s1==s3)); 
	        //↑false 存放的地区不同，一个常量池中，一个堆区 
	        System.out.println("s1.equals(s3): "+(s1.equals(s3))); 
	        //↑true  值相同 
	        
	        /**
	         * 情景三： 
	         * 由于常量的值在编译的时候就被确定(优化)了。
	         * 在这里，"ab"和"cd"都是常量，因此变量str1的值在编译时就可以确定。
	         * 这行代码编译后的效果等同于： String str1 = "abcd";
	         */ 
	        System.out.println("---------------");
	        String str1 = "ab"+ "cd";  //1个对象 
	        String str2 = "abcd"; 
	        System.out.println("str1= str2 : "+ (str1 == str2)); 
	        //↑引用的常量池中同一个对象 
	        
	        
	        /**
	         * 情景四：
	         *  涉及到str2是变量（不全是常量）的相加，所以会生成新的对象，其内部实
	         *  现是先new一个StringBuilder，然后 append(str2),append("c");然后让
	         *  str3引用toString()返回的对象        
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
	         * 情景五：
	         *  intern()方法可以返回该字符串在常量池中的对象的引用
	         *   一个初始为空的字符串池，它由类 String私有地维护。 当调用 intern 方法
	         *  时，如果池已经包含一个等于此 String对象的字符串（用 equals(Object) 方
	         *  法确定），则返回池中的字符串。否则，将此 String对象添加到池中，并返回
	         *  此 String 对象的引用。    
	         */
	         System.out.println("---------------");
	         String str1111 = "abc";        
	         String str2222 = new String("abc").intern();        
	         System.out.println(str1111==str2222);   //true
	         
	         /**情景六：
	          * 当我们将str1的值改为"bcd"时，JVM发现在常量池中没有存放该值的地址，
	          * 便开辟了这个地址，并创建了一个新的对象，其字符串的值指向这个地址。
	          * 事实上String类被设计成为不可改变(immutable)的类。如果你要改变其值，
	          * 可以，但JVM在运行时根据新值悄悄创建了一个新对象，然后将这个对象的
	          * 地址返回给原来类的引用。这个创建过程虽说是完全自动进行的，但它毕竟
	          * 占用了更多的时间。在对时间要求比较敏感的环境中，会带有一定的不良影
	          * 响。
	          **/
	               System.out.println("---------------");
	               String str11111 = "abc";
	               String str22222 = "abc";
	               str11111 = "bcd";
	               System.out.println(str11111 + "," + str22222);  //bcd, abc     
	               System.out.println(str11111==str22222);  //false
	}
}
