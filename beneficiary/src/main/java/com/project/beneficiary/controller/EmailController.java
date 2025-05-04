package com.project.beneficiary.controller;

import com.project.beneficiary.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/notificiation")
public class EmailController {
    private final EmailService emailService;

    @GetMapping("/send-email")
    public String sendMail() {
        try {
            emailService.sendEmail(
                    "yammaneva@gmail.com ",
                    "Test Spring Boot",
                    "Le bénéficiaire est modifié avec succès"
            );
            return "Email envoyé avec succès!";
        } catch (Exception e) {
            return "Erreur: " + e.getMessage();
        }
    }
}

