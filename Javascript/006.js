/**
The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
**/
module.exports = {
  'run': function() {
    var sumOfSquares = 0;
    var squareOfSum = 0;

    for (var i = 0; i <= 100; i++)
    {
      sumOfSquares += Math.pow(i, 2);
      squareOfSum += i;
    }

    squareOfSum = Math.pow(squareOfSum, 2);

    console.log("The difference is : " + (squareOfSum - sumOfSquares));
  }
}