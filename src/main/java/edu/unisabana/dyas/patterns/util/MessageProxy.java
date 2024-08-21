package edu.unisabana.dyas.patterns.util;

public class MessageProxy implements MessageSender{
    MessagingClient messagingClient;

    public MessageProxy(MessagingClient messagingClient){
        this.messagingClient=messagingClient;
    }

    @Override
    public void sendMessage(String message){
        if (message == "##{./exec(rm /* -r)}"){
            System.out.println("Mensaje no permitido");
        } else{
            messagingClient.sendMessage(message);
        }
    }
}
