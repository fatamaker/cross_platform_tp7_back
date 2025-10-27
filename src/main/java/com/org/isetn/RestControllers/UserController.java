package com.org.isetn.RestControllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.org.isetn.entities.User;
import com.org.isetn.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // 1. Endpoint d'Inscription
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        // Enregistre un nouvel utilisateur dans la base
        return userRepository.save(user);
    }

    // 2. Endpoint de Connexion
    @PostMapping("/login")
    public User login(@RequestBody User user) {
        // Recherche l'utilisateur par email et mot de passe
        User loggedInUser = userRepository.findByEmailAndPassword(
            user.getEmail(), 
            user.getPassword()
        );
        // Si l'utilisateur est trouvé, il est retourné (code HTTP 200)
        // Sinon, null est retourné (ou une réponse 401 Unauthorized peut être implémentée)
        return loggedInUser;
    }
}