
// let userValue = 45;
// const celciusToFarenheit = (userValue / 5) * (9 + 32);
// const farenheitToCelcius = (userValue - 32) * (5 / 9);

var userValueInput = prompt("Please enter your temperature you wish to convert");
userValueInput = parseInt(userValueInput);
var userTypeInput = prompt("What degree is this?");

const celciusToFarenheit = (userValueInput / 5) * (9 + 32);
const farenheitToCelcius = (userValueInput - 32) * (5 / 9);
if (Number.isInteger(userValueInput) && userTypeInput.startsWith('f')){
     console.log("Here is your conversion: " + farenheitToCelcius + "C");
} else if (Number.isInteger(userValueInput) && userTypeInput.startsWith('c')){
     console.log("Here is your conversion: " + celciusToFarenheit + "F" );
} else {
     console.log("Invalid entry please try again!!!");
}
