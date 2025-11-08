package Date_10_30;
class Box{
    Object data;

    public void setData(Object data){
        this.data = data;
    }
    public Object getData(){
        return data;
    }
}
public class Without_Generics {
    public static void main(String[] args) {
        Box item = new Box();
        item.setData(12);
        System.out.println(item.getData());

        Box item2 = new Box();
        item2.setData("Harshit");
        System.out.println(item2.data);

        // String wrong = (String) item.getData();   //Error
    }
}

/*

// Box class without generics
class Box {
    private Object item;


    public void setItem(Object item) {
        this.item = item;
    }


    public Object getItem() {
        return item;
    }
}


public class Main {
    public static void main(String[] args) {


        Box intBox = new Box();
        intBox.setItem(123);  // Autoboxing Integer # Object is class which is inheriting String,


        Box strBox = new Box();
        strBox.setItem("Hello");


        Integer num = (Integer) intBox.getItem();
        String str = (String) strBox.getItem();


        System.out.println("Integer: " + num);
        System.out.println("String: " + str);
        String wrong = (String) intBox.getItem();


        // String wrong = (String) intBox.getItem();  // ClassCastException
    }
}

 */
