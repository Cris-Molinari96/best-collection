1) Scrivere un metodo loadLines(String filePath) che carichi le linee di un
file di testo con percorso “filePath” e le ritorni come lista di stringhe.

2) Scrivere un metodo processLines(List<String> lines) che scorre la
lista di stringhe in input e ritorna una HashMap che ha come chiavi interi
e come valori stringhe.
Per ogni stringa nella lista il metodo deve eseguire le seguenti
operazioni:
- Se una linea è vuota non deve fare nulla
- Calcola la lunghezza della stringa, rimuovendo spazi all’inizio ed
alla fine, salvandola in una variabile di tipo intero.
- Inserisce in mappa una entry avente come chiave la lunghezza
della stringa e come valore la prima metà della stringa (da indice 0
a lunghezza/2).
- Nel caso in cui in mappa sia già presente una entry con la
stessa chiave, stampa un messaggio di errore.

3) Scrivere un metodo writeLines(String filePath, HashMap<Integer,
String> entries) che scriva le entry nella mappa su un file di testo al
percorso ‘filePath’, una per riga, nel seguente formato: “KEY - VALORE”.

INPUT D’ESEMPIO (ignorare gli asterischi)
###
Test my knowledge
Dummy
Lorem ipsum
This is so wrong but I like it
Mana Health
###
La prima linea del file dovrebbe risultare nella coppia in mappa (17,
“Test my”)