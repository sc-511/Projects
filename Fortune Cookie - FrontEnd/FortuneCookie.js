function fortuneGenerator(){
    let fortuneCookieValue = 6;
    const fortuneValue = document.getElementById("fortuneOutput");
    const userName = document.getElementById("userInput").value;
    let randomValue = Math.floor(Math.random() * fortuneCookieValue);
    switch(randomValue){
        case 0:
            fortuneValue.innerText = userName + ", " + "It is uncertain....";
            break;
        case 1:
            fortuneValue.innerText = userName + ", " + "You will be very rich..";
            break;
        case 2:
            fortuneValue.innerText = userName + ", " + "You will live a life of unfortuante events..";
            break;
        case 3:
            fortuneValue.innerText = userName + ", " +"You will live a life of happiness...";
            break;
        case 4:
            fortuneValue.innerText = userName + ", " + "A special person will be visiting soon with great news..";
            break;
        case 5:
            fortuneValue.innerText = userName + ", " + "You will be finding yourself with a great amount of success...";
            break;
    }
}

document.addEventListener('DOMContentLoaded', () =>{
    const cookieButton = document.getElementById('cookieButton');
    cookieButton.addEventListener('click', (event) =>{
        event.preventDefault();
        fortuneGenerator();
    });
});