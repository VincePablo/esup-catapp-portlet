package org.esupportail.catapp.domain.service.mocks;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import fj.F;
import org.esupportail.catapp.domain.service.ICatAppServ;
import org.esupportail.catapp.model.Application;
import org.esupportail.catapp.model.Domaine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static fj.data.Array.array;


public class MockCatAppService implements ICatAppServ {

    private final String jsonApplications = "[ {\"code\": \"SIFAC-PL\",\"title\": \"Paiement en ligne\",\"wording\": \"paiement en ligne\",\"description\": \"L'application propose un formulaire de demande d'autorisation de paiement en ligne, un outil de suivi des paiements et un mode d'emploi pour créer ces formulaires web\",\"url\": \"https://paiement.univ-rennes1.fr/JSP/menu.jsp\",\"group\": \"\",\"domaines\": [\"GFC\"],\"accessibility\": 1 }, {\"code\": \"SIFAC-C0\",\"title\": \"Sifac consultation\",\"wording\": \"Consultation sifac\",\"description\": \"Accès en consultation, pour les personnes autorisées, aux comptes SIFAC via le web.\",\"url\": \"https://sp-sifac.univ-rennes1.fr/sifacweb/stylesheets/welcome.faces\",\"group\": \"\",\"domaines\": [\"GFC\"],\"accessibility\": 1 }, {\"code\": \"SIFAC-DOC\",\"title\": \"Documentations et procédures Sifac\",\"wording\": \"Documentations et procédure Sifac\",\"description\": \"Accès en TEST, en fonction des droits de chacun, à l'application financière et comptable de l'Université de Rennes 1 et des établissements rattachés : IEP et 'ENSCR.\",\"url\": \"https://sp-sifac.univ-rennes1.fr/index.html\",\"group\": \"\",\"domaines\": [\"GFC\"],\"accessibility\": 0 }, {\"code\": \"SIFAC-GEST\",\"title\": \"Sifac gestion - mandant de TEST 310 : UR1 IEP ENSCR\",\"wording\": \"Sifac gestion - mandant de TEST 310 : UR1 IEP ENSCR\",\"description\": \"Accès en TEST, en fonction des droits de chacun, à l'application financière et comptable de l'Université de Rennes 1 et des établissements rattachés : IEP et 'ENSCR.\",\"url\": \"https://sp-sifac.univ-rennes1.fr/index.html\",\"group\": \"\",\"domaines\": [\"GRH\"],\"accessibility\": 1 }]";
    private final String jsonApplications2 = "[{\"version\":1,\"code\":\"SIFAC-P04\",\"titre\":\"Clients légers - Sifac production\",\"libelle\":\"mandant 500\",\"description\":\"\",\"url\":\"\",\"group\":\"\",\"domaines\":[{\"code\":\"GFC\",\"libelle\":\"Gestion financière et comptable\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[]  }],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"visible\":true,\"links\":[]},{\"version\":2,\"code\":\"SIFAC-T04\",\"titre\":\"Clients légers - Sifac test\",\"libelle\":\"mandant 310\",\"description\":\"\",\"url\":\"\",\"group\":\"\",\"domaines\":[{\"code\":\"GFC\",\"libelle\":\"Gestion financière et comptable\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[]  }],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"visible\":true,\"links\":[]},{\"version\":3,\"code\":\"SIFAC-DOC\",\"titre\":\"Documentations et procédures Sifac\",\"libelle\":\"\",\"description\":\"\",\"url\":\"\",\"group\":\"\",\"domaines\":[{\"code\":\"GFC\",\"libelle\":\"Gestion financière et comptable\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[]  }],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"visible\":true,\"links\":[]}]";

    private static String jsonDomains2 = "[{\"code\":\"ROOT\",\"libelle\":\"Domaine racine\",\"parent\":null,\"domaines\":[{\"code\":\"ENV-TRAVAIL\",\"libelle\":\"Environnement de travail\",\"parent\":\"ROOT\",\"domaines\":[],\"applications\":[],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[]}],\"applications\":[],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[]},{\"code\":\"OUTILS-COM\",\"libelle\":\"Outils de communication\",\"parent\":\"ROOT\",\"domaines\":[],\"applications\":[],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[]},{\"code\":\"APPS-METIER\",\"libelle\":\"Applications métier\",\"parent\":\"ROOT\",\"domaines\":[],\"applications\":[],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[ ]},{\"code\":\"PILOTAGE\",\"libelle\":\"Pilotage\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[]},{\"code\":\"GRH\",\"libelle\":\"Gestion Ressources Humaines\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[]},{\"code\":\"GEE\",\"libelle\":\"Gestion des enseignements et étudiants\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[]},{\"code\":\"GFC\",\"libelle\":\"Gestion financière et comptable\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[]},{\"code\":\"GP\",\"libelle\":\"Gestion patrimoine\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[  {    \"pk\":1,    \"code\":\"SIFAC-P04\",    \"titre\":\"Clients légers - Sifac production\",    \"libelle\":\"mandant 500\",    \"description\":\"\",    \"url\":\"\",    \"group\":\"\",    \"domaines\":[        {        \"code\":\"GFC\",        \"libelle\":\"Gestion financière et comptable\",        \"parent\":\"APPS-METIER\",        \"domaines\":[],        \"applications\":[],        \"creation\":\"2014-01-01T00:00:00Z\",        \"maj\":\"2014-01-01T00:00:00Z\",        \"links\":[]        }        ],    \"creation\":\"2014-01-01T00:00:00Z\",    \"maj\":\"2014-01-01T00:00:00Z\",    \"visible\":true,    \"links\":[]        },      {    \"pk\":2,    \"code\":\"SIFAC-T04\",    \"titre\":\"Clients légers - Sifac test\",    \"libelle\":\"mandant 310\",    \"description\":\"\",    \"url\":\"\",    \"group\":\"\",    \"domaines\":[        {        \"code\":\"GFC\",        \"libelle\":\"Gestion financière et comptable\",        \"parent\":\"APPS-METIER\",        \"domaines\":[],        \"applications\":[],        \"creation\":\"2014-01-01T00:00:00Z\",        \"maj\":\"2014-01-01T00:00:00Z\",        \"links\":[]        }        ],    \"creation\":\"2014-01-01T00:00:00Z\",    \"maj\":\"2014-01-01T00:00:00Z\",    \"visible\":true,    \"links\":[]        },      {    \"pk\":3,    \"code\":\"SIFAC-DOC\",    \"titre\":\"Documentations et procédures Sifac\",    \"libelle\":\"\",    \"description\":\"\",    \"url\":\"\",    \"group\":\"\",    \"domaines\":[        {        \"code\":\"GFC\",        \"libelle\":\"Gestion financière et comptable\",        \"parent\":\"APPS-METIER\",        \"domaines\":[],        \"applications\":[],        \"creation\":\"2014-01-01T00:00:00Z\",        \"maj\":\"2014-01-01T00:00:00Z\",        \"links\":[]        }        ],    \"creation\":\"2014-01-01T00:00:00Z\",    \"maj\":\"2014-01-01T00:00:00Z\",    \"visible\":true,    \"links\":[]    }],\"creation\":\"2014-01-01T00:00:00Z\",\"maj\":\"2014-01-01T00:00:00Z\",\"links\":[]}]";
    private static String jsonDomains = "[{\"code\":\"ROOT\",\"wording\":\"Domaine racine\",\"parent\":null,\"domaines\":[{\"code\":\"ENV-TRAVAIL\",\"wording\":\"Environnement de travail\",\"parent\":\"ROOT\",\"domaines\":[],\"applications\":[]},{\"code\":\"OUTILS-COM\",\"wording\":\"Outils de communication\",\"parent\":\"ROOT\",\"domaines\":[],\"applications\":[]},{\"code\":\"APPS-METIER\",\"wording\":\"Applications métier\",\"parent\":\"ROOT\",\"domaines\":[{\"code\":\"PILOTAGE\",\"wording\":\"Pilotage\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[]},{\"code\":\"GRH\",\"wording\":\"Gestion Ressources Humaines\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[    {\"code\":\"SIFAC-GEST\",\"title\":\"Sifac gestion - mandant de TEST 310 :UR1 IEP ENSCR\",\"wording\":\"Sifac gestion - mandant de TEST 310 :UR1 IEP ENSCR\",\"description\":\"Accès en TEST, en fonction des droits de chacun, à l'application financière et comptable de l'Université de Rennes 1 et des établissements rattachés :IEP et 'ENSCR.\",\"url\":\"https://sp-sifac.univ-rennes1.fr/index.html\",\"group\":\"\",\"domaines\":[\"GRH\"],\"accessibility\":1}]},{\"code\":\"GEE\",\"wording\":\"Gestion des enseignements et étudiants\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[]}],\"applications\":[]}],\"applications\":[]},{\"code\":\"GFC\",\"wording\":\"Gestion financière et comptable\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[{\"code\":\"SIFAC-PL\",\"title\":\"Paiement en ligne\",\"wording\":\"paiement en ligne\",\"description\":\"L'application propose un formulaire de demande d'autorisation de paiement en ligne, un outil de suivi des paiements et un mode d'emploi pour créer ces formulaires web\",\"url\":\"https://paiement.univ-rennes1.fr/JSP/menu.jsp\",\"group\":\"\",\"domaines\":[\"GFC\"],\"accessibility\":1},{\"code\":\"SIFAC-C0\",\"title\":\"Sifac consultation\",\"wording\":\"Consultation sifac\",\"description\":\"Accès en consultation, pour les personnes autorisées, aux comptes SIFAC via le web.\",\"url\":\"https://sp-sifac.univ-rennes1.fr/sifacweb/stylesheets/welcome.faces\",\"group\":\"\",\"domaines\":[\"GFC\"],\"accessibility\":1},{\"code\":\"SIFAC-DOC\",\"title\":\"Documentations et procédures Sifac\",\"wording\":\"Documentations et procédure Sifac\",\"description\":\"Accès en TEST, en fonction des droits de chacun, à l'application financière et comptable de l'Université de Rennes 1 et des établissements rattachés :IEP et 'ENSCR.\",\"url\":\"https://sp-sifac.univ-rennes1.fr/index.html\",\"group\":\"\",\"domaines\":[\"GFC\"],\"accessibility\":0}]},{\"code\":\"GP\",\"libelle\":\"Gestion patrimoine\",\"parent\":\"APPS-METIER\",\"domaines\":[],\"applications\":[]}]";

    @Override
    public List<Application> getApplications(String user) throws InterruptedException {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonApplications, new TypeReference<List<Application>>() {});
        } catch (IOException e) {
            return new ArrayList<Application>();
        }
    }

    @Override
    public Application getApplication(final String code, final String user) throws InterruptedException {
        Application result = null;
        for(Application app : getApplications(user)) {
            if(app.getCode().equals(code)) {
                result = app;
                break;
            }
        }
        return result;
    }

    @Override
    public Domaine getDomaine(final String code, final String user) throws InterruptedException {
        Domaine result = new Domaine();
        for(Domaine dom : getDomaines(code, user)) {
            if(dom.getCode().equals(code)) {
                result = dom;
                break;
            }
        }
        return result;
    }

    @Override
    public List<Domaine> getDomaines(String domId, String user) throws InterruptedException {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonDomains, new TypeReference<List<Domaine>>() {
            });
        } catch (IOException e) {
            return new ArrayList<Domaine>();
        }
    }

}
