
# read the file in

# 23514624000
chars = IO.readlines('./input_files/008.txt').first.chomp.chars.to_a

class ProductQueue < Array
  attr_accessor :max_product

  def initialize
    @max_product = 0
  end

  def current_product
    prod = 1
    self.each { |c| prod = prod * c }
    prod
  end

  def next(i)
    self << i

    if self.count > 13
      self.shift
      if current_product > @max_product
        @max_product = current_product
      end
    end
  end
end


pq = ProductQueue.new

chars.each do |c|
  pq.next(c.to_i)
end

puts "the max product is : #{pq.max_product}"

