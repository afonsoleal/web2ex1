package br.com.bb.t99.services;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalTime;
import static java.time.format.DateTimeFormatter.ofPattern;

@ApplicationScoped
public class HorarioService {
    public String toString() {
        return LocalTime.now().format(ofPattern("HH:mm"));
    }
}
