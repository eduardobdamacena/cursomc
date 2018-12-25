package net.dbyte.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;

public class MockEmailService extends AbstractEmailService {

	private static Logger LOG = LoggerFactory.getLogger(MockEmailService.class);
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		LOG.info("Simulando envio de E-Mail...");
		LOG.info(msg.toString());
		LOG.info("E-Mail enviado!");
		
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
		LOG.info("Simulando envio de E-Mail HTML...");
		LOG.info(msg.toString());
		LOG.info("E-Mail enviado!");
	}
	
}