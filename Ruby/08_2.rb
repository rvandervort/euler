# 23514624000
def loop(chars, startPos, endPos, currentMax)
  if endPos > chars.length
    currentMax
  else
    prod = chars[startPos...endPos].reduce(1) { |prod, i| prod = prod * i; prod }

    if prod == 2091059712
      puts chars[startPos...endPos].join(",")
    end

    loop(chars, startPos + 1, endPos + 1, [prod, currentMax].max)
  end
end

def maxProduct(charArray, subLen)
  loop(charArray, 0,subLen,0)
end

chars = IO.readlines('008.txt').first.chomp.chars.to_a.map(&:to_i)

puts "the max product is : #{maxProduct(chars, 13)}"
