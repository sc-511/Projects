
// let userValue = 45;
// const celciusToFarenheit = (userValue / 5) * (9 + 32);
// const farenheitToCelcius = (userValue - 32) * (5 / 9);
// var degreeValue = prompt("Please enter your temperature you wish to convert");
// degreeValue = parseInt(degreeValue);
// var userTypeInput = prompt("What degree is this?");
//if (Number.isInteger(degreeValue) && userTypeInput.startsWith('f')){
//      console.log("Here is your conversion: " + fahrenheitToCelsius + "C");
// } else if (Number.isInteger(degreeValue) && userTypeInput.startsWith('c')){
//      console.log("Here is your conversion: " + celsiusToFahrenheit + "F" );
// } else {
//      console.log("Invalid entry please try again!!!");
// }

function tempConvert(){
     let degreeValue = document.querySelector(".valueInput").value;
     let inputType = document.querySelector("#inputSelector").value;
     let outputType = document.querySelector("#outputSelector").value;
     let valueOutput = document.getElementById("conversionOutput");
     const celsiusToFahrenheit = (degreeValue / 5) * (9 + 32);
     const fahrenheitToCelsius = (degreeValue - 32) * (5 / 9);
     const fahrenheitToKelvin = (degreeValue -32) * (5/9) + 273.15;
     const celsiusToKelvin = (degreeValue + 273.15);
     const kelvinToFahrenheit = (degreeValue - 273.15) * (9/5) + 32;
     const kelvinToCelsius = (degreeValue - 273.15);
     if(inputType != outputType){
          if(inputType === "Fahrenheit" && outputType === "Celsius"){
               valueOutput.innerText = "Output: " + fahrenheitToCelsius + " C";
          }
          else if (inputType === "Fahrenheit" && outputType === "Kelvin"){
              valueOutput.innerText = "Output: " + fahrenheitToKelvin + " K";
          }
          else if (inputType === "Celsius" && outputType === "Fahrenheit"){
               valueOutput.innerText = "Output: " + celsiusToFahrenheit + " F";
          }
          else if (inputType === "Celsius" && outputType === "Kelvin"){
               valueOutput.innerText = "Output: " + celsiusToKelvin + " K";
          }
          else if (inputType === "Kelvin" && outputType === "Fahrenheit"){
              valueOutput.innerText = "Output: " + kelvinToFahrenheit + " F";
               
          }
          else {
              valueOutput.innerText = "Output: " + kelvinToCelsius + " C";             
          }
     } else{
          alert("The value stays the same. You have used the same input and output types!");
     }
}
document.addEventListener("DOMContentLoaded", () =>{
     const button = document.getElementById("convertButton");
     button.addEventListener("click", (event) =>{
          event.preventDefault();
          tempConvert();
     });
});