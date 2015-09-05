class String
  def stripped
    self.gsub(/[\W-]/,'')
  end
  def stripped_length
    stripped.length
  end
end

class Fixnum
  def to_word
    s = ""
    v = self

    if v == 1000
      return "one thousand"
    end

    hundreds = (v / 100).to_i
    v -= (hundreds * 100)
    hundreds_word = "#{hundreds.to_word} hundred" if hundreds > 0

    tens = (v / 10).to_i
    v -= (tens * 10)

    ones = v
    
    ones_word = ["","one","two","three","four","five","six","seven","eight","nine"][ones]

    tens_word = case tens
                when 0
                  ""
                when 1
                  ones_word = ""
                  ["ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"][ones]
                else
                  ["","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"][tens]
                end


    res = [] 
    res += [hundreds_word] if hundreds > 0
    res += ["and"] if hundreds > 0 and (tens + ones) > 0
    res << tens_word
    res << ones_word

    res.join(" ").strip
  end
end

def sumwords(from,to)
  (from..to).map(&:to_word).map(&:stripped_length).reduce(&:+)
end

