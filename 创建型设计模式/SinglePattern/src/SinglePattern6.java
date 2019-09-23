/**
 * 枚举式，可以防止序列化和反序列化时形成多例，Effective Java作者Josh Bloch 提倡的方式
 */
enum  SinglePattern6 {
    INSTANCE;
    public void doSomething(){
        System.out.println("do something");
    }
}
