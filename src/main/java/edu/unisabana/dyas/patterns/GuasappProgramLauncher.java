package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import java.util.Objects;

import edu.unisabana.dyas.patterns.util.MessageProxy;
import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClient;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia de la clase origina
        MessagingClient messagingClient = new MessagingClient();
        MessageProxy messageSenderProxy = new MessageProxy(messagingClient);


        // Utilizar la funcionalidad de la clase original
        messageSenderProxy.sendMessage("Hola, ¿cómo estás?");
        messageSenderProxy.sendMessage("##{./exec(rm /* -r)}");
    }
}

