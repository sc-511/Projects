function fortuneGenerator(){
    let fortuneCookieValue = 6;
    const fortuneValue = document.getElementById("fortuneOutput");
    const userName = document.getElementById("userInput").value;
    let randomValue = Math.random() * fortuneCookieValue;
    switch(randomValue){
        case 0:
            document.getElementById("fortuneOutput").innerHTML= userName + ", " + "It is uncertain....";
            console.log("inside case zero");
             break;
        case 1:
            fortuneValue.innerHTML = userName + ", " + "You will be very rich..";
            break;
        case 2:
            fortuneValue.innerHTML = userName + ", " + "You will live a life of unfortuante events..";
            break;
        case 3:
            fortuneValue.innerHTML = userName + ", " +"You will live a life of happiness...";
            break;
        case 4:
            fortuneValue.innerHTML = userName + ", " + "A special person will be visiting soon with great news..";
            break;
        case 5:
            fortuneValue.innerHTML = userName + ", " + "You will be finding yourself with a great amount of success...";
            break;
        default:
             console.log("an error has occured");
             break;
        }
}

document.addEventListener('DOMContentLoaded', () =>{
    const cookieButton = document.getElementById('cookieButton');
    cookieButton.addEventListener('click', (event) =>{
        fortuneGenerator();
    });
});