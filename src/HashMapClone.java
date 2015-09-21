import java.util.HashMap;

 class NodeCount {
     String str;
     int count;
    public NodeCount(String str, int count) {
        this.str = str;
        this.count = count;
    }
}
 public class HashMapClone{
    public static void main(String[]args){
        HashMap<Integer, NodeCount> map1=new HashMap<Integer, NodeCount>();
        map1.put(1,new NodeCount("1",1));
        HashMap<Integer, NodeCount>map2=(HashMap<Integer, NodeCount>)map1.clone();
        NodeCount n1=map1.get(1);
        n1.str="2";
        NodeCount n2=map2.get(1);
        System.out.println(n2.str+" "+n2.count);
        }
}