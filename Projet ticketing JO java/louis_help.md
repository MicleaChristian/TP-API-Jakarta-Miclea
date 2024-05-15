La route pour ajouter un user est faite (pas testé pas compilié mais j'ai exam dans 6 min)
Un repository bien configuré à des fonction sql pré faites (pas besoin d'écrire de sql) normalement c'est le cas pour userRepository.addUsers(user)

Idéalement il faudrait ajouter un userDto avec une classe userMapper (jsp si t'as déjà fait)

Je pars en exam on en reparle plus tard

entrée de la route -> controller -> service -> repository -> bdd

Corrigé les quelques erreurs que je comprenais (problèmes d'imports / declarations)
Reste Trois erreurs (functional.exception.class (certainement un problème d'importation, à voir)), @Slf4j (une autre importation qui manque j'imagine) et (UserDto User) certainement le Dto qui manque.