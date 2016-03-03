module.exports = {
  'run': function() {
    var i, j, sum;
    sum = 0;
    i = 0;
    j = 1000;
    while (i < j) {
      if (i % 3 === 0 || i % 5 === 0) {
        sum += i;
      }
      i++;
    }
    console.log('The sum is: ' + sum);
  }
};
