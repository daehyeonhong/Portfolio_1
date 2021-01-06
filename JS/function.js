function sayHello(name, age) {
  return `Hello! ${name}, you are ${age} years old!`;
};

const greet = sayHello('Hong', 15);

console.log(greet);

const calculator = {
  plus: function (a, b) {
    return a + b;
  }, subtract: function (a, b) {
    return a - b;
  },
  multiple: function (a, b) {
    return a * b;

  }, divide: function (a, b) {
    return a / b;
  }
}

console.log(calculator.plus(5, 5));
console.log(calculator.subtract(5, 5));
console.log(calculator.multiple(5, 5));
console.log(calculator.divide(5, 5));

const title = document.getElementById('title');
console.log(title);

console.error('asd');
console.dir(title);
title.innerHTML = 'Hi! From JavaScript';
title.style.color = 'red';
console.dir(document);
document.title = 'I own you yow';
// DOM Document Object Module

const quert = document.querySelector('#title');