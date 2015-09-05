
class String
  def palindrome?
    is_p = true
    ch = self.gsub(/ /,"").chars.to_a
    
    compares = ch.length / 2
    back_index = ch.length - 1
    
    compares.times do |i|
      break unless is_p = (ch[i] == ch[back_index])
      back_index -= 1
    end
    
    is_p
  end
end

def calc
  largest = 0
  999.downto(100) do |a|
    999.downto(100) do |b|
      p = a * b

      if p.to_s.palindrome? && p > largest
        largest = p
      end
    end
  end

  largest
end
