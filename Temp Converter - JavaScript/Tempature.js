
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
     let valueOutput = doucument.querySelector("#conversionOutput");
     //alert(degreeValue + " Converting this value...");
     //alert(inputType);
     //alert(outputType);
     const celsiusToFahrenheit = (degreeValue / 5) * (9 + 32);
     const fahrenheitToCelsius = (degreeValue - 32) * (5 / 9);
     const fahrenheitToKelvin = (degreeValue -32) * (5/9) + 273.15;
     const celsiusToKelvin = (degreeValue + 273.15);
     const kelvinToFahrenheit = (degreeValue - 273.15) * (9/5) + 32;
     const kelvinToCelsius = (degreeValue - 273.15);
     if(inputType != outputType){
          if(inputType === "Fahrenheit" && outputType === "Celsius"){
               //alert(fahrenheitToCelsius + " C");
               doucument.querySelector("#conversionOutput").innerHTML = fahrenheitToCelsius + " C";
               //return fahrenheitToCelsius;
          }
          else if (inputType === "Fahrenheit" && outputType === "Kelvin"){
               alert(fahrenheitToKelvin + " K");
               return fahrenheitToKelvin;
          }
          else if (inputType === "Celsius" && outputType === "Fahrenheit"){
               alert(fahrenheitToFahrenheit + " F");
               return celsiusToFahrenheit;
          }
          else if (inputType === "Celsius" && outputType === "Kelvin"){
               alert(fahrenheitToKelvin + " K");
               return celsiusToKelvin;
          }
          else if (inputType === "Kelvin" && outputType === "Fahrenheit"){
               alert(fahrenheitToFahrenheit + " F");
               return kelvinToFahrenheit;
          }
          else {
               alert(kelvinToCelsius + " C");
               return kelvinToCelsius;
          }
     } else{
          alert(degreeValue);
          return degreeValue;
     }
}
document.addEventListener("DOMContentLoaded", () =>{
     const button = document.getElementById("convertButton");
     button.addEventListener("click", (event) =>{
          tempConvert();
     });
});