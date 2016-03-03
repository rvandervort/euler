module.exports = {
  'run': function() {
    var curr, next, prev, sum;
    sum = 0;
    prev = 1;
    curr = 2;
    next = 0;
    while (curr < 4000000) {
      if (curr % 2 === 0) {
        sum += curr;
      }
      next = prev + curr;
      prev = curr;
      curr = next;
    }
    console.log('The sum is: ' + sum);
  }
};
