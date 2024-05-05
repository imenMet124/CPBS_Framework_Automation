@annonce
Feature: Déposer une annonce

  Scenario: Déposer une annonce particulier
    Given Je suis sur la page d'accueil du site web
    When Je clique sur Déposer une annonce gratuite
    And Je clique sur Choisir une catégorie
    And Je suis Particulier
    And Je choisis le type Appartement
    And Je saisis le titre Un appartement en bon état
    And Je saisis la description Un appartement en bon état
    And Je saisis la surface 200
    And Je coche la case Surface Loi Carrez
    And Je saisis le nombre de pièces 3
    And je saisis l'annee de construction
    And je coche la case d'investissement

  Scenario: Déposer une annonce professionnelle
    Given Je suis sur la page d'accueil du site web
    When Je clique sur Déposer une annonce gratuite
    And Je clique sur Choisir une catégorie
    And Je suis professionnelle
    And je saisis le numero SIRET
    And je choisis le Civilité
    And je saisis mon nom
    And je saisis mon prenom
    And je saisis mon numero de telephone
    And je saisis mon mail


