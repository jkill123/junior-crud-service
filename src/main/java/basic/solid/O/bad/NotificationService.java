package basic.solid.O.bad;

//todo O – Open closed Principle – принцип відкритості-закритості.
// Класи повинні бути відкриті для розширення, але закриті зміни.
public class NotificationService {
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            //write email
            //use JavaMailSenderAPI
        }
        if (typeMessage.equals("sms")) {
            //write sms
            //send sms
        }
    }
}
