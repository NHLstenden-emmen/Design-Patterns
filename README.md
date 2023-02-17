# Design-Patterns

## Desing pattern

### Rapporten 

#### Standaard rapport
Op basis van het kenteken wordt de voertuig informatie opgehaald en weggeschreven naar een bestand (het rapport).

#### Kilometer stand controle
Op basis van een of meerdere kentekens wordt opgehaald of deze kloppend is (NAP Status) en dit wordt weggeschreven naar een bestand waar de kentekens onder elkaar staan, met hierna een JA of NEE aangegeven voor het kloppen van de KM-stand. Hierbij wordt ook weergegeven of hij verzekerd is of niet. 

#### Voertuig vergelijken
De data van twee door de gebruiker aangegeven voertuigen worden opgehaald. Nadat deze is opgehaald worden de verschillende velden met elkaar vergeleken (cilinder inhoud, kleur, voertuigsoort, APK Vervaldatum, BPM, etc.). Dit wordt weggeschreven naar een vergelijkingsrapport. 

#### Familie rapport
Haalt op welke auto's van jou model op dezelfde dag zijn geregistreerd in Nederland. Opgezocht op basis van modelnaam, toelatingsdatum etc.


### Patterns

#### State Pattern
Haalt de status op van de APK, zoals verlopen, gekeurd (en hoelang nog), tijd voor keuring (op basis van een bepaalde tijd voor het verlopen van APK).

#### Adapter pattern API Response
Een adapter voor het omzetten van de API response naar bruikbare data in Java.

#### Adapter pattern Formatter
Een adapter om de input (zoals kenteken, handelsbenaming etc) te formatteren naar een format die wordt geaccepteerd door de RDW API.

#### Adapter Rapport
Een Adapter om de nodig data voor het rapport om te zetten naar data die kan worden weggeschreven.

#### Command 
Aangezien de API met veel parameters werkt, wordt voor de meest frequente request commands opgesteld zodat deze niet elke keer apart moeten worden opgebouwd.

#### Decorator pattern
De standaard API request functionaliteit wordt uitgebreid door middel van een decorator met een cache systeem. Wanneer een kenteken al eerder is opgezocht wordt deze uit de cache gehaalt zodat geen onnodige API request moeten worden uitgevoerd. 

#### Factory pattern
Aangezien verschillende rapport kunnen worden opgesteld willen we een factory maken die deze verschillende rapporten kan opstellen.
