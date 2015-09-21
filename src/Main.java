import java.util.*;

 class Person {
    int i;
    Person(int i){
      this.i=i;
    }
    int getI(){
        return i;
    }
}
public class Main {
    final String str="hello,world";
        int  i;

    {
        i = 3;
       // System.out.println("first");
    }

//     final Person person=new Person(2);
//    public void  change(){
//         //="123";
//        // str="123";
//         person.i=3;
//         i=4;
//        System.out.println(person.i+"**");
//     }
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        String a="123";
//        String c="1234";
//        String b=a+"4";
//        System.out.println(new Main().person.i);
//        System.out.println(c==b);

         Main a =new Main();
        System.out.println(a.i);
       /**
         * test shalldow copy
         */
        HashMap<Integer,Person> map1 = new HashMap<Integer,Person>();
        map1.put(1, new Person(1));
        HashMap b =(HashMap)map1.clone();
          b.put(1,new Person(3));
          map1.get(1).i=2;
//        b.put(null,null);
        System.out.println("test: " + map1 + " " + b);
        Map<String,String> nullmap = new HashMap<String,String>();
        nullmap.put(null, "abc");
        System.out.println(nullmap.get(null));
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
        System.out.println(list.get(0)+list.get(1)+list.get(2));
        System.out.println();
        /**
         * test equals && ==
         */
        String s1="abc"+"def"+"";
        String s2="abc"+"d"+new String("ef");
        String s4="abcd";
        String s3=s4+"ef";
        String s5="abcdef";
        if(s1.equals(s2))
            System.out.println("equals");
        if(s1==s5)
            System.out.println("==");

        System.out.println(s1.hashCode()+" "+s2.hashCode());
       // System.out.println(50);
        /**
         * test ! 0的个数
         */
        long sum=1;
        for (int i = 1; i < 11; i++) {
            sum*=i;

        }
        System.out.println("50!:"+sum);
        /**
         * test null reference
         */
        int [] nullref=new int[2];
        System.out.println(Arrays.toString(nullref));
        /**
         * test final  ,局部变量必须在使用前初始化
         */
        final String testStr;
        String testStr2="adfs";
        testStr = testStr2;
        System.out.println(testStr);
        /**
         * test final ,实参和形参 ,java 基本数据类型采取的值传递，对象是引用传递，即行参和实参指向同一个对象，
         * 但是让形参重新指向另一个对象，并不会改变实参的引用对象。
         */
        Person person = new Person(3);
        changeValue(person);
        System.out.println(person.i);
        int int1=3;
        changeValue(int1);
        System.out.println(int1);
    }
    static void changeValue(Person a){
        a.i++;
    }
    static void changeValue(int a){
          a++;
    }
}
