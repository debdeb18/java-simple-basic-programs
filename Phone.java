public class Phone {
    String name, tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public void show(){
        System.out.println(name+" / "+tel);
    }
}
