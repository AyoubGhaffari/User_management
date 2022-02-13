package com.ayoub.gestionutilisateurs.presentation.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import static lombok.AccessLevel.PRIVATE;

@ConfigurationProperties(prefix = "swagger.ui")
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = PRIVATE)
public class Properties {
    String title = "Gestion utilisateurs";
    String description = "Ajout et liste des utilisateurs";
    String version = "1.0.0";
    String contactName = "GHAFFARI AYOUB";
    String contactUrl = "http://GHAFFARIAYOUB.com";
    String contactEmail = "ayo.ghaffari@gmail.com";
}
