package example;

import javax.xml.ws.Endpoint;

public class SayYourName {

    public String sayYourName(String name){
        String str = "i can say your name what you told me!\n hello!" + name;
        System.out.println(str);
        return str;
    }
}
