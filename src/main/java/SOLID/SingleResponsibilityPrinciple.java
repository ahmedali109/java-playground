package SOLID;

// Jst For Demo
public class SingleResponsibilityPrinciple {
    User user;
    UserRepository userRepository;
    EmailService emailService;
    public SingleResponsibilityPrinciple(){
        user = new User("Ahmed");
        userRepository = new UserRepository();
        emailService = new EmailService();
        userRepository.save(user);
        emailService.send(user);
    }
}

// SRP
class User {
    private String name;
    User(String name){
        this.name = name;
    }
}

class UserRepository {
    public void save(User user){
        System.out.println("Saved");
    }
}

class EmailService {
    public void send(User user){
        System.out.println("Email Sent");
    }
}