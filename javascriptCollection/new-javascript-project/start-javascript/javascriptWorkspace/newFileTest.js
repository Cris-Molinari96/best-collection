// Easy function with parameter
function add(num1,num2){
    let sum = 0;
    return sum = num1+num2;
}
const result = add(55,21);
console.log(result);

// Call back function

function first(callBack){
    return 'Ciao sono ' + callBack;
}

function getName(){
    return 'Cristian'
}

const presentation = first(getName());
console.log(presentation);