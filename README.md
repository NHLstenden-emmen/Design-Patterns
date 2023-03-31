# Design-Patterns

Voor design patterns willen wij gaan werken met de RDW API, via deze API kan van elk (geregistreerd) kenteken in Nederland data worden opgevraagd. Deze data bestaat uit diverse velden, zoals het kenteken, modelnaam, BPM en nog veel meer. Het leek ons erg interessant om een project op te stellen met de grootte hoeveelheid data. Het voornaamste doel is om het mogelijk te maken deze data te verwerken en te representeren in een rapport. Hieronder staan verschillende rapporten en patterns die wij willen gebruiken in het project. Tijdens het maken van het project willen wij hier nog meer functionaliteiten aan toe voegen.

## RDW

Hieronder een kleine beschrijving van de RDW

RDW staat voor Rijksdienst voor het Wegverkeer en is een Nederlandse overheidsorganisatie die verantwoordelijk is voor de registratie en controle van voertuigen en rijbewijzen in Nederland. Het RDW houdt onder andere toezicht op de technische staat van voertuigen, de APK-keuring, de kilometerstandregistratie en de registratie van gestolen voertuigen. Het RDW speelt dus een belangrijke rol in het waarborgen van de verkeersveiligheid en het voorkomen van fraude in het wegverkeer.

## Class Diagram:
![image](https://user-images.githubusercontent.com/39293162/229165968-c5cd966a-15c7-4cdc-a7db-4e4dcc6529ad.png)

## Rapporten

#### Standaard rapport
Op basis van het kenteken wordt de voertuig informatie opgehaald en weggeschreven naar een bestand (het rapport).

#### Kilometer stand controle rapport
Op basis van een of meerdere kentekens wordt opgehaald of deze kloppend is (NAP Status) en dit wordt weggeschreven naar een bestand waar de kentekens onder elkaar staan, met hierna een JA of NEE aangegeven voor het kloppen van de KM-stand. Hierbij wordt ook weergegeven of hij verzekerd is of niet.

#### Voertuig vergelijken rapport
De data van twee door de gebruiker aangegeven voertuigen worden opgehaald. Nadat deze is opgehaald worden de verschillende velden met elkaar vergeleken (cilinder inhoud, kleur, voertuigsoort, APK Vervaldatum, BPM, etc.). Dit wordt weggeschreven naar een vergelijkingsrapport.

#### Familie rapport
Haalt op welke auto's van jou model op dezelfde dag (plus en min een dag) zijn geregistreerd in Nederland. Opgezocht op basis van modelnaam, toelatingsdatum etc.


## Patterns

#### Adapter pattern API Response
Een adapter voor het omzetten van de API response naar bruikbare data in Java.

#### Command pattern
Aangezien de API met veel parameters werkt, wordt voor de meest frequente request commands opgesteld zodat deze niet elke keer apart moeten worden opgebouwd.

#### Memento pattern
De standaard API request functionaliteit wordt uitgebreid door middel van een decorator met een cache systeem. Wanneer een kenteken al eerder is opgezocht wordt deze uit de cache gehaalt zodat geen onnodige API request moeten worden uitgevoerd.

#### Factory pattern
Aangezien verschillende rapport kunnen worden opgesteld willen we een factory maken die deze verschillende rapporten kan opstellen.
