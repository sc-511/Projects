let userName = 'Shane';

console.log("Welcome to the fortune cookie!");
console.log("Let the fortune cookie choose your destiny");

let fortuneCookieValue = 5;
let questionToAsk = "What will my future look like?...";
switch(Math.random() * fortuneCookieValue){
    case 0:
        console.log("It is uncertain....");
        break;
    case 1:
        console.log("You will be very rich..");
        break;
    case 2:
        console.log("You will live a life of unfortuante events..");
        break;
    case 3:
        console.log("You will live a life of happiness...");
        break;
    case 4:
        console.log("A special person will be visiting soon with great news..");
        break;
    case 5:
        console.log("You will be finding yourself with a great amount of success...");
        break;
}
console.log("Thank you for playing!");