Crea una classe chiamata Libreria che abbia le seguenti proprietà:

     name: una stringa che rappresenta il nome della libreria.
     indirizzo: una stringa che rappresenta l'indirizzo della libreria.
     books: un array di oggetti Book che rappresenta i libri nella libreria.
     mutuatari: un array di oggetti Borrower che rappresenta i mutuatari che hanno preso in prestito libri dalla biblioteca.

La classe Library dovrebbe anche avere i seguenti metodi:

     OK-)  addBook(Book book): un metodo che aggiunge l'oggetto Book specificato all'array books.
     OK-) removeBook(Book book): un metodo che rimuove l'oggetto Book specificato dall'array books.
     ( --> Funziona <-- ) searchBooks(String query): un metodo che ricerca nell'array books i libri il cui titolo, autore o ISBN contiene la stringa di query specificata e restituisce un array di oggetti Book corrispondenti.
     OK-) addBorrower(Borrower loaner): un metodo che aggiunge l'oggetto Borrower specificato all'array dei mutuatari.
     OK-) removeBorrower(Borrower loaner): un metodo che rimuove l'oggetto Borrower specificato dall'array dei mutuatari.
     OK -)     searchBorrowers(String query): un metodo che ricerca nell'array dei mutuatari i mutuatari il cui nome o indirizzo email contiene la stringa di query specificata e restituisce un array di oggetti Borrower corrispondenti.
    (--> Sono qui <--) prestitoBook(Book libro, Mutuatario mutuatario): un metodo che contrassegna l'oggetto Book specificato come preso in prestito dall'oggetto mutuatario specificato. Questo dovrebbe aggiornare la proprietà del mutuatario dell'oggetto Book e l'array di libri presi in prestito dell'oggetto del mutuatario.
     returnBook(Book book): un metodo che contrassegna l'oggetto Book specificato come restituito. Questo dovrebbe aggiornare la proprietà del mutuatario dell'oggetto Book e l'array di libri presi in prestito dell'oggetto del mutuatario.

Crea una seconda classe chiamata Book che abbia le seguenti proprietà:

     title: una stringa che rappresenta il titolo del libro.
     author: una stringa che rappresenta l'autore del libro.
     isbn: una stringa che rappresenta l'ISBN del libro.
     mutuatario: un oggetto Borrower che rappresenta il mutuatario che ha preso in prestito il libro, o null se il libro non è attualmente preso in prestito.

La classe Book dovrebbe avere anche i seguenti metodi:

     getTitle(): un metodo che restituisce il titolo del libro.
     getAuthor(): un metodo che restituisce l'autore del libro.
     getISBN(): un metodo che restituisce l'ISBN del libro.
     getBorrower(): un metodo che restituisce l'oggetto Borrower che rappresenta il mutuatario che ha preso in prestito il libro, o null se il libro non è attualmente preso in prestito.

Crea una terza classe chiamata Borrower che abbia le seguenti proprietà:

     name: una stringa che rappresenta il nome del mutuatario.
     email: una stringa che rappresenta l'indirizzo email del mutuatario.
     loanedBooks: un array di oggetti Book che rappresenta i libri che il mutuatario ha preso in prestito dalla biblioteca.

La classe Borrower dovrebbe avere anche i seguenti metodi:

     getName(): un metodo che restituisce il nome del mutuatario.
     getEmail(): un metodo che restituisce l'indirizzo email del mutuatario.
     getBorrowedBooks(): un metodo che