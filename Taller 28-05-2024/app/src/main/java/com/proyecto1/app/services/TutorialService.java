package com.proyecto1.app.services;

import java.util.List;
import com.proyecto1.app.domain.Tutorial;

public interface TutorialService {
    public List<Tutorial> listaTutoriales();
    public void crearTutorial(Tutorial tutorial);
    public Tutorial mostrarTutorial(Tutorial tutorial);
}
