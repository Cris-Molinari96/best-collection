// Partendo dal fatto che le funzioni in js sono obj

/* ! function pura in javascript
// 1) ritornane qualcosa
// 2) modificare i dati

let result;

function add(n1, n2) {
     result = n1 + n2;
    // alert(`il risultato è \`${result}\``)
}
add(5,5)
console.log(result);
*/


/* * esempio: shadow variables
// consiste nel ridefinire una variabile dentro una funzione

let userName = "max"

function myName(name){
    let userName = name;
    console.log(userName);
}
myName("sono dentro");
userName = "sono fuori";

console.log(userName);
*/


/* * In js un'espressione è qualcosa che produce un valore il quale può essere memorizzato
in una variabile o const, o meglio possiamo considerare tutto ciò che può essere messo
dopo un segno di = questo per dire che un if è solo un instruzione o un affermazione
*/


/* * Metodo in javascript --> in js un metodo è una funzione che viene memorizzata in un oggetto
* infatti un metodo non è altro che una funziona collegata ad una proprietà dell'oggetto.
const myObj = {
    saluta: function hello(){
        console.log("Ciaooo");
    }
}

myObj.saluta();
*/


/* * Function affermazione ossia quando viene assegnata ad una variabile, una funzione
const hello = function saluta() {
    console.log("ciaoo")
}
console.log()
*/


/* ! Funzioni anonime, sto utilizzando un arrow function in un ascoltatore di eventi
let myBtn = document.getElementById("bottone");
myBtn.addEventListener('click', () => {
    console.log("Ciaoo");
})
 */


/* array codice prova:
* stiamo generando un array dentro il quale aggiungiamo numeri
* tutti i numeri pari saranno scartati
* successivamente sommiamo tutti i numeri che sono presenti nell'array

function popolaArray() {
    let array = [];
    for (let i = 0; i < 10; i++) {
        let num = Math.floor(Math.random() * 10);
        if(num % 2 == 0){
            console.log("numeri pari" + num)
            continue;
        }
        array.push(num);
    }
    return array
}

popolaArray();

let numArray = popolaArray();

let somma = 0;

function mySum() {
    numArray.forEach(n => {
        console.log("numeri in numArray" + n)
        somma = somma + n;
        return somma;
    });
}
mySum();
console.log(somma);
*/


/* ! Funzioni ASINCRONE --> una funzione ascincrona è quella funzione che non sospenderà l'esecuzione di altre funzioni nello stack
* setTimeout(una funzione,un tempo in ms) ovvero accetta una funzione da eseguire allo scadere del tempo in ms
Ricorda che se ci fosse come in questo caso una funzione,
questa dovrà essere eseguita prima di passare all'istruzione successiva

function stoBollendo(time){
    for (let i = 0 ; i < time ; i++){
        console.log("Sono impegnato ancora")
    }
}

const bolle = (time) => {
    console.log('bollendo');
    setTimeout(function(){
        console.log('fatto');
    },time);
};

stoBollendo(1000);
bolle(1000)
*/


/* * setTimeout codice prova:

function stoBollendo(time){
    for (let i = 0 ; i < time ; i++){
        console.log("Sono impegnato ancora")
    }
}

function mettoLaPasta(){
    console.log('butto la pasta')
}

const bolle = (time) => {
    console.log('bollendo');
    setTimeout(stoBollendo(time), 5000)
    setTimeout(mettoLaPasta,3000);
};

bolle(2000);
*/


/* * setTimeout() + clearTimeout() codice prova:
* il valore di ritorno di una setTimeout è l'id
const tempo = (time) => {
    console.log("Sto bollendo")
    return setTimeout(function () {
        console.log("FATTO")
    }, time)
}

function stoppableTimer() {
    let timerid = tempo(5000);

    for (let i = 0; i < 5000; i++) {
        if (i == 2000) {
            clearTimeout(timerid);
            console.log(`id timer: ${timerid} tempo: ${i}`)
            break;
        }
    }
}
stoppableTimer();
*/


/* ! setTimeout codice prova
// per ogni setTimeOut, aspettare che un azione finisca nel
// mentre viene eseguita qualche altra azione

const makeZuppa = function () {
    console.log("deve bollire l'acqua");
    setTimeout(() => {

        console.log("L'acqua bolle")
        setTimeout(() => {
            console.log("zuppa pronta");
        }, 1000)
        console.log("butto le carote")
        console.log("butto le carote")
    }, 10000)

        console.log("taglio le carote")
        console.log("taglio le cipolle")


    setTimeout(() => {
        console.log("carote tagliate ")
        console.log("cipolle tagliate")
    },2000)

}

makeZuppa();
*/


/* ! Promise()
Una promise è un patto che viene fatto da js e il browser
in cui si promette che si andrà poi a svolgere una determinata serie di azioni di
cui al momento però non si conosce effettivamente il risultato o lo Stato.

ha tre stati > rejected -> valore indefinito,
               fulfilled -> valore definito,
               pending -> valore indefinito


1) esempio
const promise = new Promise((resolve, reject) => {
   * let value = "test"; --> test se avrà un return true sarà risolto che può essere passato alla riga 236
   * // let value; --> altrimenti entrerà nel blocco else
   * if(value) resolve(value);
   * else reject("c'è stato un problema");
});

// posso accedere al valore della mia promise, con il metodo then()
// then() -> accetta un parametro dentro il quale sarà passato il valore della promise
// in questo modo abbiamo accesso la valore della promise

//
// promise.then((result)=>{
//     console.log(result);
// }).catch((error)=>{
//     error = "c'è stato un problema";
//     console.log(error);
// })

// 2) esempio, ad un then posso ritornare un risultato e accedervi con un altro .then
* promise.then((result)=>{
    console.log(result)
    return "ciao";
}).then(result => console.log(result))
    .catch((error)=>{
    error = "c'è stato un problema";
    console.log(error);
})
// console.log(promise);

// 3) esempio
// let firstLet = "Cristian";
// let firstLet;

const myPromise = () => {
    return new Promise((resolve, reject) => {
        if(firstLet) resolve(firstLet);
        else reject()
    })
}

myPromise().then((result)=>{
    console.log(result)
}).catch((err) => {
    err = "c'è stato un problema";
    console.log(err);
})

 4) esempio
const acquaBollita = () => {
    console.log("Sta bollendo")
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Acqua bollita")
            resolve();
        }, 1000);
    });
}

const buttaLaPasta = () => {
    console.log("butto la pasta")
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("pasta pronta")
            resolve();
        }, 1000);
    });
}

const impiattamento = () => {
    console.log("Prendo il piatto")
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("Impiatto")
            resolve();
        }, 1000);
    });
}

const makePiattoDiPasta = () => {
    acquaBollita().then(buttaLaPasta).then(impiattamento).finally(() => {
        console.log("piatto terminata")
    });
};

makePiattoDiPasta();
*/


/* ! Async await aspetterà l'esito di tutto il blocco di codice scritto tra {} e poi eseguira un eventuale log o altro codice
se prensente nel blocco {}

// let eBollita ;
// const primaPreparazione = () => {
//     return new Promise((resolve, reject) => {
//
//         setTimeout(() => {
//             console.log("Deve bollire l'acqua");
//
//             setTimeout(() => {
//                 setTimeout(() => {
//                     console.log("Acqua bollita")
//                     eBollita = true;
//                     resolve();
//                 }, 10000);
//
//                 console.log("taglio le carote");
//                 setTimeout(() => {
//                     console.log("Friggo le carote");
//                 }, 2000)
//
//                 console.log("taglio le cipolle");
//                 setTimeout(() => {
//                     console.log("Friggo le cipolle");
//                 }, 2000)
//
//                 setTimeout(() => {
//                     console.log("unisco le due preparazioni");
//                 }, 2000)
//             })
//         })
//     })
// }
//
// const secondaPerparazione = () => {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             setTimeout(() => {
//                 if (eBollita) {
//                     console.log("butto la pasta")
//                     resolve();
//                 } else {
//                     console.log("Aspetta ancora")
//                 }
//             })
//         },1000)
//     })
// }
//
// const final = () => {
//     return new Promise((resolve,reject) => {
//         console.log("impiattamento");
//         setTimeout(() => {
//             console.log("piatto terminato")
//         }, 5000)
//     })
// }

// ! promise.Then(promiseFunction()).then(promiseFunction()).catch().finally
// const preparaIlpiatto = () => {
//     primaPreparazione().then(secondaPerparazione).finally(() => {
//         console.log("impiattamento")
//         setTimeout(() => {
//             console.log("piatto terminato");
//         },5000)
//     })
// }

// * async function --> stesso risultato di then
// const preparaIlPiatto = async () => {
//     await primaPreparazione();
//     await secondaPerparazione();
//     await final();
//     console.log("Serviceeeee"); --> solo dopo che ha eseguito tutte le altre funzioni
// }
//
// preparaIlPiatto();
*/


/* * async esempio
const bolle = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            console.log("l'acqua bolle");
            resolve();
        }, 1000);
    });
}

const buttoLaPasta = () => {
    return new Promise((res, rej) => {
        setTimeout(() => {
            console.log("butto la pasta");
            res();
        }, 2000);
    });
}

const stop = () => {
    return new Promise((_, reject) => {
        let error = "C'è un problema"
        reject(error);
    }, 1000)
}

const impiattamento = () => {
    return new Promise((resolve, reject) => {

        setTimeout(() => {
            console.log("impiattamento");
        }, 100);
    });
};

const serata = async () => {

    try {
        await bolle();
        await buttoLaPasta();
        await stop();
        await impiattamento();
    } catch (error) {
        console.log(error)
    } finally {
        console.log("tutto finito");
    }
}

serata();
*/