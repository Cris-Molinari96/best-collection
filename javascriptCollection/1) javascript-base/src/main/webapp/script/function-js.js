// una funzione non è altro che un blocco di codice di eseguire un compito quando viene richiamata.

// funzione classica -->
function a(){console.log("Sono una funzione classica");}

// funzione anonima -->
const b = function() {console.log("Sono una funzione anonima")} ;

// funzione arrow -->
const c = () => console.log("sono un arrow function")

// funzioni implicite arrow, vige la regole che dobbiamo scrivere il ritorno su una sola riga
const d = () => "implicit arrow"; // equivale a --> const d = () => { return console.log("arrow function")}
const e = (a,b) => (a+b);
e(5,5);


