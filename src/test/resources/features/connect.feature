Feature: Création d'un compte sur le site web de Boulanger

  Scenario: Création d'un compte utilisateur
    Given J'accède au site web "www.boulanger.com"
    When Je supprime toutes les cookies
    And Je clique sur le bouton "Me connecter"
    And Je clique sur "Créer mon compte"
    And Je saisis l'identifiant "mon_identifiant"
    And Je saisis le mot de passe "mon_mot_de_passe"
    And Je choisis le statut "+ Civilité"
    And Je saisis le nom "Nom"
    And Je saisis le prénom "Prénom"
    And Je saisis la date de naissance "01/01/2000"
    And Je choisis dans la liste des pays "TUNISIE"
    And Je saisis l'adresse "Mon adresse"
    And Je saisis le code postal "12345"
    And Je saisis la ville "Ma ville"
    And Je choisis "TN" et saisis le numéro de téléphone "0123456789"
    And Je saisis l'adresse e-mail "mon@email.com"
    And Je clique sur le bouton radio "Je ne souhaite pas rejoindre Le club"
    And Je clique sur le bouton radio "non"
    And Je clique sur le deuxième bouton radio "non"
    And Je clique sur le bouton à cocher "Je ne souhaite pas partager mes données"
    And Je clique sur le bouton "Créer mon compte"
    Then Je devrais voir le compte créé avec succès