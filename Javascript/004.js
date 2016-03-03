module.exports = {
  'isPalindrome': function(number) {
    var s = number.toString();
    var l = 0, r = s.length - 1;

    while (l < r)
      if (s.charAt(l) !== s.charAt(r))
        return false;
      else
      {
         l += 1;
         r -= 1;
      }

    return true;
  },

  'run': function() {
     
     var found = false;
     var max = 0;

     for (var outer = 999; outer >= 100; outer--) 
        for (var inner = 999; inner >= 100; inner--)
           if (this.isPalindrome(outer * inner) && (outer * inner) > max)
            max = outer * inner;


     console.log("The answer is: " + max);
  }
}
