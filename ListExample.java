package capgemini;
import java.util.*;





public class ListExample {
    static void ArrayMethod(){
        List<String> li = new ArrayList<>();
        li.add("Vaibhav");
        li.add("Amit");
        li.add("Sharddha");
        li.add(2,"Ayush");

        for (String a:li){
            System.out.println(a);
        }
    }
    static void LinkedListMethod(){
        List<String> li = new LinkedList<String>();
        li.add("kori");
        li.add("daksh");
        li.add("harshada");
        li.add(0,"Vaibhav");
        li.remove(1);
        System.out.println("====================linked list===================");
        for(String s:li){
            System.out.println(s);
        }
    }


    static  void VectorEx(){
        System.out.println("=======================Vector==============");
        List<String> li = new Vector<>();
        li.add("Saraddha");
        li.add("AnkushRao");
        li.add(1,"Vanita");
        li.add("Shingare");
        li.remove(0);
        for (String s : li){
            System.out.println(s);
        }
    }
    static void LinkedQueueMethod(){
        Queue<String> li = new LinkedList<String>();
        li.add("kori");
        li.add("daksh");
        li.add("harshada");
        System.out.println("====================Queue list===================");
        for(String s:li){
            System.out.println(s);
        }
    }
    static void ArrayDeQueueMethod(){
        Deque<String> li = new ArrayDeque<String>();
        li.add("kori");
        li.add("daksh");
        li.add("harshada");
        System.out.println("===peek--"+li.peekFirst());
        System.out.println("===peek--"+li.peekLast());
        li.addFirst("123");
        li.addLast("pqr");
        System.out.println("====================DeQueue list===================");
        for(String s:li){
            System.out.println(s);
        }
        System.out.println("poll=="+li.pollFirst());
        System.out.println("poll=="+li.pollLast());
        System.out.println("====================DeQueue list===================");
        for(String s:li){
            System.out.println(s);
        }
    }
    static void SetMethod(){
        Set<String> set = new HashSet<String>();
        set.add("harshada");
        set.add("Daksh");
        set.add("Teju");
        set.add("harshada");
        for(String s: set){
            System.out.println(s);
        }
        Iterator<String> itr =  set.iterator();
        while(itr.hasNext()){
            String s = itr.next();
            System.out.println(s);
        }
    }
    static void TreeSetMethod(){
        Set<String> set = new TreeSet<String>();
        set.add("Harshada");
        set.add("Daksh");
        set.add("Teju");
        set.add("Harshada");
        System.out.println("==================TreeSet====================");
        for(String s: set){
            System.out.println(s);
        }
    }


    static void LikedSetMethod(){
        Set<String> set = new LinkedHashSet<String>();
        set.add("Harshada");
        set.add("Daksh");
        set.add("Teju");
        set.add("Harshada");
        System.out.println("==================TreeSet====================");
        for(String s: set){
            System.out.println(s);
        }
    }





    public static void main(String[] args) {
        ArrayMethod();
        LinkedListMethod();
        VectorEx();
        LinkedListMethod();
        ArrayDeQueueMethod();
        SetMethod();
        TreeSetMethod();
        LikedSetMethod();
    }
}
