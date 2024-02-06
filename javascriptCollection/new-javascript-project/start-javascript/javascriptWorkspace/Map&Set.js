// Set
arraysOfNumbers = [1,2,2,1,4,3,6,4,3,6,8,9,7,6];
newSetOfDataNumbers = new Set(arraysOfNumbers);
// Conversione da un set ad un array + sort asc
newArrayOfSetNumbers = Array.from(newSetOfDataNumbers)
.sort((a,b) => {return a - b});

mySet = new Set();
mySet.add('mela');
mySet.add('pizza');
mySet.add('gelato');
mySet.add('cinema');

console.log(mySet);

function printSet(...arrays){
    for (let number of arrays) {
        console.log(number);
    }
}

printSet(...newArrayOfSetNumbers);

// Mappe

// Tipico esempio di come utilizzare una mappa in javascirpt:
// Abbiamo un carrello, dove stiamo aggiungendo degli elementi 
let carrello =  new Map();

// Chiavem , Valore
carrello.set(1,{name: 'Telefono', price:300, quantita:1});
carrello.set(2,{name: 'Tablet', price:800, quantita:1});

function aggiungiAlCarrello(id,prodotto){
    // Per le mappe possiamo verificare se è già presente
    // un determinato valore
  if(carrello.has(id)){
      let prodottoEsistente = carrello.get(id);
      prodottoEsistente.quantita += prodotto.quantita;
      
      const quantita = prodottoEsistente.quantita;
      
      prodottoEsistente.price *= quantita;
      carrello.set(id,prodottoEsistente);
  }else{
      carrello.set(id,prodottoEsistente);
  }
}

const articolo = {name:'Telefono', price:300,quantita:2}

aggiungiAlCarrello(1, articolo);

for (const value of carrello.values()) {
//    console.log('---')
//    console.log(value);
}

for (const key of carrello.keys()) {
//    console.log('---')
//    console.log(key);
}

function visualizzaCarrello(...arrays){
    for (let carrelloElement of arrays) {
//        console.log(carrelloElement);
    }
}

visualizzaCarrello(...carrello);

function deleteArticle(id,arrays){
    if(arrays.has(id)){
        arrays.delete(id);
//        console.log('Articolo rimosso', id);
        
    }else{
        console.log('Article not present');
    }
}

deleteArticle(1,carrello);
visualizzaCarrello(...carrello);