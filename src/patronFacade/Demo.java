package patronFacade;

import java.io.File;

public class Demo {
    /**
     * En este ejemplo, el patrón Facade simplifica la comunicación con un framework complejo de conversión de video.
     *
     * El patrón Facade proporciona una única clase con un único método que gestiona toda la complejidad de configurar
     * las clases correctas del framework y recuperar el resultado en el formato correcto.
     */
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
