Feature:Creer un compte

  Scenario: creer un nouveau compte
    Given Je suis sur la page d'accueil du site web
    When Je clique sur l'icone "Compte"
    Then Je clique sur "inscrivez-vous gratuitement"
    And Je saisis le mail
    And Je saisis le prenom
    And Je saisis le nom
    And Je saisis la ville
    And je clique sur le bouton "Me connecter "
    Then Je devrais recevoire un message de confirmation par mail