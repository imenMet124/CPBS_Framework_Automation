Feature:se connecter

  Scenario: se connecter

    Given Je suis sur la page d'accueil du site web
    When Je clique sur l'icone "Compte"
    Then Je clique sur "connectez-vous"
    And Je saisis le mail
    And je clique sur le bouton continue
    And Je saisis le mot de passe
    And je clique sur le bouton "Me connecter "
    Then J'accede à mon profile