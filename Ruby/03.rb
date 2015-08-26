
def fermat(n)
  if (Integer(n).even?)
    return (n / 2), 2
  end

  a = Math.sqrt(n).ceil

  b = Math.sqrt( (a * a) - n )

  while (b % 1 != 0)
    a = a + 1

    b = Math.sqrt( (a * a) - n )
  end

  return (a - b), (a + b)
end


def prime_factors(n)
  q = []
  q << n

  while true
    q.sort!
    n = q.pop

    factorA, factorB = fermat(n)

    if factorA == 1
      q << factorB
      break
    elsif factorB == 1
      q << factorA
      break
    else
      q += [factorA, factorB]
    end
  end

  q.sort!
end
