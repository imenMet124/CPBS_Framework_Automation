@rech
Feature:rechreche

  Scenario: recherche avec des conditions valides

    Given Je suis sur le site
    When Je clique sur icone recherche
    Then Je clique sur la liste des choix
    And je clique sur le choix
    And Je saisis la localisation voulu
    And je clique sur le bouton rechercher
    Then je choisis l'annonce

  Scenario: recherche avec des conditions non valides

    Given Je suis sur le site
    When Je clique sur icone recherche
    Then Je clique sur la liste des choix
    And je clique sur le choix
    And Je saisis la localisation voulu
    And je clique sur le bouton rechercher
    Then je choisis l'annonce

