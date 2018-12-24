package net.dbyte.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import net.dbyte.cursomc.domain.Pedido;

public interface EmailService {
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
