package Demo;

import java.util.*;
import java.util.stream.Collectors;

public class DemoC {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,34,5,6,7);

        list.stream().sorted().forEach(System.out::println);
    }
}



































//
//
////Product A - Apple
////
////Product B - Samsumg
//
//
//interface Channels{
//    void display();
//}
//
////concrete products
//
//class Instagram implements  Channels{
//    @Override
//    public void display(){
//        System.out.println("Instagram");
//    }
//}
//
//
//class SnapChat implements  Channels{
//    @Override
//    public void display(){
//        System.out.println("Snapchat");
//    }
//}
//
//class WhatsApp implements  Channels{
//    @Override
//    public void display(){
//        System.out.println("WhatsApp");
//    }
//}
//
//
//
////Factory Interface
//
//interface  Factory{
//    Channels factoryMethod(String str);
//}
//
////Concrete Factories
//
//class ConcreteFactoryA implements  Factory{
//    @Override
//    public Channels factoryMethod(String str){
//        if(str.equalsIgnoreCase("Instagram"))
//        {
//            return new Instagram();
//        }
//
//    }
//}
//
//
//class ConcreteFactoryB implements  Factory{
//    @Override
//    public Channels factoryMethod(){
//        return new SnapChat();
//    }
//}
//
//class ConcreteFactoryC implements  Factory{
//    @Override
//    public Channels factoryMethod(){
//        return new WhatsApp();
//    }
//}
//
//
//public static void main(String[] args) {
//
//    Factory factoryA = new ConcreteFactoryA();
//    Channels productA = factoryA.factoryMethod();
//    productA.display();
//
//
//    Factory factoryB = new ConcreteFactoryB();
//    Product productB = factoryB.factoryMethod();
//    productB.display();
//}
//
////
//
//
//
//User Table
//        userId --> PK
//        phoneNumber(unique)
//        Username
//
//Contact Table
//        contactId --> PK
//        userId -->   userId+contactId
//        nickname
//        contactNumber
//
//Message Table
//        messageId
//        senderId --> userId from our user
//        receiverId --> userId from our user
//        content
//        mediaURL
//        timeStamp
//        status : delivered/seen
//
//userOnboarding
//
//fetchContactService
//
//sendMessageService(from,to,content,type)
//
//userMapperService --> user and the server where it is running
//
//statusOfAUser : online or offine
//
//
//
//
//
//
//
