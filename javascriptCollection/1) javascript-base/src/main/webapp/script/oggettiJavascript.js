/*
Oggetti js base
function myFunc() {
    let myObj = {
        nome: prompt("Inserisci nome"),
        cognome: 'Imperatrice',
        eta: 30
    };
    let infoUser = `Benvenuto ${myObj.nome} ${myObj.cognome} ${myObj.eta}`;
    document.getElementById("change").innerText = infoUser;
}
*/


/*
<!-- Oggetti in javascript, sto creando un nuovo oggetto, il quale contiene quelle variabili -->
let Persona = function (nome){
    let cognome,eta;
    this.nome = 'Cristian'
}

// * creo un istanza di un oggetto
lorenzo = new Persona;

// * assegno e definisco le variabili

lorenzo.cognome="Guidotti";
lorenzo.nome="Guidotti";
lorenzo.eta="22";

console.log(lorenzo.nome)

*/


/*
Oggetti con costruttore


function Person(nome, cognome) {
    this.nome = nome;
    this.cognome = cognome;
}

let lorenzo = new Person("Lorenzo", "Guidotti");
*/

/*Prototipo degli oggetti, vengono utilizzati per aggiungere campi o metodi all'oggetto*/



// let lorenzo = new Person(prompt("Inserisci un nome"), prompt("Inserisci un cognome"), prompt("Inserisci un eta"))
// lorenzo.crescita(lorenzo.eta);
// lorenzo.color(prompt("Inserisci il colore della pelle"));

function register() {
    function crescita(anni) {
        let ann = parseInt(anni)
        let c = ann * 365;
        return `Hai ${c} giorni `;
    }

    function color(colore) {
        if(colore === "bianco"){
            return "EUROPEO";
        }else if(colore === "nero"){
            return "AFRICANO";
        }else if(colore === "giallo"){
            return "ORIENTALE";
        }else{
            return"ALIENO";
        }
    }

    function Person(nome, cognome, eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    Person.prototype.color = color;
    Person.prototype.crescita = crescita;

    let persona = new Person(prompt("Inserisci un nome"), prompt("Inserisci un cognome"), prompt("Inserisci un eta"))
    persona.crescita(persona.eta);
    document.getElementById('change').innerText = `Benvenuto ${persona.nome} ${persona.cognome} ${persona.crescita(persona.eta)} ${persona.color(prompt("Inserisci il colore della pelle").toLocaleLowerCase())}`
}