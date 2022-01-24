package com.weslleyguedes.projetospring.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.weslleyguedes.projetospring.domain.Pedido;

public interface EmailService {

	//Versão texto plano
	void sendOrderConfirmationEmail(Pedido obj);
	
	void SendEmail(SimpleMailMessage msg);
	
	//Versão HTML
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	void sendHtmlEmail(MimeMessage msg);
	
}