package usecase.services;

import domain.perfil.values.IdReferencia;

public interface SendEmailService {
    boolean send(IdReferencia idReferencia, String email, String body);
}
