def fibsum(bound):
  sum = 0
  a, b = 0,1

  while (b < bound):
    a, b = b, a + b 
    if (b % 2 == 0):
      sum += b

  return sum 

print "The fibsum is: ", fibsum(4000000)
