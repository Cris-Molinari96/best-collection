/*Una semplice promise

// const myPromise = new Promise((resolve,reject) => {
//     console.log("generazione numero")
//     setTimeout(() => {
//         const randomNumber = Math.floor(Math.random() * 10);
//         console.log(randomNumber);
//         if(randomNumber > 8){
//             resolve(randomNumber);
//         }else{
//             reject(new Error("il numero è troppo basso"))
//         }
//     },2000)
// })
//
// myPromise.then((result) => {
//     console.log("La pormise è stata risolta")
// }).catch((error) => {
//     console.log("si è verificato un errore",error);
// })
*/

/* Una semplice async function
// const myAsy = () => {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//         const randomNumber = Math.floor(Math.random() * 10);
//         console.log(randomNumber);
//         if(randomNumber > 5){
//             resolve(randomNumber);
//         }else{
//             reject(new Error("il numero è troppo basso"))
//         }
//     },2000)
//     });
// }
//
// const b = async function myFunctionAsy(){
//     try{
//         await myAsy();
//     }catch(error){
//         console.log(error);
//     }
// }
// b();
*/
const container = document.getElementById("root");
const url = "https://jsonplaceholder.typicode.com/posts";
const errorUrl = "https://jsonplaceholder.typicode.com/po";

// viene creata una lista e in ogni tag sarà passato il titolo
function createListItem(text) {
    const li = document.createElement('li');
    li.classList.add('li-item');
    li.innerText = text;
    return li;
}

function showPost(posts) {

    if (posts && posts.length > 0) {
        // dell'array venegono presi i primi 10 item
        const first10 = posts.slice(0, 10);
        const ul = document.createElement('ul');
        // dei primi 10 risultati viene preso il titolo
        // ritornare una lista di elementi del quale viene mostrato solo il titolo
        const tempArray = first10.map(function (el) {
            return createListItem(el.title);
        });
        tempArray.forEach(item => {
            ul.appendChild(item);
        })
        container.appendChild(ul);
    }
}

// PROMISE
// const getData = () => {
//     fetch(url)
//         .then(function (result) {
//             return result.json();
//         })
//         .then(data => console.log(data))
// };

// ASYNC
const getData = async () => {
    const response = await fetch(url);
    const data = await response.json();
    showPost(data);
}

getData();

// PROMISE
// const getData = () => {
//     fetch(url)
//         .then(function (result) {
//             return result.json();
//         })
//         .then(data => console.log(data))
// };

// ASYNC
const getData = async () => {
    const response = await fetch(url);
    const data = await response.json();
    showPost(data);
}

getData();
/* Recupero valori */

// fetch -> questo metodo è in grado di effettuare una richista ad un server che ci ritornerà una risposta, e
// sarà fetch a ritornare una promise