@sign_in
Feature:se connecter

  Scenario: se connecter avec des conditions valides

    Given Je suis sur la page accueil du site web
    When Je clique sur icone Compte
    Then Je clique sur connectez-vous
    And Je saisis le mail
    And je clique sur le bouton continue
    And Je saisis le mot de passe
    And je clique sur le bouton Me connecter

  Scenario: se connecter avec des conditions non valides
    Given Je suis sur la page accueil du site web
    When Je clique sur icone Compte
    Then Je clique sur connectez-vous
    And Je saisis le mail
    And je clique sur le bouton continue
    And Je saisis le mot de passe
    And je clique sur le bouton Me connecter