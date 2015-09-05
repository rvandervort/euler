
bound = 4000000

it = 1
itprev = 0
sum = 0

while (it < bound)
  newit = it + itprev
  itprev = it
  it = newit

  if (it.even?)
    sum += it
  end
end

puts "The sum is: #{sum}"
