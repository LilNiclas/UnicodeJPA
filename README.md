### Kort opgave om vores introduktion til JPA

# Unicode JPA Opgave

Dette er en opgave der omhandler Unicode og JPA.  
**Step1.** Tilføj en RestController klasse til et nyt eller eksisterende JPA projekt.  
**Step2.** Skriv følgende Get metode i klassen.
```java
      @GetMapping("/unicode/{i}")
      public String unicodeToChar(@PathVariable int i) {
          char c = (char)i;
          return "unicode=" + i + " char=" + c;
      }
```
Prøv kør programmet.  
Kald endpoint med http://localhost:8080/unicode/97  
Se hvad der står i browser.

**Step3.** Første opgave er at skrive et endpoint der gør det modsatte som ovenstående.
  Nemlig at tage en char som parameter og skrive unicoden ud.

**Step4.** Opret nu en ny model klasse, vi kunne kalde den Unicode, som skal mappes til MySql database med JPA.
   Properties i klassen
   Int id, int unicode, char bogstav og String description, så man kan skrive en kommentar udfor sine yndlings bogstaver.

**Step5.** Opret et repository for Unicode klassen.

**Step6.** I f.eks. InitData skriv en metode der gemmer alle de Unicode bogstaver i unicode sql tabellen, som kan være i et Set<Character>

