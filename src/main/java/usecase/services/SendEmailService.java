package usecase.services;

import domain.experiencia.values.IdExperiencia;
import domain.gestioneducacion.values.IdGestionEducacion;

public interface SendEmailService {
    boolean sendByExperiencia(IdExperiencia idExperiencia, String email, String body);
    boolean sendByGestionEducacion(IdGestionEducacion idGestionEducacion, String email, String body);
}
