package us.pdavidson.spock.demo

import spock.lang.Specification


class HelloWorldTest extends Specification {
    HelloWorld helloWorld
    def myService = Mock(MyService)

    def setup() {
        helloWorld = new HelloWorld(myService)
    }

    def "says hello with your fullname"() {
        setup:
        def name = "peter"
        1 * myService.getFullName(name) >> "peter davidson"

        when:
        def x = helloWorld.sayHello(name)


        then:
        x == "Hello peter davidson"
    }
}
