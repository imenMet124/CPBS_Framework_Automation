Feature: Déposer une annonce

  Scenario: Déposer une annonce immobilière
    Given Je suis sur la page d'accueil du site web
    When Je clique sur "Déposer une annonce gratuite"
    And Je clique sur "Choisir une catégorie"
    And Je suis "Particulier"
    And Je choisis le type "Appartement"
    And Je saisis le titre "Un appartement en bon état"
    And Je saisis la description "Un appartement en bon état"
    And Je saisis la surface "200"
    And Je coche la case "Surface Loi Carrez"
    And Je saisis le nombre de pièces "3"
    And je saisis l'annee de construction "2020"
    And je coche la case d'investissement "investissement"

    Then Je devrais voir un message de confirmation de dépôt de l'annonce