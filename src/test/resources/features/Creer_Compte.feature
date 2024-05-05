@nv_compte
Feature: creer un compte

  Scenario: creer un compte avec des conditions valides
    Given Je suis sur la page d'accueil
    When Je clique sur licone Compte
    Then Je clique sur inscrivez-vous gratuitement
    And Je saisis le mail du compte
    And Je saisis le prenom
    And Je saisis le nom
    And Je saisis la ville
    And je clique sur le bouton meConnecter

  Scenario: creer un compte avec des conditions non valides
    Given Je suis sur la page d'accueil
    When Je clique sur licone Compte
    Then Je clique sur inscrivez-vous gratuitement
    And Je saisis le mail du compte
    And Je saisis le prenom
    And Je saisis le nom
    And Je saisis la ville
    And je clique sur le bouton meConnecter

