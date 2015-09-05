
class Fixnum
  def sorted_chars
    self.to_s.chars.sort
  end

  def string_equal(other)
    self.sorted_chars == other.sorted_chars
  end

  def t(o)
    self * o
  end
end


def calc
  found = false

  current = 1
  while found == false
    v = current.sorted_chars

    (2..6).each do |m|
      found = (v == current.t(m).sorted_chars)
      break unless found
    end
    
    if found
      return current
    end

    current += 1
  end
end
