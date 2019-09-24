/**
 * 枚举式，可以防止序列化和反序列化时形成多例,Effective Java作者Josh Bloch 提倡的方式
 */
enum  SinglePattern6 {
    INSTANCE;
    public void doSomething(){
        //可以设置多个方法，INSTANCE本身就是SinglePattern6的一个引用，所以此方法INSTANCE都可以调用
        System.out.println("do something");
    }
}
