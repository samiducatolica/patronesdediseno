/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PatronCommand;

/**
 *
 * @author sala4
 */
public class PatronCommand {

    public static void main(String[] args) {
        // Crear el dispositivo electrónico
        Light light = new Light();

        // Crear los comandos
        Command turnOnCommand = new LightOnCommand(light);
        Command turnOffCommand = new LightOffCommand(light);

        // Crear el control remoto
        RemoteControl remoteControl = new RemoteControl();

        // Configurar el control remoto con los comandos
        remoteControl.setCommand(turnOnCommand);

        // Presionar el botón para encender la luz
        remoteControl.pressButton();

        // Configurar el control remoto con otro comando
        remoteControl.setCommand(turnOffCommand);

        // Presionar el botón para apagar la luz
        remoteControl.pressButton();
    }
}
