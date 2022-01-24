package com.weslleyguedes.projetospring.services;

import org.springframework.mail.SimpleMailMessage;

import com.weslleyguedes.projetospring.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void SendEmail(SimpleMailMessage msg);
	
}