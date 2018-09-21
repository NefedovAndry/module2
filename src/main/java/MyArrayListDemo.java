public class MyArrayListDemo {
    public static void main(String[] args) {
        MyArrayList myList = new MyArrayList();
        int foo = myList.add(2);
        System.out.println(myList.size());
        System.out.println(myList.get(foo));
        myList.remove(foo);
        System.out.println(myList.size());
    }
}
