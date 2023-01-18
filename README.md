# SecuriteWeb
Projet destiné a gérer les acces au niveau d'une application web jee.
Sur le Back end on 4Packages 
# Entities pour l'ensemble des classes (beans)
# Config Avec comme principale classe Hibernate util qui nous permets de definir la coniguration coté base de donnée
et permettre l'ouverture de la session et de la transaction pour l'acces aux données.
# Dao pour gerer l'acces aux données avec des interfaces et des classes qui vont implementer ces interfaces pour nous permettre 
de faire le traitement avec les servlets
# Servlet qui sont des classes heritées de HttpServlet pour servir ce controller , il interceptent les donneées a la validation
d'un formulaire Par ex (DoPost a la validation et request.getParemetter a la recuperation ) et et instancie le Dao de la classe 
concernée pour faire le traitement necessaaire.
il permettent aussi de charger des données depuis le servlet (request.setAttribute) qui seront accessible à la vue.

# Au niveau de la Présentation nous avons des Jsp (java server Page) avec comme Page d'accueil index.jsp dont le mapping est gérer avec loginServlet et <url-mapping>
  au niveau du fichier web.xml situé dans web_inf. On a utilisé les tagslib aussi avec le moteur de template jstl pour simplifier l'ecriture de code java natif.
