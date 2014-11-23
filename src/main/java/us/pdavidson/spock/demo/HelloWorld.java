package us.pdavidson.spock.demo;

public class HelloWorld {

    private final MyService myService;

    public HelloWorld(MyService myService) {
        this.myService = myService;
    }

    public String sayHello(String name){
        String fullname = myService.getFullName(name);
        return "Hello " + fullname;
    }
}
