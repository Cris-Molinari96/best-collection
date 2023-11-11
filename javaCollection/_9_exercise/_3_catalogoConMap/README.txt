Esercizio: Catalogo di un negozio
1. Classe Prodotto
Crea una classe astratta chiamata Product che rappresenta un generico prodotto con i
seguenti campi: nome, prezzo.

2. Interfaccia Sconto:
Crea un'interfaccia chiamata Sconto che abbia un campo sconto ed i seguenti metodi:
@overRide dei metodi nella classe Article:
- applicaSconto: un metodo che applica uno sconto al prodotto. Lo sconto deve essere
espresso in percentuale (ad esempio, uno sconto del 10% deve essere passato
come 10,0).
- calcolaPrezzoScontato(): un metodo che a partire dal prezzo del prodotto e dallo
sconto impostato, calcola il prezzo effettivo.

3. Enum TipoProdotto:
Crea un enumeratore denominato TipoProdotto che rappresenta i diversi tipi di articoli che
possono essere venduti nel negozio. Ogni TipoProdotto deve avere un nome e una
descrizione.

4. Classe Articolo:
Crea una classe denominata Articolo che estenda la classe Prodotto e implementi
l'interfaccia Sconto con i seguenti campi: id, descrizione e tipoProdotto.

5. Classe Negozio
Crea una classe chiamata Negozio che rappresenta il catalogo del negozio. La classe deve
prevedere un attributo nome e una collection per memorizzare gli articoli (lista o mappa).
Implementare i seguenti metodi:
- addArticolo: un metodo che aggiunge un articolo al catalogo del negozio.
- removeArticolo: un metodo che rimuove un articolo dal catalogo del negozio.
- getArticolo: un metodo che recupera un articolo dal catalogo del negozio per nome.
- applicaScontoPerTipo: un metodo che applica uno sconto a tutti i prodotti di un certo
TipoProdotto all’interno del catalogo.
- salvaCatalogo: un metodo che salva il catalogo in un file in un formato definito (ad
esempio csv).
- caricaCatalogo: un metodo che carica il catalogo da un file.

6. Main
All’interno del main, prova a creare alcuni oggetti Articolo aggiungendoli o rimuovendoli dal
catalogo del negozio. Provare, inoltre, a salvare e caricare il catalogo da un file.